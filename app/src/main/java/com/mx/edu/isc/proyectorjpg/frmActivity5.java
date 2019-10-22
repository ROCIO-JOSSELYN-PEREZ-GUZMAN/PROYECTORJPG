package com.mx.edu.isc.proyectorjpg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class frmActivity5 extends AppCompatActivity implements View.OnClickListener {
Button arac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm5);
        arac=findViewById(R.id.button12);
        arac.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent arc=new Intent(this,frmActivity2.class);
        startActivity(arc);
        finish();
    }
}
