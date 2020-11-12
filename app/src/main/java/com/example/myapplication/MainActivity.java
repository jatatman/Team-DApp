package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    final int[] images = {R.drawable.puppies, R.drawable.puppy, R.drawable.puppy2, R.drawable.puppy3, R.drawable.puppy4, R.drawable.puppy5};
    Random rand = new Random();
    public int index = rand.nextInt(images.length);
    public int count = 0;
    public ArrayList<Integer> indexs = new ArrayList<Integer>();
    public Set<Integer> hset = new HashSet<Integer>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView dog = (ImageView) findViewById(R.id.Image);
        Button like = (Button) findViewById(R.id.Like);
        Button dislike = (Button) findViewById(R.id.Dislike);

            like.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.i("MYapp", "This is log message");
                    if(count < images.length)
                    {
                        dog.setImageResource(images[count]);
                        count++;
                        index = nextIndex();
                    }
                    else
                    {
                        openNoDogs();
                    }
                }
            });


            dislike.setOnClickListener(new View.OnClickListener() {
              @Override
                public void onClick(View v) {
                  Log.i("MYapp", "This is log message");
                    //openNoDogs();
                  if(count < images.length)
                  {
                      dog.setImageResource(images[count]);
                      count++;
                      index = nextIndex();
                  }
                  else
                  {
                      openNoDogs();
                  }
                }
            });
    }

    public void openNoDogs() {
        Intent intent = new Intent(this, nodogs.class);
        startActivity(intent);
    }

    public int nextIndex()
    {
        hset.add(index);
        while(hset.contains(index))
        {
            index = rand.nextInt(images.length);
        }
        return index;
    }

}