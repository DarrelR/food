package com.foodmania.food_mania;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by hp on 13/03/2015.
 */
public class menu3_fragment extends android.support.v4.app.Fragment{

    View rootview;

    public class Lview extends Activity{



        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


            rootview = inflater.inflate(R.layout.menu3_layout,container,false);


            String [] food = {"Bread", "Bun","Butter","Sugar"};
            ListAdapter myAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,food);
            ListView restaurantlist = (ListView) rootview.findViewById(R.id.restaurant_list);

            restaurantlist.setAdapter(myAdapter);


            return rootview;



        }



    }
}
