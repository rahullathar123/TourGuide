package com.example.nevergiveup.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour);
// add the restuarant info
        ArrayList<Guide> guide = new ArrayList<Guide>();

        guide.add(new Guide("Scaramouche Restaurant","1 Benvenuto Pl, Toronto, ON M4V 2L1"));
        guide.add(new Guide("The Keg Mansion","515 Jarvis St, Toronto, ON M4Y 2H7"));
        guide.add(new Guide("George Restaurant","111C Queen St E, Toronto, ON M5C 1S2"));
        guide.add(new Guide("Blu Ristorante & Lounge","17 Yorkville Ave, Toronto, ON M4W 1L1"));
        guide.add(new Guide("The Senator Restaurant"," 249 Victoria St, Toronto, ON M5B 1V8"));
        guide.add(new Guide("The Elm Tree Restaurant","43 Elm St, Toronto, ON M5G 1H1"));
        guide.add(new Guide("Sunset Grill"," 1 Richmond St W, Toronto, ON M5H 3W4"));
        guide.add(new Guide("Carisma Restaurant","73 King St E, Toronto, ON M5C 1G3"));
        guide.add(new Guide("Eggspectation"," 20 Albert St, Toronto, ON M5G 2C9"));
        guide.add(new Guide("Richmond Station","1 Richmond St W, Toronto, ON M5H 3W4"));
        guide.add(new Guide("Beerbistro"," 18 King St E, Toronto, ON M5C 1C4"));
        guide.add(new Guide("The Keg "," the 17a, 26 The Esplanade, Toronto, ON M5E 1A1"));

// Make the {@link ListView} use the {@link GuideAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Guide} in the list.
        GuideAdapter itemsAdapter = new GuideAdapter(this,guide,R.color.Restuarant_color);
// Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_guide.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);
   // Make the {@link ListView} use the {@link GuideAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Guide} in the list.

        listView.setAdapter(itemsAdapter);






    }
}
