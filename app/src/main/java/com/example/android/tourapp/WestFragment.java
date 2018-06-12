package com.example.android.tourapp;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;


public class WestFragment extends Fragment {

    public WestFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View locations = inflater.inflate(R.layout.frag, container, false);
        final ArrayList<PointOfInterest> poi = new ArrayList<PointOfInterest>();
        poi.add(new PointOfInterest(getString(R.string.marina), R.drawable.marina, getString(R.string.marinaDesc), Uri.parse(getString(R.string.marinaLoc))));
        poi.add(new PointOfInterest(getString(R.string.pallavicini), R.drawable.pallavicini, getString(R.string.pallaviciniDesc), Uri.parse(getString(R.string.pallaviciniLoc))));
        poi.add(new PointOfInterest(getString(R.string.modena), R.drawable.modena, getString(R.string.modenaDesc), Uri.parse(getString(R.string.modenaLoc))));
        PointOfInterestAdapter adapter = new PointOfInterestAdapter(getActivity(), poi);
        ListView listView = locations.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return locations;
    }


}
