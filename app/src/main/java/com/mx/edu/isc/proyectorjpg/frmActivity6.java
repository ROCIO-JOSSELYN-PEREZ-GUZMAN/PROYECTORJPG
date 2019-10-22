package com.mx.edu.isc.proyectorjpg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class frmActivity6 extends AppCompatActivity implements View.OnClickListener {
Button reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm6);
        reg=findViewById(R.id.button13);
        reg.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent nic=new Intent(this,frmActivity2.class);
        startActivity(nic);
        finish();

    }
}
