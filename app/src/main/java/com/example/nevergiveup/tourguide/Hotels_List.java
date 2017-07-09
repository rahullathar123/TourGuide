package com.example.nevergiveup.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Hotels_List extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour);
//create list of hotels and thier address
        ArrayList<Guide> guide = new ArrayList<Guide>();

        guide.add(new Guide("DoubleTree by Hilton Hotel Toronto Downtown","108 Chestnut St, Toronto, ON M5G 1R3",R.drawable.double1));
        guide.add(new Guide("Toronto Marriott Downtown Eaton Centre Hotel","525 Bay St, Toronto, ON M5G 2L2",R.drawable.marriort));
        guide.add(new Guide("Courtyard by Marriott Toronto Downtown"," 475 Yonge St, Toronto, ON M4Y 1X7",R.drawable.courtland));
        guide.add(new Guide("Sheraton Centre Hotel ","123 Queen St W, Toronto, ON M5H 2M9",R.drawable.sheraton));
        guide.add(new Guide("Comfort Hotel Downtown", "15 Charles St E, Toronto, ON M4Y 1S1",R.drawable.comfort));
        guide.add(new Guide("Cambridge Suites Hotel Toronto "," 15 Richmond St E, Toronto, ON M5C 1N2",R.drawable.cambridge));
        guide.add(new Guide("SoHo Metropolitan Hotel"," 318 Wellington St W, Toronto, ON M5V 3T4",R.drawable.soho));
        guide.add(new Guide("Ritz-Carlton Toronto "," 183 Wellington St W, Toronto, ON M5J 2H5",R.drawable.ritz));
        guide.add(new Guide("One King Street West","1 King St W, Toronto, ON M5H 1A1",R.drawable.one));
        guide.add(new Guide("Town Inn Suites"," 620 Church St, Toronto, ON M4Y 2G2",R.drawable.tower));
        guide.add(new Guide("Trump International Hotel and Tower"," 20 Bay St, Toronto, ON M5J 2N8",R.drawable.trump));

        // Create an {@link GuideAdapter}, whose data source is a list of {@link Guide}s. The
        // adapter knows how to create list items for each item in the list.
        GuideAdapter itemsAdapter = new GuideAdapter(this,guide,R.color.Hotels_color);
     // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_guide.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the {@link ListView} use the {@link GuideAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Guide} in the list.

        listView.setAdapter(itemsAdapter);






    }
}
