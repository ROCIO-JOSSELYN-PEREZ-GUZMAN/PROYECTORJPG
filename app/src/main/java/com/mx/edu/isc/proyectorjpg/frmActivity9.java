package com.mx.edu.isc.proyectorjpg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class frmActivity9 extends AppCompatActivity implements View.OnClickListener {
Button clau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm9);
        clau=findViewById(R.id.button16);
        clau.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent claus=new Intent(this,frmActivity2.class);
        startActivity(claus);
        finish();

    }
}
