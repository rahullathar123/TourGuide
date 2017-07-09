package com.example.nevergiveup.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.id.button1;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       TextView button1= (TextView) findViewById(R.id.tourist);
        TextView button2 = (TextView) findViewById(R.id.parks);
        TextView button3 = (TextView) findViewById(R.id.restuarant);
        TextView button4 = (TextView) findViewById(R.id.hotel);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1= new Intent(MainActivity.this,TouristPlaces.class);
                startActivity(int1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2 = new Intent(MainActivity.this,ParksList.class);
                startActivity(int2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3 = new Intent(MainActivity.this,Restaurants.class);
                startActivity(int3);
     }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4 = new Intent(MainActivity.this,Hotels_List.class);
                startActivity(int4);
            }
        });


    }
}
