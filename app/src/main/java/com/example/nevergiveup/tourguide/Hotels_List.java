package com.example.nevergiveup.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Hotels_List extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour);
//create list of hotels and thier address
        ArrayList<Guide> guide = new ArrayList<Guide>();

        guide.add(new Guide(getString(R.string.hotel1_add), getString(R.string.hotel1_name), R.drawable.double1));
        guide.add(new Guide(getString(R.string.hotel2_add), getString(R.string.hotel2_name), R.drawable.marriort));
        guide.add(new Guide(getString(R.string.hotel3_add), getString(R.string.hotel3_name), R.drawable.courtland));
        guide.add(new Guide(getString(R.string.hotel4_add), getString(R.string.hotel4_name), R.drawable.sheraton));
        guide.add(new Guide(getString(R.string.hotel5_add), getString(R.string.hotel5_name), R.drawable.comfort));
        guide.add(new Guide(getString(R.string.hotel6_add), getString(R.string.hotel6_name), R.drawable.cambridge));
        guide.add(new Guide(getString(R.string.hotel7_add), getString(R.string.hotel7_name), R.drawable.soho));
        guide.add(new Guide(getString(R.string.hotel8_add), getString(R.string.hotel8_name), R.drawable.ritz));
        guide.add(new Guide(getString(R.string.hotel9_add), getString(R.string.hotel9_name), R.drawable.one));
        guide.add(new Guide(getString(R.string.hotel10_name), getString(R.string.hotel10_name), R.drawable.tower));

        // Create an {@link GuideAdapter}, whose data source is a list of {@link Guide}s. The
        // adapter knows how to create list items for each item in the list.
        GuideAdapter itemsAdapter = new GuideAdapter(this, guide, R.color.Hotels_color);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_guide.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the {@link ListView} use the {@link GuideAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Guide} in the list.

        listView.setAdapter(itemsAdapter);


    }
}
