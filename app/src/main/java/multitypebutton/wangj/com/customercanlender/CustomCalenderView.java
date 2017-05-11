package multitypebutton.wangj.com.customercanlender;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.Calendar;
import java.util.List;

/**
 * 当前类注释：自定义日历View
 * <p>
 * Author :LeonWang <p>
 * Created  2017/5/10.15:47 <p>
 * Description:
 * <p>
 * E-mail:lijiawangjun@gmail.com
 */

public class CustomCalenderView extends LinearLayout {


    private ImageButton mBtPrev;
    private ImageButton mBtNext;
    private AppCompatTextView mTvDate;
    private GridView mCalender;

    private Calendar curDate = Calendar.getInstance();
    private CalendarAdapter mAdapter;
    private CalendarUtil mCalendarTool;
    private List<DateEntity> mDateEntityList;
    private CalendarCallback mCalendarCallback;

    public CustomCalenderView(Context context) {
        super(context);
    }

    public CustomCalenderView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initControl(context);
    }

    public CustomCalenderView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initControl(context);
    }

    private void initControl(Context context) {
        LayoutInflater.from(context).inflate(R.layout.customer_view_layout, this);
        mBtPrev = (ImageButton) findViewById(R.id.bt_prev);
        mBtNext = (ImageButton) findViewById(R.id.bt_next);
        mTvDate = (AppCompatTextView) findViewById(R.id.tv_date);
        mCalender = (GridView) findViewById(R.id.calender_grid);
        mCalendarTool = new CalendarUtil(context);
        initEvent();
        renderCalendar();
    }

    private void initEvent() {

        mBtPrev.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                curDate.add(Calendar.MONTH, -1);
                renderCalendar();
            }
        });

        mBtNext.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                curDate.add(Calendar.MONTH, 1);
                renderCalendar();
            }
        });

        mCalender.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (mDateEntityList != null) {
                    DateEntity dateEntity = mDateEntityList.get(position);
                    if (null != mCalendarCallback) {
                        mCalendarCallback.onItemClick(dateEntity);
                    }
                }
            }
        });
    }


    /**
     * 渲染控件
     */
    private void renderCalendar() {
        int year = curDate.get(Calendar.YEAR);
        int month = curDate.get(Calendar.MONTH) + 1;
        mTvDate.setText(year + "-" + month);
        mDateEntityList = mCalendarTool.getDateEntityList(year, month);
        mAdapter = new CalendarAdapter(getContext(), mDateEntityList);
        mCalender.setAdapter(mAdapter);

        if (null != mCalendarCallback) {
            mCalendarCallback.onSlide(year, month);
        }
    }


    /**
     *
     */
    public void setData(@NonNull List<DateEntity> dates) {
        if (mAdapter != null)
            mAdapter.setSignData(dates);
    }

    public void setCalenderListener(CalendarCallback callback) {
        mCalendarCallback = callback;
    }

}
