package com.example.nevergiveup.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour);
//add the parks info
        ArrayList<Guide> guide = new ArrayList<Guide>();

        guide.add(new Guide(getString(R.string.park1_name), getString(R.string.park1_add)));
        guide.add(new Guide(getString(R.string.park2_name), getString(R.string.park2_add)));
        guide.add(new Guide(getString(R.string.park3_name), getString(R.string.park3_add)));
        guide.add(new Guide(getString(R.string.park4_name), getString(R.string.park4_add)));
        guide.add(new Guide(getString(R.string.park5_name), getString(R.string.park5_add)));
        guide.add(new Guide(getString(R.string.park6_name), getString(R.string.park6_add)));
        guide.add(new Guide(getString(R.string.park7_name), getString(R.string.park7_add)));
        guide.add(new Guide(getString(R.string.park8_name), getString(R.string.park8_add)));
        guide.add(new Guide(getString(R.string.park9_name), getString(R.string.park9_add)));
        guide.add(new Guide(getString(R.string.park10_name), getString(R.string.park10_add)));
        guide.add(new Guide(getString(R.string.park11_name), getString(R.string.park11_add)));


        // Make the {@link ListView} use the {@link GuideAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Guide} in the list.

        GuideAdapter itemsAdapter = new GuideAdapter(this, guide, R.color.Park_color);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_guide.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the {@link ListView} use the {@link GuideAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Guide} in the list.

        listView.setAdapter(itemsAdapter);


    }
}
