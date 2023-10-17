package com.bokuma.gerador_de_folha_de_pagamento_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Activity_WebView extends AppCompatActivity {
    WebView wbv_Site;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        wbv_Site=findViewById(R.id.wbv_Site);
        WebSettings webSettings=wbv_Site.getSettings();
        webSettings.setJavaScriptEnabled(true);

        wbv_Site.setWebViewClient(new Voltar());

        wbv_Site.loadUrl("http://ataron.somee.com/");
    }

    private class Voltar extends WebViewClient {
        @Override
        public boolean shouldOverrideKeyEvent(WebView view, KeyEvent event) {
            return false;
        }
    }

    @Override
    public void onBackPressed() {
        if(wbv_Site.canGoBack()){
            wbv_Site.goBack();
        }
        else
            super.onBackPressed();
    }
}