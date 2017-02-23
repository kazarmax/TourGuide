package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class HotelFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tour_list, container, false);

        final List<Tour> hotels = new ArrayList<>();

        hotels.add(new Tour(getString(R.string.palmira_hotel_name),
                getString(R.string.palmira_hotel_descr),
                getString(R.string.palmira_hotel_addr),
                getString(R.string.palmira_hotel_phone),
                getString(R.string.palmira_hotel_metro),
                R.drawable.palmira));

        hotels.add(new Tour(getString(R.string.lotte_hotel_name),
                getString(R.string.lotte_hotel_descr),
                getString(R.string.lotte_hotel_addr),
                getString(R.string.lotte_hotel_phone),
                getString(R.string.lotte_hotel_metro),
                R.drawable.lotte_hotel));

        hotels.add(new Tour(getString(R.string.ritzcarlton_hotel_name),
                getString(R.string.ritzcarlton_hotel_descr),
                getString(R.string.ritzcarlton_hotel_addr),
                getString(R.string.ritzcarlton_hotel_phone),
                getString(R.string.ritzcarlton_hotel_metro),
                R.drawable.ritzcarlton));

        hotels.add(new Tour(getString(R.string.ararat_park_hyatt_hotel_name),
                getString(R.string.ararat_park_hyatt_hotel_descr),
                getString(R.string.ararat_park_hyatt_hotel_addr),
                getString(R.string.ararat_park_hyatt_hotel_phone),
                getString(R.string.ararat_park_hyatt_hotel_metro),
                R.drawable.ararat_park_hyatt));

        hotels.add(new Tour(getString(R.string.novotel_hotel_name),
                getString(R.string.novotel_hotel_descr),
                getString(R.string.novotel_hotel_addr),
                getString(R.string.novotel_hotel_phone),
                getString(R.string.novotel_hotel_metro),
                R.drawable.novotel));

        TourAdapter hotelTourAdapter = new TourAdapter(getActivity(), hotels, R.color.color_hotels);
        ListView listView = (ListView) view.findViewById(R.id.list_tours);
        listView.setAdapter(hotelTourAdapter);

        return view;
    }

}