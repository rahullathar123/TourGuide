package com.example.nevergiveup.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour);
//add the parks info
        ArrayList<Guide> guide = new ArrayList<Guide>();

        guide.add(new Guide("Abbotsford Park","2 A ABBOTSFORD RD, ON M6V 2T6"));
        guide.add(new Guide("Acacia Park","68 LILAC AVE, Toronto, ON M7E 1X8"));
        guide.add(new Guide("Academy Soccer Field"," 95 JONESVILLE CRES, Toronto, ON M2S 2C6"));
        guide.add(new Guide("Adams Park","2 ROZELL RD, Toronto, ON M5T 1G5"));
        guide.add(new Guide("Adanac Park"," 15 BELMUIR PL, Toronto, ON M5V 3L9"));
        guide.add(new Guide("Addington Greenbelt","15 BRENTWOOD AVE,  Toronto, Ontario M5J 2H4, Canada"));
        guide.add(new Guide("Agincourt Park"," 27 GLEN WATFORD DR, Toronto, ON M9B 2H2"));
        guide.add(new Guide("Agnes Macphail Square","900 PAPE AVE, North York, ON M9C 1T2"));
        guide.add(new Guide("Ailsa Craig Parkette"," 16 AILSA CRAIG CRT, Toronto, ON M5J 1E6"));
        guide.add(new Guide("Alamosa Park","111 ALAMOSA DR, Toronto, ON M5A 2P2"));
        guide.add(new Guide("Alan - Oxford Parkette","31 ALAN AVE, Toronto, ON M5R 1X8"));
        guide.add(new Guide("Albert Campbell Square"," 150 BOROUGH DR, Toronto, ON M5J 2N8"));

        // Make the {@link ListView} use the {@link GuideAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Guide} in the list.

        GuideAdapter itemsAdapter = new GuideAdapter(this,guide,R.color.Park_color);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // list_guide.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the {@link ListView} use the {@link GuideAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Guide} in the list.

        listView.setAdapter(itemsAdapter);






    }
}
