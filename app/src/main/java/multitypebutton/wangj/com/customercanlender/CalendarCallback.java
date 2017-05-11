package multitypebutton.wangj.com.customercanlender;

/**
 * 当前类注释：
 * <p>
 * Author :LeonWang <p>
 * Created  2017/5/11.9:00 <p>
 * Description:
 * <p>
 * E-mail:lijiawangjun@gmail.com
 */

public interface CalendarCallback {

    void onItemClick(DateEntity dateEntity);

    void onSlide(int  year ,int month);
}
