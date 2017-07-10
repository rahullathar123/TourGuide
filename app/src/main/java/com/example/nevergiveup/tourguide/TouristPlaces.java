package com.example.nevergiveup.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class TouristPlaces extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour);
//add the touristplace info
        ArrayList<Guide> guide = new ArrayList<Guide>();

        guide.add(new Guide(getString(R.string.tourist1_name), getString(R.string.tourist1_add), R.drawable.cn));
        guide.add(new Guide(getString(R.string.tourist2_name), getString(R.string.tourist2_add), R.drawable.hockey));
        guide.add(new Guide(getString(R.string.tourist3_name), getString(R.string.tourist3_add), R.drawable.royal));
        guide.add(new Guide(getString(R.string.tourist4_name), getString(R.string.tourist4_add), R.drawable.art));
        guide.add(new Guide(getString(R.string.tourist5_name), getString(R.string.tourist5_add), R.drawable.aquarium));
        guide.add(new Guide(getString(R.string.tourist6_name), getString(R.string.tourist6_add), R.drawable.island));
        guide.add(new Guide(getString(R.string.tourist7_name), getString(R.string.tourist7_add), R.drawable.eaton));
        guide.add(new Guide(getString(R.string.tourist8_name), getString(R.string.tourist8_add), R.drawable.science));
        guide.add(new Guide(getString(R.string.tourist9_name), getString(R.string.tourist9_add), R.drawable.union));
        guide.add(new Guide(getString(R.string.tourist10_name), getString(R.string.tourist10_add), R.drawable.allan));
        guide.add(new Guide(getString(R.string.tourist11_name), getString(R.string.tourist11_add), R.drawable.casa));
        guide.add(new Guide(getString(R.string.tourist12_name), getString(R.string.tourist12_add), R.drawable.water));

// Make the {@link ListView} use the {@link GuideAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Guide} in the list.
        GuideAdapter itemsAdapter = new GuideAdapter(this, guide, R.color.Tourist_color);
// Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_guide.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the {@link ListView} use the {@link GuideAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Guide} in the list.

        listView.setAdapter(itemsAdapter);
    }
}
