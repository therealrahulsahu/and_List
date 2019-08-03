package com.rk.list;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class AC_1 extends AppCompatActivity {
    Switch sw1;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac_1);
        sw1=findViewById(R.id.sw1_id);
        bt1=findViewById(R.id.bt1_id);
        sw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sw1.isChecked())
                {
                    bt1.setVisibility(View.VISIBLE);
                }
                else
                {
                    bt1.setVisibility(View.INVISIBLE);
                }
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(AC_1.this,AC_2.class);
                startActivity(in);
            }
        });
    }
}
