package com.example.nilesh.a;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button=(Button)findViewById(R.id.button);
        ImageView imageView=(ImageView)findViewById(R.id.imageView);

        button.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Second.class);
                startActivity(intent);
            }
        });
    }





}
