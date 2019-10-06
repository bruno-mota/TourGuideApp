package com.example.bruno.tourguide;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
public class Transportation_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);
        ArrayList<Info> infos = new ArrayList<Info>();
        infos.add(new Info(getString(R.string.path_name), getString(R.string.path_address), getString(R.string.path_info), getString(R.string.path_more)));
        infos.add(new Info(getString(R.string.penn_name), getString(R.string.penn_address), getString(R.string.penn_phone), getString(R.string.penn_info)));
        InfoAdapter adapter = new InfoAdapter(this, infos, R.color.category_transportation);
        ListView listView = (ListView) findViewById(R.id.info_list);
        listView.setAdapter(adapter);
    }
}
