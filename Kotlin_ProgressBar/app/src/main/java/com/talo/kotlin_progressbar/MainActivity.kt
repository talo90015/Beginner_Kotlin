package com.talo.kotlin_progressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var progressBar = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        updateProgressBar()

        add.setOnClickListener{
            if (progressBar <= 90){
                progressBar += 10
                updateProgressBar()
            }
        }
        sub.setOnClickListener{
            if (progressBar >= 10){
                progressBar -= 10
                updateProgressBar()
            }
        }
    }
    private fun updateProgressBar(){
        progress_bar.progress = progressBar
        progress_bar_view.text = "$progressBar%"
    }
}