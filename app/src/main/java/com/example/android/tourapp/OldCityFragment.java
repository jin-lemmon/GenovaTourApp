package com.example.android.tourapp;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class OldCityFragment extends Fragment {
    public OldCityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View locations = inflater.inflate(R.layout.frag, container, false);
        final ArrayList<PointOfInterest> poi = new ArrayList<PointOfInterest>();
        poi.add(new PointOfInterest(getString(com.example.android.tourapp.R.string.erbe), R.drawable.erbe, getString(com.example.android.tourapp.R.string.erbeDesc), Uri.parse(getString(R.string.erbeLoc))));
        poi.add(new PointOfInterest(getString(com.example.android.tourapp.R.string.slorenzo), R.drawable.slorenzo, getString(com.example.android.tourapp.R.string.slorenzoDesc), Uri.parse(getString(R.string.slorenzoLoc))));
        poi.add(new PointOfInterest(getString(com.example.android.tourapp.R.string.archi), R.drawable.archi, getString(com.example.android.tourapp.R.string.archiDesc), Uri.parse(getString(R.string.archiLoc))));
        poi.add(new PointOfInterest(getString(com.example.android.tourapp.R.string.tursi), R.drawable.tursi, getString(R.string.tursiDesc), Uri.parse(getString(R.string.tursiLoc))));
        PointOfInterestAdapter adapter = new PointOfInterestAdapter(getActivity(), poi);
        ListView listView = (ListView) locations.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return locations;
    }
}
