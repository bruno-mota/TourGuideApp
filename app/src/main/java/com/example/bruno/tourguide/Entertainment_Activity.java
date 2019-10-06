package com.example.bruno.tourguide;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
public class Entertainment_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);
        ArrayList<Info> infos = new ArrayList<Info>();
        infos.add(new Info(getString(R.string.red_bull_name), getString(R.string.red_bull_address), getString(R.string.red_bull_phone), getString(R.string.red_bull_info)));
        infos.add(new Info(getString(R.string.nj_arts_center_name), getString(R.string.nj_arts_center_address), getString(R.string.nj_arts_center_phone), getString(R.string.nj_arts_center_info)));
        infos.add(new Info(getString(R.string.bowling_name), getString(R.string.bowling_address), getString(R.string.bowling_info), getString(R.string.bowling_info)));
        infos.add(new Info(getString(R.string.red_bull_name), getString(R.string.red_bull_address), getString(R.string.red_bull_phone), getString(R.string.red_bull_info)));
        infos.add(new Info(getString(R.string.hudson_name), getString(R.string.hudson_address), getString(R.string.hudson_info), getString(R.string.hudson_more_info)));
        infos.add(new Info(getString(R.string.la_name), getString(R.string.la_address), getString(R.string.la_phone), getString(R.string.la_info)));
        InfoAdapter adapter = new InfoAdapter(this, infos, R.color.category_entertainment);
        ListView listView = (ListView) findViewById(R.id.info_list);
        listView.setAdapter(adapter);
    }
}
