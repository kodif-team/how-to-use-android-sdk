package io.kodif.simple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import io.kodif.android.ui.app.KodifFragment

class SimpleUsingKodifFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_using_kodif_fragment)

        val fragment = KodifFragment()

        //If you need to get some callBack from the SDK you should add callBack action in flow and implement this
        fragment.callBack = {
            Log.d("callback", it ?: "--")
        }

        val ft = supportFragmentManager.beginTransaction()
        ft.replace(R.id.container, fragment)
        ft.commit()
    }
}