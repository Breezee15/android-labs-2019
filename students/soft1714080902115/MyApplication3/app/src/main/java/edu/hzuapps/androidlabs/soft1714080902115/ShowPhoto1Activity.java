package edu.hzuapps.androidlabs.Soft1714080902115;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ShowPhoto1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_photo1);

        FloatingActionButton chatting = (FloatingActionButton) findViewById(R.id.chatting);
        chatting.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                Intent intent = new Intent(ShowPhoto1Activity.this,ChattingActivity.class);
                startActivity(intent);
            }

        });

    }
}
