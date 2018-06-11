package com.example.android.tourapp;

import android.content.Context;
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
        poi.add(new PointOfInterest("Boccadasse", R.drawable.boccadasse, "Boccadasse (Bocadâze in Genoese) is an old mariners' neighbourhood of the Italian city of Genoa. ", Uri.parse("https://goo.gl/maps/hRXmbjeYFjF2")));
        poi.add(new PointOfInterest("Parchi di Nervi", R.drawable.nervi, "The Parchi di Nervi is a park of about 22 acres (9 hectares) created from the gardens of the Villa Grimaldi, Villa Gropallo, and Villa Serra.  ", Uri.parse("https://goo.gl/maps/wgyCWGJXn8k")));
        poi.add(new PointOfInterest("Corso Italia", R.drawable.corsoitalia, "Corso Italia is the main promenade of Genoa. About 2.5 kilometres long, the promenade connects the quartieri Foce and Boccadasse. ", Uri.parse("https://goo.gl/maps/YEGNvoSB6Gu")));

        LocationAdapter adapter = new LocationAdapter(getActivity(), poi);

        ListView listView = (ListView) locations.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return locations;
    }
}



