package com.example.android.tourapp;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;


public class EastFragment extends Fragment {

    public EastFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View locations = inflater.inflate(R.layout.frag, container, false);
        final ArrayList<PointOfInterest> poi = new ArrayList<PointOfInterest>();
        poi.add(new PointOfInterest(getString(R.string.boccadasse), R.drawable.boccadasse, getString(R.string.boccadasseDesc), Uri.parse(getString(R.string.boccadasseLoc))));
        poi.add(new PointOfInterest(getString(R.string.Nervi), R.drawable.nervi, getString(R.string.NerviDesc), Uri.parse(getString(R.string.NerviLoc))));
        poi.add(new PointOfInterest(getString(R.string.corsoItalia), R.drawable.corsoitalia, getString(R.string.corsoItaliaDesc), Uri.parse(getString(R.string.corsoItaliaLoc))));
        PointOfInterestAdapter adapter = new PointOfInterestAdapter(getActivity(), poi);
        ListView listView = (ListView) locations.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return locations;
    }
}



