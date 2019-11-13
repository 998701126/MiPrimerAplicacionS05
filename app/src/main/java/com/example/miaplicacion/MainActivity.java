package com.example.miaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onResume() {
        super.onResume(); //este codigo se ejecuta antes de todos.
        //En este punto la aplicacion ya cargo.

        //This en un activity: es la esencia de una pantalla
        //This es de tipo contexto

        Toast.makeText(this,
                "Aplicacion Iniciada",
                Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,
                "Aplicacion stopeada",
                Toast.LENGTH_LONG).show();
    }
}
