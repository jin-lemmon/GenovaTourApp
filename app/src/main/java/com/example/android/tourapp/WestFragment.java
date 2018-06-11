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
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View locations = inflater.inflate(R.layout.frag, container, false);
        final ArrayList<PointOfInterest> poi = new ArrayList<PointOfInterest>();

        poi.add(new PointOfInterest("Marina Genova", R.drawable.marina, "The touristic port in genova,with many bars and restaurants is an ideal place where relax ", Uri.parse("https://goo.gl/maps/3Zyx8bvP9kS2")));
        poi.add(new PointOfInterest("Villa Durazzo Pallavicini", R.drawable.pallavicini, "The Villa Durazzo-Pallavicini is a villa with notable 19th-century park in the English romantic style and a small botanical garden. ", Uri.parse("https://goo.gl/maps/yrgjwB3ZvjA2")));
        poi.add(new PointOfInterest("Teatro Gustavo Modena", R.drawable.modena, " The only theater to have survived the bombings of World War II relatively intact.  ", Uri.parse("https://goo.gl/maps/hWj7nFvRV962")));

        LocationAdapter adapter = new LocationAdapter(getActivity(), poi);

        ListView listView = locations.findViewById(R.id.list);

         listView.setAdapter(adapter);
        return locations;
    }


}
