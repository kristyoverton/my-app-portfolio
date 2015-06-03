package com.example.android.happybirthday;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import static com.example.android.happybirthday.R.id.buttonA;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    public void showMessage(View view) {
        CharSequence text="default";
        Context context = getApplicationContext();
        int id = view.getId();
        if (id == R.id.buttonA) {
            text = "This will launch a Spotify streamer, whatever that is";
        } else if (id == R.id.buttonB){
            text = "This will do something with scores";
        } else if (id == R.id.buttonC) {
            text = "This will find the nearest library";
        } else if (id == R.id.buttonD) {
            text = "This will be HUGE";
        } else if (id == R.id.buttonE) {
            text = "This will near the end";
        } else if (id == R.id.buttonF) {
            text = "This will be the BEST APP EVER";
        }
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
