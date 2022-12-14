package com.example.practical_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat
import com.example.practical_6.databinding.ActivityMainBinding
import com.example.practical_6.databinding.ActivityYoutubeBinding
import android.webkit.WebSettings


class YoutubeActivity : AppCompatActivity() {
    private var x:Int=10
    private lateinit var binding: ActivityYoutubeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window,false)
        super.onCreate(savedInstanceState)
        binding = ActivityYoutubeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initYoutubePlayer()
    }
    private val youtubeId = "MWASeaYuHZo"
    private fun initYoutubePlayer(){
        val webSettings: WebSettings = binding.youtubeWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        binding.youtubeWebView.loadUrl("https://www.youtube.com/embed/$youtubeId")
    }
}