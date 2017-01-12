package com.example.rufflez.myapplication;

/**
 * Created by A$hok on 08-03-2016.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by A$hok on 10-02-2016.
 */


public class About_Location extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.about_location,container,false);


        TextView t18 = (TextView) view.findViewById(R.id.tv50);
        t18.setMovementMethod(LinkMovementMethod.getInstance());


        return  view;
    }
}