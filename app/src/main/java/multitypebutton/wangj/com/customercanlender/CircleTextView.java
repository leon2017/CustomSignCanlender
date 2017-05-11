package multitypebutton.wangj.com.customercanlender;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * 当前类注释：
 * <p>
 * Author :LeonWang <p>
 * Created  2017/5/10.18:23 <p>
 * Description:
 * <p>
 * E-mail:lijiawangjun@gmail.com
 */

public class CircleTextView extends AppCompatTextView {

    public int dayType = 0;//0普通,1，签到，2补签，3当日
    private Paint signPaint = new Paint();
    private Paint todayPaint = new Paint();
    private Paint againSignPaint = new Paint();
    private Paint dotPaint = new Paint();

    public CircleTextView(Context context) {
        super(context);
    }

    public CircleTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public CircleTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }


    private void initView(Context context) {
        initSignCircle();
        initTodayCircle();
        initAgainSignCircle();
    }


    /**
     * 签到圆
     */
    private void initSignCircle() {
        signPaint.setStyle(Paint.Style.STROKE);
        signPaint.setColor(Color.BLUE);
    }

    /**
     * 当日圆
     */
    private void initTodayCircle() {
        todayPaint.setColor(Color.RED);
        todayPaint.setAntiAlias(true);
    }


    /**
     * 补签圆
     */
    private void initAgainSignCircle() {

    }
}
