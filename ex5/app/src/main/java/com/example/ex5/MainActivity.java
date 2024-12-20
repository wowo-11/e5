package com.example.ex5;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public class MainActivity extends AppCompatActivity implements View.OnClickListener{
        private ImageButton l,r;
        private ImageView m;
        int counter=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m=findViewById(R.id.m);
        r=findViewById(R.id.r);
        r.setOnClickListener(this);
        l=findViewById(R.id.left);
        l.setOnClickListener(this);

    }

    public void onClick(View v) {
        if(v.getId()==R.id.r && counter!=5)
            counter++;
        else
        {counter=1;m.setImageResource(R.drawable.nemer);}

        if(v.getId()==R.id.left && counter!=1)
            counter--;
        if (counter==1)
            m.setImageResource(R.drawable.nemer);
        if (counter==2)
            m.setImageResource(R.drawable.as);
        if (counter==3)
            m.setImageResource(R.drawable.qnd);
        if (counter==4)
            m.setImageResource(R.drawable.sen);
        if (counter==5)
            m.setImageResource(R.drawable.zr);
    }
}}
