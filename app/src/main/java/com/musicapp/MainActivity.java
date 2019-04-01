package com.musicapp;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Constants
    private final int NUMBER_OF_SIMULTANEOUS_SOUND = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    //TODO 1: Add member variables
    private int cSoundId;
    private int dSoundId;
    private int eSoundId;
    private int fSoundId;
    private int gSoundId;
    private int aSoundId;
    private int bSoundId;
    private int highCSoundId;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 1: Create SoundPool


        //TODO 2: Create local variables (Buttons) and link to XML


        //TODO 4: Load and get the sounds



        //TODO 3: add onClickListeners on all Buttons


    }

    //TODO 3: Add play methods triggered when onclicked
}
