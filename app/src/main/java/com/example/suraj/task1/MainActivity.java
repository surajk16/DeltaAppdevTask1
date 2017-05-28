package com.example.suraj.task1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int r=0,g=0,b=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void change (View v)
    {
        if (v.getId()==R.id.button)
        {
            r+=10;
            if (r>255) r=0;

            TextView t = (TextView) findViewById(R.id.textView);
            t.setText(""+r);

            RelativeLayout rl = (RelativeLayout) findViewById(R.id.activity_main);
            rl.setBackgroundColor(Color.rgb(r, g, b));
        }

        else if (v.getId()==R.id.button2)
        {
            g+=10;
            if (g>255) g=0;

            TextView t = (TextView) findViewById(R.id.textView2);
            t.setText(""+g);

            RelativeLayout rl = (RelativeLayout) findViewById(R.id.activity_main);
            rl.setBackgroundColor(Color.rgb(r, g, b));
        }

        else if (v.getId()==R.id.button3)
        {
            b+=10;
            if (b>255) b=0;

            TextView t = (TextView) findViewById(R.id.textView3);
            t.setText(""+b);

            RelativeLayout rl = (RelativeLayout) findViewById(R.id.activity_main);
            rl.setBackgroundColor(Color.rgb(r, g, b));
        }
    }