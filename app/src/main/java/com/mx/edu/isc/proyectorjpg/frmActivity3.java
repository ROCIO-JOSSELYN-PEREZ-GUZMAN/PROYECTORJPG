package com.mx.edu.isc.proyectorjpg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class frmActivity3 extends AppCompatActivity implements View.OnClickListener {
Button intro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm3);
        intro=findViewById(R.id.button10);
        intro.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent reg=new Intent(this,frmActivity2.class);
        startActivity(reg);
        finish();

    }
}
