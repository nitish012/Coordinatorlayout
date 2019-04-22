package com.example.coordinatorlayout;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView programinglist;

    ArrayList<Student> datalist=new ArrayList<>();
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CoordinatorLayout coordinatorLayout=findViewById(R.id.co);
//       final Button button=findViewById(R.id.button);


//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Snackbar.make(coordinatorLayout, "welcome to home page", Snackbar.LENGTH_LONG).show();
//            }
//        });

        //tool.setTitle("AppBarLayout");
        Toolbar tool=findViewById(R.id.tool);
        setSupportActionBar(tool);

        programinglist=findViewById(R.id.programinglist);

        for(int i=0;i<100;i++){

            datalist.add(new Student("name:harish",i));
        }
        setlayout();
        settingadapter();

    }

    private void setlayout(){
        //setting layoutmanager

        programinglist.setLayoutManager(new LinearLayoutManager(this));
    }

    private void settingadapter(){
//passing data to adapter

        programinglist.setAdapter(new Programingadapter(datalist));
    }




    }








