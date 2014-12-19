package com.emrullah.first;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    RelativeLayout.LayoutParams layoutParams;
    RelativeLayout rl;
    static int i;
    float Y=1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button)findViewById(R.id.button1);
        rl = (RelativeLayout)findViewById(R.id.rl1);
        layoutParams = new RelativeLayout.LayoutParams(layoutParams.WRAP_CONTENT, layoutParams.WRAP_CONTENT);
        b.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
                  Y=Y+100;
                  TextView view = new TextView(MainActivity.this);
                  view.setText(++i+" view");
                  view.setTextColor(Color.BLACK);
                  view.setY(Y);
                  rl.addView(view, layoutParams);
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
