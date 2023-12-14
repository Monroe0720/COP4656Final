package com.example.travelcompanionapp;

import android.os.Bundle;
        import android.webkit.WebView;
        import android.webkit.WebViewClient;
        import androidx.appcompat.app.AppCompatActivity;

import com.example.travelcompanionapp.R;

public class webviewActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        webView = findViewById(R.id.webView);
        webView.getSettings().setJavaScriptEnabled(true); // Enable JavaScript (if required)

        // Load a URL or HTML content
        webView.loadUrl("https://www.famu.edu/");

        // Optional: Handle clicks on links within the WebView
        webView.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack(); // Go back in WebView's history if possible
        } else {
            super.onBackPressed(); // Otherwise, allow the system to handle back press
        }
    }
}
