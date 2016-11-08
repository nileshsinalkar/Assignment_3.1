package com.example.nilesh.a;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Nilesh on 08-11-2016.
 */
public class Second extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Button but=(Button)findViewById(R.id.SHow);
        but.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Second.this,MainActivity.class);
                startActivity(intent);
            }
        });    }

}
