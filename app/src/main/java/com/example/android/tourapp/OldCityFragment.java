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
        // Inflate the layout for this fragment
        View locations = inflater.inflate(R.layout.frag, container, false);
        final ArrayList<PointOfInterest> poi = new ArrayList<PointOfInterest>();
        poi.add(new PointOfInterest("Piazza Delle Erbe", R.drawable.erbe, "\n\nThe most known square for drinks!\n\n", Uri.parse("https://goo.gl/maps/8h9MxYsBvCu")));
        poi.add(new PointOfInterest("San Lorenzo", R.drawable.slorenzo, "The cathedral was consecrated by Pope Gelasius II in 1118 and was built between the twelfth century and the fourteenth century as fundamentally a medieval building, with some later additions. Secondary naves and side covers are of Romanesque style and the main facade is Gothic from the early thirteenth century, while capitals and columns with interior corridors date from the early fourteenth century. The bell tower and dome were built in the sixteenth century. ", Uri.parse("https://goo.gl/maps/JHxvL6xuRjr")));
        poi.add(new PointOfInterest("Università di Architettura", R.drawable.archi, "The Faculty of Architecture is located on the hill of Castello, in the oldest part of the Genoese historical centre. Facing into the natural bay of the pre-Roman port, the hill was the location of the first historical settlements of Genoa and has witnessed the numerous transformations from the high-medieval period to the present day. ", Uri.parse("https://goo.gl/maps/WskTGFb1Bh42")));
        poi.add(new PointOfInterest("Palazzo Doria Tursi", R.drawable.tursi, "The building is home to the Municipality of Genoa and is part of the city's museum complex.", Uri.parse("https://goo.gl/maps/wf6vP6huRF72")));

        LocationAdapter adapter = new LocationAdapter(getActivity(), poi);
        ListView listView = (ListView) locations.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return locations;
    }
}
