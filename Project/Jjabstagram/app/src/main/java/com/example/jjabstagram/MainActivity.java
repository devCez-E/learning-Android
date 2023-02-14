package com.example.jjabstagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.jj_like).setOnClickListener(this);
        findViewById(R.id.jj_share).setOnClickListener(this);

        findViewById(R.id.jj_photo).setOnTouchListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.jj_like:
                Toast.makeText(MainActivity.this, "I love Seunghee", Toast.LENGTH_SHORT).show();
                break;
            case R.id.jj_share:
                Toast.makeText(MainActivity.this, "SHARE IMAGE", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                Toast.makeText(MainActivity.this, "T DOWN Seunghee!!!", Toast.LENGTH_SHORT).show();
                break;
            case MotionEvent.ACTION_UP:
                Toast.makeText(MainActivity.this, "T UP Seunghee!!!", Toast.LENGTH_SHORT).show();
                break;
        }
        return false;
    }
}