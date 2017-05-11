package multitypebutton.wangj.com.customercanlender;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;

import java.util.List;

/**
 * 当前类注释：日历适配器
 * <p>
 * Author :LeonWang <p>
 * Created  2017/5/10.16:13 <p>
 * Description:
 * <p>
 * E-mail:lijiawangjun@gmail.com
 */

public class CalendarAdapter extends BaseAdapter {

    private List<DateEntity> mDatas;
    private List<DateEntity> mSignDatas;
    private Context mContext;

    public CalendarAdapter(Context context, List<DateEntity> dateEntities) {
        this.mContext = context;
        mDatas = dateEntities;
    }

    public void setSignData(@NonNull List<DateEntity> datas) {
        mSignDatas = datas;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return mDatas != null ? mDatas.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;

        DateEntity dateEntity = (DateEntity) getItem(position);

        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(mContext).inflate(R.layout.calendar_item, null);
            viewHolder.mRlDay = (RelativeLayout) convertView.findViewById(R.id.rl_day);
            viewHolder.tvDay = (AppCompatTextView) convertView.findViewById(R.id.tv_day);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.tvDay.setText(dateEntity.day + "");


        // 是否为本月的号数，不是本月号数显示白色，及不显示
        if (!dateEntity.isSelfMonthDate) {
            viewHolder.tvDay.setTextColor(Color.GRAY);
//            viewHolder.tvDay.setBackgroundResource(R.drawable.ic_hollow_circle);
        } else {
            if (mSignDatas != null && mSignDatas.size() > 0) {
                for (DateEntity signData : mSignDatas) {
                    if (dateEntity.year == signData.year &&
                            dateEntity.month == signData.month &&
                            dateEntity.day == signData.day) {
                        //1，签到，2补签
//                        viewHolder.tvDay.setBackgroundResource(R.drawable.ic_hollow_sign_circle);
                        if (signData.dayType == 1) {
                            viewHolder.tvDay.setBackgroundResource(R.drawable.ic_hollow_sign_circle);
                        } else if (signData.dayType == 2) {
                            viewHolder.tvDay.setBackgroundResource(R.drawable.ic_hollow_circle);
                        }
                    }
                }
            }
        }

        if (dateEntity.isNowDate && dateEntity.isSelfMonthDate) {
            viewHolder.tvDay.setTextColor(Color.RED);
            viewHolder.tvDay.setBackgroundResource(R.drawable.ic_brightness_1_black_24dp);
        }

        return convertView;
    }

    class ViewHolder {
        public AppCompatTextView tvDay;
        public RelativeLayout mRlDay;
    }
}
