package com.foodmania.food_mania;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by hp on 13/03/2015.
 */
public class menu2_fragment extends android.support.v4.app.Fragment {

    View rootview;
    EditText restaurant;
    Intent result;

    Search search;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        rootview = inflater.inflate(R.layout.menu2_layout,container,false);

        Button search_retaurant = (Button) rootview.findViewById(R.id.button2);

        result = new Intent(getActivity(),MapsActivity2.class);

        restaurant = (EditText) rootview.findViewById(R.id.editText2);

        search_retaurant.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {


                //Spinner loca = (Spinner)findViewById(R.id.spinner);

                try {
                    System.out.println(R.id.editText);
                    // Getting user input location
                    String location = restaurant.getText().toString();

                    if (location == null || location == "")
                        Toast.makeText(getActivity(), "Please enter a restaurant to search", Toast.LENGTH_SHORT).show();
                    else {
                        result.putExtra("location", location);

                        getActivity().startActivity(result);
                    }

                }catch (NullPointerException ex){

                    ex.printStackTrace();

                }

            }
        });


        return rootview;
    }
}
