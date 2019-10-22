package com.mx.edu.isc.proyectorjpg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class frmActivity10 extends AppCompatActivity implements View.OnClickListener {
Button ac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm10);
        ac=findViewById(R.id.button17);
        ac.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent ace=new Intent(this,frmActivity2.class);
        startActivity(ace);
        finish();

    }
}
