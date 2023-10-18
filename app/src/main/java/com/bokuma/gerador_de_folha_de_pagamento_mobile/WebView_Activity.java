package com.bokuma.gerador_de_folha_de_pagamento_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebView_Activity extends AppCompatActivity
{
    WebView wbv_Site;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // fazendo a ligação da classe webview_activity com a activity_webview e seus elementos
        setContentView(R.layout.activity_webview);
        wbv_Site=findViewById(R.id.wbv_Site);

        // configurações do WebView
        WebSettings webSettings=wbv_Site.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // WebView vai abrir o site
        wbv_Site.setWebViewClient(new WebView_Teclado());
        wbv_Site.loadUrl("http://ataron.somee.com/");
    }

    /* todos os eventos de teclas pressionadas serão processados pela própria WebView, e o aplicativo não fará nada com eles,
    a WebView vai se comportar como se fosse um navegador normal, um exemplo disso é na hora de fazer o login,
    se não tivesse esse código, iria perguntar qual navegador é para abrir a próxima página */
    private class WebView_Teclado extends WebViewClient
    {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event)
        {
            return false;
        }
    }

    // se apertar o botão de retornar do android, volta a tela inicial
    @Override
    public void onBackPressed()
    {
        finish();
    }
}