package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button like = (Button) findViewById(R.id.Like);

        Button dislike = (Button) findViewById(R.id.Dislike);
        //
        like.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Log.i("MYapp", "This is log message");
                openNodogs();
            }
        });

        dislike.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Log.i("MYapp", "This is log message");
                openNodogs();
            }
        });
    }
    public void openNodogs() {
        Intent intent = new Intent(this, nodogs.class);
        startActivity(intent);
    }
}