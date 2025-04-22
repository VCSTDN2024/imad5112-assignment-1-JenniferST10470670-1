package com.example.clickcounter

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.TextView
import android.widget.Toast



class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val clickNumberTxt = findViewById<TextView>(R.id.clickNumberTxt)
        val clickBtn = findViewById<Button>(R.id.clickBtn)
        var timesClicked = 0

        clickBtn.setOnClickListener {
            timesClicked += 1
            clickNumberTxt.text = timesClicked.toString()
            Toast.makeText(this, "Clicks $timesClicked", Toast.LENGTH_LONG).show()
        }

    }
}




