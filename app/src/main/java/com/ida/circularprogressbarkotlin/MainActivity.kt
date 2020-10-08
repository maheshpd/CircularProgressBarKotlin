package com.ida.circularprogressbarkotlin

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progress_circle.apply {
            progressMax = 100f
            setProgressWithAnimation(50f, 1000)
            progressBarWidth = 5f
            backgroundProgressBarWidth = 7f
            progressBarColor = Color.GREEN
        }
    }
}