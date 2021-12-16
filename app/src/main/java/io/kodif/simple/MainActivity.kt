package io.kodif.simple

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import io.kodif.android.ui.app.KodifActivity
import io.kodif.android.utils.Constants

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO: first step you should set up requests params

        Constants.BASE_URL = "https://api.kodif.io"
        Constants.flowUuid = ""
        Constants.companyId = 0
        Constants.version = ""
        Constants.initialParams = mapOf("email" to "")

        val btn = findViewById<Button>(R.id.run_kodif)
        btn.setOnClickListener {
            startActivity(Intent(this, KodifActivity::class.java))
        }

        val btn1 = findViewById<Button>(R.id.run_kodif_fragment)
        btn1.setOnClickListener {
            startActivity(Intent(this, SimpleUsingKodifFragment::class.java))
        }
    }
}