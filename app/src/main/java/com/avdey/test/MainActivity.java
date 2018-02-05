package com.avdey.test;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Connect";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new FetchRaketsTask().execute();
    }


    private class FetchRaketsTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {
         /*   try {
                String result = new RaketsFetch().
                        getUrlString("https://api.spacexdata.com/v2/launches?launch_year=2017");
                Log.i(TAG, "Fetched contents of URL:" + result);

            } catch (IOException e) {
                Log.e(TAG, "Failed to fetch URL: ", e);
            }*/
         new RaketsFetch().fetchItems();
            return null;
        }
    }




}
