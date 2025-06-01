package com.example.myrestapp_cristianputti

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SceltaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_scelta)

        var btnSearch : Button = findViewById(R.id.activity_scelta__btnSearch)
        var btnWebView : Button = findViewById(R.id.activity_scelta__btnWebView)

        btnSearch.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        })

        btnWebView.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, WebViewActivity::class.java)
            startActivity(intent)
        })
    }
}