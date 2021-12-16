package io.kodif.simple

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import io.kodif.android.ui.app.KodifActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.run_kodif)
        btn.setOnClickListener { startActivity(Intent(this, KodifActivity::class.java)) }
    }
}