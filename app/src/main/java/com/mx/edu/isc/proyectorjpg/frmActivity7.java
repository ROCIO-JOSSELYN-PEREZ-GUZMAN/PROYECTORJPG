package com.mx.edu.isc.proyectorjpg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class frmActivity7 extends AppCompatActivity implements View.OnClickListener {
Button tapo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm7);
        tapo=findViewById(R.id.button14);
        tapo.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent ta=new Intent(this,frmActivity2.class);
        startActivity(ta);
        finish();

    }
}
