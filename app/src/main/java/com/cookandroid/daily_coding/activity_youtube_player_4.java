package com.cookandroid.daily_coding;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class activity_youtube_player_4 extends AppCompatActivity {
    private WebView webview;
    private String url="https://www.youtube.com/watch?v=ROGaSmBggzY&list=PLRx0vPvlEmdBjfCADjCc41aD4G0bmdl4R&index=3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube_player_4);

        webview=(WebView)findViewById(R.id.wedView);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl(url);
        webview.setWebChromeClient(new WebChromeClient());
        webview.setWebViewClient(new WebViewClientClass());
    }
    @Override
    public boolean onKeyDown(int keyCode,KeyEvent event){
        if((keyCode== KeyEvent.KEYCODE_BACK)&&webview.canGoBack()){
            webview.goBack();
            return true;
        }
        return  super.onKeyDown(keyCode,event);
    }
    private class WebViewClientClass extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url){
            view.loadUrl(url);
            return true;
        }
    }

}
