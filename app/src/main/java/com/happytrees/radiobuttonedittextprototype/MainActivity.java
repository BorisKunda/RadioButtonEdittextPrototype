package com.happytrees.radiobuttonedittextprototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {


    boolean Achecked,Bchecked =false;//both false by default



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //set go button
        Button goBtn = (Button) findViewById(R.id.btnGo);

        goBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edt = (EditText)findViewById(R.id.edt);
                String a = edt.getText().toString();

                //NOTHING SELECTED
                if(!Achecked&&!Bchecked) {//A = false AND B = false  (A and B = true cant be cause you cant chose both radio buttons)
                   Toast.makeText(MainActivity.this,"please choose an option",Toast.LENGTH_SHORT).show();
                    //A SELECTED
                }else if (Achecked&&!Bchecked) { //A = true AND  B = false
                    Log.e("TAG", a+"A");

                    //B SELECTED
                }else if (!Achecked&&Bchecked){ //A = false AND B = true
                    Log.e("TAG",a+"B");
                }

            }
        });

        //set radio group
        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.A:
                        Achecked =true;
                        Bchecked = false;
                        break;

                    case R.id.B:
                        Achecked = false;
                        Bchecked = true;
                    break;
                }
            }
        });

    }
    }



