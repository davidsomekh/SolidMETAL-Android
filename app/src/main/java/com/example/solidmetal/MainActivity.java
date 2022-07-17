package com.example.solidmetal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Settings;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView m_WebView = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitWebView();
    }

    public void InitWebView()
    {

        getSupportActionBar().hide();



        try {
            m_WebView = (WebView) findViewById(R.id.webview);
        }
        catch (Exception e)
        {
            String sm = e.getMessage();
            e.getMessage();
        }

        WebSettings webSettings = m_WebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setAllowFileAccessFromFileURLs(true);
        m_WebView.clearCache(true);
        m_WebView.setWebViewClient(new WebViewClient());
        //    m_Webview.loadUrl("file:///android_asset/index.html");
        m_WebView.loadUrl("https://app.solidmetal.com");
    }
}