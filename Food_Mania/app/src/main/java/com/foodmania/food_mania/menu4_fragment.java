package com.foodmania.food_mania;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hp on 13/03/2015.
 */
public class menu4_fragment extends android.support.v4.app.Fragment {

    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootview = inflater.inflate(R.layout.menu4_layout,container,false);
        return rootview;
    }
}
