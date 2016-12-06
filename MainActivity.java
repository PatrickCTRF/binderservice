package com.example.patrick.binderservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.activity_main, menu);
        return false;//Estou retornando False para o menu nao ser exibido. VErificar se vai dar certo!!
    }

    // Método que dará início ao servico de background.
    public void startService(View view) {
        startService(new Intent(getBaseContext(), MyService.class));//Como aki eu invoco um metodo q nao foi implementado??? Ele pertence a Context.
    }

    // Metodo que parara o servico
    public void stopService(View view) {
        stopService(new Intent(getBaseContext(), MyService.class));
    }

}
