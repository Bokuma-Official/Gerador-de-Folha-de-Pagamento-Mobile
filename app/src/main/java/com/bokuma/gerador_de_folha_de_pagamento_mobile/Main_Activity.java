package com.bokuma.gerador_de_folha_de_pagamento_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main_Activity extends AppCompatActivity
{
    Button btn_Acessar;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // fazendo a ligação da classe main_activity com a activity_main e seus elementos
        setContentView(R.layout.activity_main);
        btn_Acessar=findViewById(R.id.btn_Acessar);

        // quando clicar no botão a activity_webview abre
        btn_Acessar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(Main_Activity.this, WebView_Activity.class);
                startActivity(intent);
            }
        });
    }
}