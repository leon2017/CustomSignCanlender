package multitypebutton.wangj.com.customercanlender;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private CustomCalenderView mCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        mCalendar = (CustomCalenderView) findViewById(R.id.calendar);

    }

    private void initData() {

        List<DateEntity> dateEntities = new ArrayList<>();
        try {
            JSONObject jsonObject = new JSONObject(MockJson.SignDate);
            JSONArray customerSignInfos = jsonObject.getJSONArray("customerSignInfos");
            for (int i = 0; i < customerSignInfos.length(); i++) {
                JSONObject json = customerSignInfos.getJSONObject(i);
                DateEntity dateEntity = new DateEntity();
                String signTime = json.getString("signTime");
                String[] ymd = signTime.split(" ");
                String[] result = ymd[0].split("-");
                dateEntity.year = Integer.parseInt(result[0]);
                dateEntity.month = Integer.parseInt(result[1]);
                dateEntity.day  = Integer.parseInt(result[2]);
                dateEntity.dayType = TextUtils.equals(json.getString("signTypes"), "resign") ? 2 : 1;
                dateEntities.add(dateEntity);
            }
            mCalendar.setData(dateEntities);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
