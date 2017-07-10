package com.example.nevergiveup.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour);
// add the restuarant info
        ArrayList<Guide> guide = new ArrayList<Guide>();

        guide.add(new Guide(getString(R.string.rest1_name), getString(R.string.rest1_add)));
        guide.add(new Guide(getString(R.string.rest2_name), getString(R.string.rest2_add)));
        guide.add(new Guide(getString(R.string.rest3_name), getString(R.string.rest3_add)));
        guide.add(new Guide(getString(R.string.rest4_name), getString(R.string.rest4_add)));
        guide.add(new Guide(getString(R.string.rest5_name), getString(R.string.rest5_add)));
        guide.add(new Guide(getString(R.string.rest6_name), getString(R.string.rest6_add)));
        guide.add(new Guide(getString(R.string.rest7_name), getString(R.string.rest7_add)));
        guide.add(new Guide(getString(R.string.rest8_name), getString(R.string.rest8_add)));
        guide.add(new Guide(getString(R.string.rest9_name), getString(R.string.rest9_add)));
        guide.add(new Guide(getString(R.string.rest10_name), getString(R.string.rest10_add)));
        guide.add(new Guide(getString(R.string.rest11_name), getString(R.string.rest11_add)));

// Make the {@link ListView} use the {@link GuideAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Guide} in the list.
        GuideAdapter itemsAdapter = new GuideAdapter(this, guide, R.color.Restuarant_color);
// Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_guide.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the {@link ListView} use the {@link GuideAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Guide} in the list.

        listView.setAdapter(itemsAdapter);


    }
}
