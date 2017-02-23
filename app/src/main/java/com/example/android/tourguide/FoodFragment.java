package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class FoodFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tour_list, container, false);

        List<Tour> food = new ArrayList<>();

        food.add(new Tour(getString(R.string.bizon_chili_stejk_name),
                getString(R.string.bizon_chili_stejk_descr),
                getString(R.string.bizon_chili_stejk_addr),
                getString(R.string.bizon_chili_stejk_phone),
                getString(R.string.bizon_chili_stejk_metro),
                R.drawable.bizon_chili_stejk));

        food.add(new Tour(getString(R.string.lepim_i_varim_name),
                getString(R.string.lepim_i_varim_descr),
                getString(R.string.lepim_i_varim_addr),
                getString(R.string.lepim_i_varim_phone),
                getString(R.string.lepim_i_varim_metro),
                R.drawable.lepim_i_varim));

        food.add(new Tour(getString(R.string.savva_restaurant_name),
                getString(R.string.savva_restaurant_descr),
                getString(R.string.savva_restaurant_addr),
                getString(R.string.savva_restaurant_phone),
                getString(R.string.savva_restaurant_metro),
                R.drawable.savva_restaurant));

        food.add(new Tour(getString(R.string.lavka_lavka_name),
                getString(R.string.lavka_lavka_descr),
                getString(R.string.lavka_lavka_addr),
                getString(R.string.lavka_lavka_phone),
                getString(R.string.lavka_lavka_metro),
                R.drawable.lavka_lavka));

        food.add(new Tour(getString(R.string.kafe_pushkin_name),
                getString(R.string.kafe_pushkin_descr),
                getString(R.string.kafe_pushkin_addr),
                getString(R.string.kafe_pushkin_phone),
                getString(R.string.kafe_pushkin_metro),
                R.drawable.kafe_pushkin));

        TourAdapter foodTourAdapter = new TourAdapter(getActivity(), food, R.color.color_food);
        ListView listView = (ListView) view.findViewById(R.id.list_tours);
        listView.setAdapter(foodTourAdapter);

        return view;
    }

}
