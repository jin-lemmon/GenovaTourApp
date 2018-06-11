package com.example.android.tourapp;

import android.net.Uri;

public class PointOfInterest {

    private String mName;
    private int mPhotoId;
    private String mDescription;
    private Uri mLocation;

    public PointOfInterest (String name, int photoId, String description,Uri location){
        mName = name;
        mPhotoId = photoId;
        mDescription = description;
        mLocation = location;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getName() {
        return mName;
    }

    public int getPhotoId() {
        return mPhotoId;
    }

    public Uri getLocation() {
        return mLocation;
    }
}
