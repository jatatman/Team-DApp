package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView dog = (ImageView) findViewById(R.id.Image);
        Button like = (Button) findViewById(R.id.Like);
        int numofpics = 10;
        int count = 1;
        String picname = "puppy";

        while(count <= numofpics)
        {
            if(count == numofpics)
            {
                openNoDogs();
                break;
            }
            Button dislike = (Button) findViewById(R.id.Dislike);
            like.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.i("MYapp", "This is log message");
                    // openNoDogs();
                    dog.setImageResource(R.drawable.puppy);

                }
            });

            dislike.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.i("MYapp", "This is log message");
                    //openNoDogs();
                    dog.setImageResource(R.drawable.puppies);
                }
            });
            count++;
        }
    }
    public void openNoDogs() {
        Intent intent = new Intent(this, nodogs.class);
        startActivity(intent);
    }

    public void nextPicture()
    {
        Intent intent = new Intent(this, nextPicture.class);
        startActivity(intent);
    }
}