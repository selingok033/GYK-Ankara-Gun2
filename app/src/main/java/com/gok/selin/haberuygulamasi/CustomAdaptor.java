package com.gok.selin.haberuygulamasi;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by selin on 6/11/17.
 */

public class CustomAdaptor extends BaseAdapter {

    ArrayList<HaberModel> haberListe;
    LayoutInflater userInflater;

    public CustomAdaptor (Activity activity, ArrayList<HaberModel> haberListesi){
        userInflater = (LayoutInflater) activity.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        haberListe = haberListesi;
    }


    @Override
    public int getCount() {
        return haberListe.size();
    }

    @Override
    public Object getItem(int position) {
        return haberListe.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View satir;
        satir = userInflater.inflate(R.layout.custom_satir,null);

        ImageView ivLogo = (ImageView) satir.findViewById(R.id.imageViewLogo);
        TextView tvHaberAdi = (TextView) satir.findViewById(R.id.textViewSiteAdi);

        tvHaberAdi.setText(haberListe.get(position).getSiteAdi());
        ivLogo.setImageResource(haberListe.get(position).getLogoId());


        return satir;
    }
}
