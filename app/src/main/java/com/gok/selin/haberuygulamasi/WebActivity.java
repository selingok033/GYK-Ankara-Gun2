package com.gok.selin.haberuygulamasi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    WebView wvHaberSite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        wvHaberSite = (WebView) findViewById(R.id.webViewHaberSite);
        String link = getIntent().getStringExtra("LINK");
        wvHaberSite.getSettings().setJavaScriptEnabled(true);
        wvHaberSite.setWebViewClient(new WebViewClient()); //uygulamadan çıkmasın diye
        wvHaberSite.loadUrl(link);

    }
}
