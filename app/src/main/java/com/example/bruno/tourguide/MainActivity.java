package com.example.bruno.tourguide;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView hotel = (TextView) findViewById(R.id.hotels);
        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, Hotel.class);
                startActivity(numbersIntent);
            }
        });
        TextView park = (TextView) findViewById(R.id.parks);
        park.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, Transportation_Activity.class);
                startActivity(familyIntent);
            }
        });
        TextView entertainment = (TextView) findViewById(R.id.entertainment);
        entertainment.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, Entertainment_Activity.class);
                startActivity(colorsIntent);
            }
        });
        TextView restaurants = (TextView) findViewById(R.id.restaurant);
        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, Restaurants_Activity.class);
                startActivity(phrasesIntent);
            }
        });
    }
}
