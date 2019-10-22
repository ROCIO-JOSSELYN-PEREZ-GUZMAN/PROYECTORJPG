package com.mx.edu.isc.proyectorjpg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class frmActivity4 extends AppCompatActivity implements View.OnClickListener {
Button acro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm4);
        acro=findViewById(R.id.button11);
        acro.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent reg=new Intent(this,frmActivity2.class);
        startActivity(reg);
        finish();

    }}
