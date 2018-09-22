package com.example.eunra.myapplication;

import android.content.Context;

import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class CountryAdapter extends ArrayAdapter<country> {
    private Context ctx;
    private int resources;
    private ArrayList<country> objects;

    public CountryAdapter(@NonNull Context context, int resource, @NonNull ArrayList<country> objects) {
        super(context, resource, objects);
        this.ctx = context;
        this.resources = resource;
        this.objects = objects;
    }

    public class vhol{
        TextView ten, loca;
        ImageView hinh;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        vhol v = new vhol();
        if(convertView ==null){
            convertView = LayoutInflater.from(ctx).inflate(R.layout.country_item, parent, false);
            v.ten =  convertView.findViewById(R.id.ten);
            v.loca = convertView.findViewById(R.id.loca);
            v.hinh =  convertView.findViewById(R.id.hinh);
            convertView.setTag(v);
        }else{
            v = (vhol) convertView.getTag();
        }


        v.ten.setText(objects.get(position).getTen());
        v.loca.setText(objects.get(position).getLoca()+"");
        v.hinh.setImageResource(objects.get(position).getHinh());

        return convertView;
    }
}
