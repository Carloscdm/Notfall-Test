package com.notfall.carfai.notfall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Carlos Diago
 * 18/11/2018
 * Activity Principal
 */
public class InicioActivity extends AppCompatActivity {

    public static final String user="names";
    TextView txtUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);


        txtUser =(TextView)findViewById(R.id.textser);
        String user = getIntent().getStringExtra("names");
        txtUser.setText("¡Bienvenido "+ user +"!");


    }
}
