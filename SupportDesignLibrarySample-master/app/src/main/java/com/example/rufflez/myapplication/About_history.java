package com.example.rufflez.myapplication;

/**
 * Created by A$hok on 08-03-2016.
 */

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


public class About_history extends Fragment {

Button b,b1;
    TextView tv;
    TextToSpeech t1;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.about_history,container,false);
tv=(TextView)view.findViewById(R.id.textView2);
b=(Button)view.findViewById(R.id.bspeak);
        b1=(Button)view.findViewById(R.id.bstp);
        t1=new TextToSpeech(getContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.US);
                }
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = tv.getText().toString();
                Toast.makeText(getContext(), toSpeak, Toast.LENGTH_SHORT).show();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
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

