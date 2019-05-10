package edu.hzuapps.androidlabs.Soft1714080902115;

import android.support.design.widget.FloatingActionButton;
import android.widget.ImageButton;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Main3Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ImageButton img_1 = (ImageButton) findViewById(R.id.img_1);
        img_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                Intent intent = new Intent(Main3Activity.this,ShowPhoto1Activity.class);
                startActivity(intent);
            }

        });

        FloatingActionButton photo3 = (FloatingActionButton) findViewById(R.id.photo3);
        photo3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                Intent intent = new Intent(Main3Activity.this,Personal_Interface.class);
                startActivity(intent);
            }

        });

    }
}
