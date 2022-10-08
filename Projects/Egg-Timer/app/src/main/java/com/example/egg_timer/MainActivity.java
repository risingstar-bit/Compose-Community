package com.example.egg_timer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SeekBar seekBar;
    TextView textView;
    boolean betaAs=false;
    Button button;
    CountDownTimer countDownTimer;
    MediaPlayer mediaPlayer;
    public void pause(View view){
        mediaPlayer.pause();
    }
    public void reStartTimer(){
        seekBar.setEnabled(true);
        countDownTimer.cancel();
        button.setText("Go!");
        betaAs=false;
    }
    public void button(View view) {
        if (betaAs == true) {
            reStartTimer();
        } else {
            betaAs = true;
            button.setText("STOP");
            seekBar.setEnabled(false);
            countDownTimer = new CountDownTimer(seekBar.getProgress() * 1000, 1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    finalTask((int) millisUntilFinished / 1000);
                }

                @Override
                public void onFinish() {
                    mediaPlayer.start();
                    reStartTimer();

                }
            }.start();
        }
    }
    public void finalTask(int i)
    {
        int min= i/60;
        int sec= i- (min*60);
        String s= Integer.toString(sec);
        if(sec<=9){
            s="0"+s;
        }
        textView.setText(Integer.toString(min)+":"+s);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.alarm);
        button= findViewById(R.id.button);
        seekBar= (SeekBar)findViewById(R.id.seekBar);
        textView= (TextView)findViewById(R.id.textView);
        seekBar.setMax(600);
        seekBar.setProgress(300);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                finalTask(progress);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}