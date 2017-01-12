package com.example.rufflez.myapplication;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

/**
 * Created by A$hok on 10-02-2016.
 */


public class About_Library extends Fragment {

    Button b1,b2,b3,b4,b5,b6;
    TextView tv1,tv2,tv3;
    TextToSpeech t1;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.library,container,false);


        tv1=(TextView)view.findViewById(R.id.tv2);
        tv2=(TextView)view.findViewById(R.id.tv3);
        tv3=(TextView)view.findViewById(R.id.tv4);
        b1=(Button)view.findViewById(R.id.bspk2);
        b2=(Button)view.findViewById(R.id.bspk3);
        b3=(Button)view.findViewById(R.id.bspk4);
        b4=(Button)view.findViewById(R.id.bstop);
        b5=(Button)view.findViewById(R.id.bstp2);
        b6=(Button)view.findViewById(R.id.bstp3);

        t1=new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.UK);
                }
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = tv1.getText().toString();
                Toast.makeText(getContext(), toSpeak, Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = tv2.getText().toString();
                Toast.makeText(getContext(), toSpeak, Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = tv3.getText().toString();
                Toast.makeText(getContext(), toSpeak, Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1 !=null){
                    t1.stop();
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1 !=null){
                    t1.stop();
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(t1 !=null){
                    t1.stop();
                }
            }
        });

        return  view;
    }
}