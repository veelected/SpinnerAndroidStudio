package com.example.spinnerandriodstudio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CountryAdapter extends ArrayAdapter<Countryitem> {
    public CountryAdapter(Context context, ArrayList<Countryitem> countryitems) {
        super(context, 0, countryitems);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.country_spinner_row, parent, false);
        }
        ImageView imageViewFLag = convertView.findViewById(R.id.iv_flag);
        TextView textViewName = convertView.findViewById(R.id.tv_flagName);
        Countryitem currentitem = getItem(position);
        if (currentitem != null) {
            imageViewFLag.setImageResource(currentitem.getmFLagimage());
            textViewName.setText(currentitem.getmCOuntryname());
        }

        return convertView;

    }
}