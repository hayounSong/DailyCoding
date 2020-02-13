package com.cookandroid.daily_coding;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class community_view extends AppCompatActivity {
    private WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.community_view);
        webview =(WebView) findViewById(R.id.webview);
        webview.setWebViewClient(new WebViewClient());

        WebSettings myWebSettings=  webview.getSettings();
        myWebSettings.setJavaScriptEnabled(true);

        webview.loadUrl("https://cafe.naver.com/dailycodingdaco");
        webview.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);

    }
}
