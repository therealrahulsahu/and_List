package com.rk.list;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class AC_2 extends AppCompatActivity {
    ListView li1;
    ProgressBar pb1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac_2);
        li1=findViewById(R.id.li1_id);
        pb1=findViewById(R.id.pb1_id);
        String num[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

        final ArrayAdapter<String> stringArrayAdapter=new ArrayAdapter<>(
            this, android.R.layout.simple_list_item_1,num);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                pb1.setVisibility(View.INVISIBLE);
                li1.setAdapter(stringArrayAdapter);
            }
        },1000);
        li1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value=parent.getItemAtPosition(position).toString();
                Toast.makeText(AC_2.this,value,Toast.LENGTH_SHORT).show();
            }
        });




    }
}
