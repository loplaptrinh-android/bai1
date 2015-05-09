package com.tranhieukk.bai1;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    TextView Kq;
    Button Red,Gre,Yel;
    RadioButton red,gre,yel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init()
    {
        Red = (Button)findViewById(R.id.Red);
        Gre =(Button)findViewById(R.id.Green);
        Yel =(Button)findViewById(R.id.Yellow);
        Kq = (TextView)findViewById(R.id.kq);
        red=(RadioButton)findViewById(R.id.radioButton);
        gre=(RadioButton)findViewById(R.id.radioButton2);
        yel = (RadioButton)findViewById(R.id.radioButton3);

        Red.setOnClickListener(new View.OnClickListener() {
            private int red;

            @Override
            public void onClick(View v)
            {

                red = Color.RED;
                Kq.setBackgroundColor(red);

            }
        });
        Gre.setOnClickListener(new View.OnClickListener() {
            private int green;

            @Override
            public void onClick(View v) {
                green = Color.GREEN;
                Kq.setBackgroundColor(green);
            }
        });
        Yel.setOnClickListener(new View.OnClickListener() {
            private int yellow;

            @Override
            public void onClick(View v) {
                yellow = Color.YELLOW;
                Kq.setBackgroundColor(yellow);
            }
        });

        red.setOnClickListener(new View.OnClickListener() {
            private int blue;
            private int red;

            @Override
            public void onClick(View v)
            {

                red = Color.RED;
                Kq.setBackgroundColor(red);

            }
        });
        gre.setOnClickListener(new View.OnClickListener() {
            private int green;

            @Override
            public void onClick(View v) {
                green = Color.GREEN;
                Kq.setBackgroundColor(green);
            }
        });
        yel.setOnClickListener(new View.OnClickListener() {
            private int yellow;

            @Override
            public void onClick(View v) {
                yellow = Color.YELLOW;
                Kq.setBackgroundColor(yellow);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
