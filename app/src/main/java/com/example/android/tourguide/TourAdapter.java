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

        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

            viewHolder = new ViewHolder();

            viewHolder.tourName = (TextView) convertView.findViewById(R.id.tour_name);
            viewHolder.tourDescription = (TextView) convertView.findViewById(R.id.tour_description);
            viewHolder.tourAddress = (TextView) convertView.findViewById(R.id.tour_address);
            viewHolder.tourPhone = (TextView) convertView.findViewById(R.id.tour_phone);
            viewHolder.tourMetro = (TextView) convertView.findViewById(R.id.tour_metro);
            viewHolder.tourImageView = (ImageView) convertView.findViewById(R.id.tour_picture);
            viewHolder.textLayout = (LinearLayout) convertView.findViewById(R.id.text_layout);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        final Tour currentTour = getItem(position);

        if (currentTour.hasImage()) {
            viewHolder.tourImageView.setImageResource(currentTour.getImageResourceId());
            viewHolder.tourImageView.setVisibility(View.VISIBLE);
        } else {
            viewHolder.tourImageView.setVisibility(View.GONE);
        }

        viewHolder.tourName.setText(currentTour.getName());
        viewHolder.tourDescription.setText(currentTour.getShortDescription());
        viewHolder.tourAddress.setText(currentTour.getAddress());
        viewHolder.tourPhone.setText(currentTour.getPhone());
        viewHolder.tourMetro.setText(currentTour.getMetro());
        viewHolder.textLayout.setBackgroundResource(mBackgroundColor);

        return convertView;
    }

    static class ViewHolder {
        TextView tourName;
        TextView tourDescription;
        TextView tourAddress;
        TextView tourPhone;
        TextView tourMetro;
        ImageView tourImageView;
        LinearLayout textLayout;
    }

}