package com.example.bruno.tourguide;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
public class Hotel extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);
        ArrayList<Info> infos = new ArrayList<Info>();
        infos.add(new Info(getString(R.string.best_western_name), getString(R.string.best_western_address), getString(R.string.best_western_phone), getString(R.string.best_western_info), R.drawable.best_western));
        infos.add(new Info(getString(R.string.hotel_indigo_name), getString(R.string.hotel_indigo_address), getString(R.string.hotel_indigo_phone), getString(R.string.hotel_indigo_info), R.drawable.hotel_indigo));
        infos.add(new Info(getString(R.string.comfort_name), getString(R.string.comfort_address), getString(R.string.comfort_phone), getString(R.string.comfort_info), R.drawable.comfort_suites));
        infos.add(new Info(getString(R.string.element_name), getString(R.string.element_address), getString(R.string.element_phone), getString(R.string.element_info), R.drawable.element_harrison));
        infos.add(new Info(getString(R.string.hillton_name), getString(R.string.hillton_address), getString(R.string.hillton_phone), getString(R.string.hillton_info), R.drawable.hillton_penn));
        infos.add(new Info("Courtyard by Marriott", "858 Broad St, Newark, NJ 07102", "(222)222-2222", "$81", R.drawable.courtyard_marriott));
        InfoAdapter adapter = new InfoAdapter(this, infos, R.color.category_hotel);
        ListView listView = (ListView) findViewById(R.id.info_list);
        listView.setAdapter(adapter);
    }
}
