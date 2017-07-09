package com.example.nevergiveup.tourguide;

/**
 * Created by Never Give up on 7/4/2017.
 */

public class Guide {

//Places name including restuartnt,hotels,parks,tourist attraction

    //    constant value that represents no image
    private static final int NO_Image = -1;
    private String mPlaces;
    //    address of those places
    private String mAddress;
    //    Image resource
    private int mImageResource = NO_Image;

    /*Guide object
    *@param places name resources
    * @param places address resources
    * */
    public Guide(String places, String Address) {

        mPlaces = places;
        mAddress = Address;


    }

    /*Guide object
*@param places name resources
* @param places address resources
* @param image resources
* */
    public Guide(String places, String Address, int Image) {

        mPlaces = places;
        mAddress = Address;
        mImageResource = Image;


    }

/*return places name*/

    public String getPlaces() {

        return mPlaces;
    }

    /*return address */
    public String getAddress() {

        return mAddress;
    }

    /*return image resources*/
    public int getImageResource() {

        return mImageResource;
    }

    /*return whether or not image need for thie guide object*/
    public boolean hasImage() {
        return mImageResource != NO_Image;
    }

}
