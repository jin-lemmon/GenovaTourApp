package com.example.android.tourapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LocationAdapter extends ArrayAdapter {


    public LocationAdapter(Activity context, ArrayList<PointOfInterest> locations) {
        super(context, 0, locations);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.places, parent, false);
        }


        final PointOfInterest nowLocation = (PointOfInterest) getItem(position);

        TextView namePlace = listItemView.findViewById(R.id.namePlace);

        namePlace.setText(nowLocation.getName());


        TextView description = listItemView.findViewById(R.id.descriptionPlace);

        description.setText(nowLocation.getDescription());

        ImageView photo = listItemView.findViewById(R.id.photo);

        photo.setImageResource(nowLocation.getPhotoId());

        TextView location = listItemView.findViewById(R.id.location);
        final Uri gmmIntentUri = nowLocation.getLocation();

        location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                getContext().startActivity(mapIntent);
            }
        });
        return listItemView;
    }

}
