package com.medyali.mview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    private val web:WebView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val web=findViewById<WebView>(R.id.webview)
        web.webViewClient=WebViewClient()

        web.loadUrl("www.intellectsoft.net")
        val webSettings=web.settings
        webSettings.javaScriptEnabled=true//javascript must be enabled;
    }

    override fun onBackPressed() {//If a User places to go back
        if(web!!.canGoBack()){
            web.goBack()
        }
        super.onBackPressed()

    }
}