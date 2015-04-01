package com.foodmania.food_mania;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by hp on 13/03/2015.
 */
public class menu1_fragment extends android.support.v4.app.Fragment {


    View rootView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.menu1_layout,container,false);

        Button currentlocation = (Button) rootView.findViewById(R.id.button);
        final Intent mapview  = new Intent(getActivity(), MapsActivity2.class);



        currentlocation.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {


                getActivity().startActivity(mapview);

            }
        });
        return rootView;


    }


}


