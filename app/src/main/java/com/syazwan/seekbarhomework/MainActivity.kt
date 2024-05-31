package com.syazwan.seekbarhomework

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun MgSnack(view: View){
        Snackbar.make(findViewById(R.id.sendMessage),
            "Your email has been sent successfully",Snackbar.LENGTH_LONG)
            .setAction("OK"){}.setActionTextColor(Color.RED).show()
    }
}