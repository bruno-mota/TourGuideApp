package com.example.bruno.tourguide;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
public class Restaurants_Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);
        ArrayList<Info> infos = new ArrayList<Info>();
        infos.add(new Info(getString(R.string.chinatown_name), getString(R.string.chinatown_address), getString(R.string.chinatown_phone), getString(R.string.chinatown_info)));
        infos.add(new Info(getString(R.string.lafimma_name), getString(R.string.lafimma_address), getString(R.string.lafimma_phone), getString(R.string.lafimma_info)));
        infos.add(new Info(getString(R.string.zrolls_name), getString(R.string.zrolls_address), getString(R.string.zrolls_phone), getString(R.string.zrolls_info)));
        infos.add(new Info(getString(R.string.sarku_address), getString(R.string.sarku_address), getString(R.string.sarku_phone), getString(R.string.sarku_info)));
        infos.add(new Info(getString(R.string.lena_name), getString(R.string.lena_address), getString(R.string.lena_phone), getString(R.string.lena_info)));
        InfoAdapter adapter = new InfoAdapter(this, infos, R.color.category_restaurants);
        ListView listView = (ListView) findViewById(R.id.info_list);
        listView.setAdapter(adapter);
    }
}
