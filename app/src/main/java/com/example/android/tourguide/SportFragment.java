package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SportFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tour_list, container, false);

        List<Tour> sport = new ArrayList<>();

        sport.add(new Tour(getString(R.string.big_wall_skalkdrom_name),
                getString(R.string.big_wall_skalkdrom_descr),
                getString(R.string.big_wall_skalkdrom_addr),
                getString(R.string.big_wall_skalkdrom_phone),
                getString(R.string.big_wall_skalkdrom_metro)));

        sport.add(new Tour(getString(R.string.world_class_gym_name),
                getString(R.string.world_class_gym_descr),
                getString(R.string.world_class_gym_addr),
                getString(R.string.world_class_gym_phone),
                getString(R.string.world_class_gym_metro)));

        sport.add(new Tour(getString(R.string.arena_play_karting_name),
                getString(R.string.arena_play_karting_descr),
                getString(R.string.arena_play_karting_addr),
                getString(R.string.arena_play_karting_phone),
                getString(R.string.arena_play_karting_metro)));

        sport.add(new Tour(getString(R.string.sky_town_rope_park_name),
                getString(R.string.sky_town_rope_park_descr),
                getString(R.string.sky_town_rope_park_addr),
                getString(R.string.sky_town_rope_park_phone),
                getString(R.string.sky_town_rope_park_metro)));

        sport.add(new Tour(getString(R.string.labirint_pistol_club_name),
                getString(R.string.labirint_pistol_club_descr),
                getString(R.string.labirint_pistol_club_addr),
                getString(R.string.labirint_pistol_club_phone),
                getString(R.string.labirint_pistol_club_metro)));

        sport.add(new Tour(getString(R.string.olimpiysky_swim_pool_name),
                getString(R.string.olimpiysky_swim_pool_descr),
                getString(R.string.olimpiysky_swim_pool_addr),
                getString(R.string.olimpiysky_swim_pool_phone),
                getString(R.string.olimpiysky_swim_pool_metro)));

        TourAdapter sportTourAdapter = new TourAdapter(getActivity(), sport, R.color.sport_color);
        ListView listView = (ListView) view.findViewById(R.id.list_tours);
        listView.setAdapter(sportTourAdapter);

        return view;
    }

}