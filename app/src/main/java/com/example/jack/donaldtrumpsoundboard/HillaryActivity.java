package com.example.jack.donaldtrumpsoundboard;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;



/**
 * Created by jack on 4/11/2016.
 */
//why do i have to extend this?
public class HillaryActivity extends AppCompatActivity implements MediaPlayerCallback{


    private Button button1,button2,button3,button4,button5,button6;
    private MediaPlayer mp;


    public void loadMedia(int mediaFileId) {

        stopPlaying();
        mp = MediaPlayer.create(HillaryActivity.this, mediaFileId);

        mp.start();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.donaldtrump:
                Intent i = new Intent(this, TrumpActivity.class);
                startActivity(i);
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hillary);

        button1 = (Button) findViewById(R.id.button6);
        button2 = (Button) findViewById(R.id.button7);
        button3 = (Button) findViewById(R.id.button8);
        button4 = (Button) findViewById(R.id.button9);
        button5 = (Button) findViewById(R.id.button10);
        button6 = (Button) findViewById(R.id.button11);


        button1.setOnClickListener(new MediaButtonOnClickListener(R.raw.imback, this));

        button2.setOnClickListener(new MediaButtonOnClickListener(R.raw.whatdiff, this));

        button3.setOnClickListener(new MediaButtonOnClickListener(R.raw.progressofwomen, this));

        button4.setOnClickListener(new MediaButtonOnClickListener(R.raw.cupcakefor, this));

        button5.setOnClickListener(new MediaButtonOnClickListener(R.raw.sniperfire, this));

        button6.setOnClickListener(new MediaButtonOnClickListener(R.raw.reimagine, this));



    }
    private void stopPlaying() {
        if (mp != null) {
            mp.reset();
            mp.release();
            mp = null;


        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (mp != null) {
            mp.pause();
        }}

    @Override
    protected void onPause() {
        super.onPause();
        if (mp != null) {
            mp.pause();
        }}

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mp != null) {
            mp.pause();


        }}

}
