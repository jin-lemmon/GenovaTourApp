package com.example.android.tourapp;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;


public class CenterFragment extends Fragment {

    public CenterFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View locations = inflater.inflate(R.layout.frag, container, false);
        final ArrayList<PointOfInterest> poi = new ArrayList<PointOfInterest>();
        poi.add(new PointOfInterest(getString(R.string.deferrari), R.drawable.deferrari, getString(R.string.deferrariDesc), Uri.parse(getString(R.string.deferrariLoc))));
        poi.add(new PointOfInterest(getString(R.string.caste), R.drawable.caste, getString(R.string.casteDesc), Uri.parse(getString(R.string.casteLoc))));
        poi.add(new PointOfInterest(getString(R.string.xxsettembre), R.drawable.xxsettembre,"\n\n"+ getString(R.string.xxsettembreDesc)+"\n\n", Uri.parse(getString(R.string.xxsettembreLoc))));
        poi.add(new PointOfInterest(getString(R.string.carlofelice), R.drawable.carlofelice, getString(R.string.carlofeliceDesc), Uri.parse(getString(R.string.carlofeliceLoc))));
        PointOfInterestAdapter adapter = new PointOfInterestAdapter(getActivity(), poi);
        ListView listView = locations.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return locations;
    }


}