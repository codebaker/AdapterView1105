package com.codebakery.joan.adapterview1105;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class MyBaseAdapter extends BaseAdapter {

    private final List<Wheather> mData;

    public MyBaseAdapter(List<Wheather> mData) {
        this.mData = mData;
    }



    //아이템의 갯수
    @Override
    public int getCount() {
        return mData.size();
    }

    //position 번째의 아이템
    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    //position 번째의 아이디
    @Override
    public long getItemId(int position) {
        return position;
    }

    //position 번째의 아이템의 View
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_weather,parent,false);
        
        return null;
    }
}
