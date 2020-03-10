package com.green.webscrapingtest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.setWebViewClient(new MyWebViewClient());
        myWebView.loadUrl("https://alearningcurve.pythonanywhere.com/");
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        /*String data = "<html><body><h1>Test Page</h1></body></html>";
        mywebview.loadData(data, "text/html", "UTF-8"); */
        //mywebview.loadUrl("file:///android_asset/myresource.html");
    }
}

