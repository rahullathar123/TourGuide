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

        guide.add(new Guide("CN Tower", "301 Front St W, Toronto, ON M5V 2T6", R.drawable.cn));
        guide.add(new Guide("Hockey hall of fame", "30 Yonge St, Toronto, ON M5E 1X8", R.drawable.hockey));
        guide.add(new Guide("Royal Ontario Museum", " 100 Queens Park, Toronto, ON M5S 2C6", R.drawable.royal));
        guide.add(new Guide("Art gallery of Ontario", "317 Dundas St W, Toronto, ON M5T 1G4", R.drawable.art));
        guide.add(new Guide("Ripley's aquarium of Canada", " 288 Bremner Blvd, Toronto, ON M5V 3L9", R.drawable.aquarium));
        guide.add(new Guide("Toronto Islands", "9 Queens Quay West, Toronto, Ontario M5J 2H3, Canada", R.drawable.island));
        guide.add(new Guide("Toronto Eaton Center", " 220 Yonge St, Toronto, ON M5B 2H1", R.drawable.eaton));
        guide.add(new Guide("Ontario science Center", "770 Don Mills Rd, North York, ON M3C 1T3", R.drawable.science));
        guide.add(new Guide("Union Center", " 65 Front St W, Toronto, ON M5J 1E6", R.drawable.union));
        guide.add(new Guide("Allan Gardens", "19 Horticultural Ave, Toronto, ON M5A 2P2", R.drawable.allan));
        guide.add(new Guide("Casa Loma", " 1 Austin Terrace, Toronto, ON M5R 1X8", R.drawable.casa));
        guide.add(new Guide("Toronto Waterfront", " 20 Bay St, Toronto, ON M5J 2N8", R.drawable.water));

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
