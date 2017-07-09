package com.example.nevergiveup.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Never Give up on 7/4/2017.
 */

public class GuideAdapter extends ArrayAdapter<Guide> {

    private int mColorResource;

    public GuideAdapter(Context context, ArrayList<Guide> guide, int Color) {
        super(context, 0, guide);
        mColorResource = Color;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_guide, parent, false);
        }

        // Get the {@link Guide} object located at this position in the list
        Guide currentGuide = getItem(position);

        // Find the TextView in the list_guide.xml layout with the place_name.
        TextView placeView = (TextView) listItemView.findViewById(R.id.places_name);
        // Get the getPlace from the currentWord object and set this text on
        // the place TextView.
        placeView.setText(currentGuide.getPlaces());

        // Find the TextView in the list_guide.xml layout with the ID address.
        TextView addressView = (TextView) listItemView.findViewById(R.id.address);
        // Get the addressview from the currentGuide object and set this text on the address view
        addressView.setText(currentGuide.getAddress());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentGuide.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentGuide.getImageResource());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        View textColor = listItemView.findViewById(R.id.Text_conatiner);
         int color = ContextCompat.getColor(getContext(), mColorResource);
      // Set the background color of the text textColor
        textColor.setBackgroundColor(color);
        // Return the whole list item layout (containing 2 TextViews and image ) so that it can be shown in
        // the ListView.
        return listItemView;

    }
}