package com.nanuyo.hjpark.nanuyoalbumwebview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import com.nanuyo.hjpark.nanuyoalbumwebview.R.layout.activity_webview
import android.webkit.WebSettings
import com.nanuyo.hjpark.nanuyoalbumwebview.R.id.webview
import android.webkit.WebViewClient
import android.content.Intent
import android.net.Uri


class WebviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_webview)
        val myWebView = findViewById<View>(R.id.webview) as WebView

       // myWebView.setWebViewClient(new WebViewClient())
      /*  myWebView.getSettings().setJavaScriptEnabled(true)
        myWebView.getSettings().setDomStorageEnabled(true)*/

      /*  val webSettings = myWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.allowContentAccess = true
        webSettings.allowFileAccess = true
        webSettings.javaScriptCanOpenWindowsAutomatically =true
        webSettings.builtInZoomControls = true
        webSettings.setSupportZoom(true)
        webSettings.displayZoomControls = true;*/



//        myWebView.loadUrl("http://www.nanuyo.com")

        val uri = Uri.parse("http://www.nanuyo.com/")
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
        supportActionBar!!.hide()

    }
}
