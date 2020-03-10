package com.green.webscrapingtest;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

WebView myWebView = (WebView) findViewById(R.id.webview);
myWebView.setWebViewClient(MyWebViewClient);

@SuppressWarnings("unused")
class MyWebViewClient extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        Uri uri = Uri.parse(url);
        if (uri.getHost() != null && uri.getHost().contains("https://alearningcurve.pythonanywhere.com/accounts/signup/")) {
            return false;
        }

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;
    }

}
//https://developer.android.com/guide/webapps/webview#java
//https://github.com/slymax/webview/blob/master/app/src/main/java/com/example/app/MyWebViewClient.java
