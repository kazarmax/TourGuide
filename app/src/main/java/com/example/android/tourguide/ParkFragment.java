package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ParkFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tour_list, container, false);

        List<Tour> parks = new ArrayList<>();

        parks.add(new Tour(getString(R.string.park_gorkogo_park_name),
                getString(R.string.park_gorkogo_park_descr),
                getString(R.string.park_gorkogo_park_addr),
                getString(R.string.park_gorkogo_park_phone),
                getString(R.string.park_gorkogo_park_metro),
                R.drawable.park_gorkogo));

        parks.add(new Tour(getString(R.string.neskuchni_sad_park_name),
                getString(R.string.neskuchni_sad_park_descr),
                getString(R.string.neskuchni_sad_park_addr),
                getString(R.string.neskuchni_sad_park_phone),
                getString(R.string.neskuchni_sad_park_metro),
                R.drawable.neskuchni_sad));

        parks.add(new Tour(getString(R.string.vorob_gori_park_name),
                getString(R.string.vorob_gori_park_descr),
                getString(R.string.vorob_gori_park_addr),
                getString(R.string.vorob_gori_park_phone),
                getString(R.string.vorob_gori_park_metro),
                R.drawable.vorob_gori));

        parks.add(new Tour(getString(R.string.aleksandr_sad_park_name),
                getString(R.string.aleksandr_sad_park_descr),
                getString(R.string.aleksandr_sad_park_addr),
                getString(R.string.aleksandr_sad_park_phone),
                getString(R.string.aleksandr_sad_park_metro),
                R.drawable.aleksandr_sad));

        parks.add(new Tour(getString(R.string.park_pobedi_park_name),
                getString(R.string.park_pobedi_park_descr),
                getString(R.string.park_pobedi_park_addr),
                getString(R.string.park_pobedi_park_phone),
                getString(R.string.park_pobedi_park_metro),
                R.drawable.park_pobedi));

        TourAdapter parkTourAdapter = new TourAdapter(getActivity(), parks, R.color.color_parks);
        ListView listView = (ListView) view.findViewById(R.id.list_tours);
        listView.setAdapter(parkTourAdapter);

        return view;
    }

}