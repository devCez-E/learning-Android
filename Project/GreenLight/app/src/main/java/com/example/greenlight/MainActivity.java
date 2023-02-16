package com.example.greenlight;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnColorButtonListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentRight fragR = new FragmentRight();
        getSupportFragmentManager().beginTransaction().add(R.id.fl_right, fragR).commit();
    }

    @Override
    public void onColorClick(int color) {
        Fragment frg = null;
        switch(color){
            case 0:
                frg = new FragmentOne();
                break;
            case 1:
                frg = new FragmentTwo();
                break;
            case 2:
                frg = new FragmentThree();
                break;
            case 3:
                frg = new FragmentFour();
                break;
        }

        getSupportFragmentManager().beginTransaction().replace(R.id.fl_right, frg).commit();
    }
}