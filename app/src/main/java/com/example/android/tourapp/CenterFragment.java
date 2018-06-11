package com.example.android.tourapp;


import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class CenterFragment extends Fragment {

    public CenterFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View locations = inflater.inflate(R.layout.frag, container, false);
        final ArrayList<PointOfInterest> poi = new ArrayList<PointOfInterest>();
        poi.add(new PointOfInterest("Piazza De Ferrari", R.drawable.deferrari, "This is the main square of Genoa, Situated in the heart of the city between the historical and the modern center, Piazza De Ferrari is renowned for its fountain, which was restored in recent years along with a major restyling of the square", Uri.parse("https://goo.gl/maps/gHyQqgH3eN42")));
        poi.add(new PointOfInterest("Belvedere Castelletto", R.drawable.caste, "the location of a dismantled fort that gave the quarter its name, has views over the Old City and the Gulf of Genoa.", Uri.parse("https://goo.gl/maps/UhJJAbDoUMT2")));
        poi.add(new PointOfInterest("via xx settembre", R.drawable.xxsettembre, "\n\n An Art Nouveau works became the city's main shopping street \n", Uri.parse("https://goo.gl/maps/FTJ3q48p9k42")));
        poi.add(new PointOfInterest("Teatro Carlo Felice", R.drawable.carlofelice, "The principal opera house of Genoa, Italy, used for performances of opera, ballet, orchestral music, and recitals. It is located on the Piazza De Ferrari. ", Uri.parse("https://goo.gl/maps/Uf3Xp8oUrkJ2")));
        LocationAdapter adapter = new LocationAdapter(getActivity(), poi);

        ListView listView = (ListView) locations.findViewById(R.id.list);

       listView.setAdapter(adapter);

        return locations;
    }


}