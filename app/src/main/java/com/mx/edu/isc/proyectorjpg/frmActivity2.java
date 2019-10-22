package com.mx.edu.isc.proyectorjpg;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class frmActivity2 extends AppCompatActivity implements View.OnClickListener {
    Button Button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm2);
        Button=findViewById(R.id.button);
        Button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intro =new Intent(this,frmActivity3.class);
        startActivity(intro);
        finish();

    }
    public void acro(View view) {
        Intent acrofo =new Intent(this,frmActivity4.class);
        startActivity(acrofo);
        finish();

    }
    public void ara(View view) {
        Intent aracno =new Intent(this,frmActivity5.class);
        startActivity(aracno);
        finish();

    }
    public void nic(View view) {
        Intent nicto=new Intent(this,frmActivity6.class);
        startActivity(nicto);
        finish();

    }
    public void tapo(View view) {
        Intent tapofo=new Intent(this,frmActivity7.class);
        startActivity(tapofo);
        finish();

    }
    public void coul(View view) {
        Intent coulro=new Intent(this,frmActivity8.class);
        startActivity(coulro);
        finish();

    }
    public void cla(View view) {
        Intent claus=new Intent(this,frmActivity9.class);
        startActivity(claus);
        finish();

    }
    public void ac(View view) {
        Intent acer=new Intent(this,frmActivity10.class);
        startActivity(acer);
        finish();

    }
    public void fi(View view) {

        finish();

    }

}
