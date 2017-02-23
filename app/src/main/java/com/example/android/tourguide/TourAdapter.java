package com.example.android.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class TourAdapter extends ArrayAdapter<Tour> {

    private final int mBackgroundColor;

    public TourAdapter(Activity context, List<Tour> tours, int backgroundColor) {
        super(context, 0, tours);
        this.mBackgroundColor = backgroundColor;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final Tour currentTour = getItem(position);

        ImageView tourImageView = (ImageView) listItemView.findViewById(R.id.tour_picture);
        if (currentTour.hasImage()) {
            tourImageView.setImageResource(currentTour.getImageResourceId());
            tourImageView.setVisibility(View.VISIBLE);
        } else {
            tourImageView.setVisibility(View.GONE);
        }

        TextView tourName = (TextView) listItemView.findViewById(R.id.tour_name);
        tourName.setText(currentTour.getName());

        TextView tourDescription = (TextView) listItemView.findViewById(R.id.tour_description);
        tourDescription.setText(currentTour.getShortDescription());

        TextView tourAddress = (TextView) listItemView.findViewById(R.id.tour_address);
        tourAddress.setText(currentTour.getAddress());

        TextView tourPhone = (TextView) listItemView.findViewById(R.id.tour_phone);
        tourPhone.setText(currentTour.getPhone());

        TextView tourMetro = (TextView) listItemView.findViewById(R.id.tour_metro);
        tourMetro.setText(currentTour.getMetro());

        LinearLayout textLayout = (LinearLayout) listItemView.findViewById(R.id.text_layout);
        textLayout.setBackgroundResource(mBackgroundColor);

        return listItemView;
    }

}
