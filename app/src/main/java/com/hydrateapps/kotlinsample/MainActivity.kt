package com.hydrateapps.kotlinsample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // The following line does not crash when kotlin version is < 2.2.0
        // But does crash when the kotlin version is 2.2.*.
        // This crash is expected, seeing as the resource ID does not exist in
        // the layout and the view will not be found. However I'm trying to
        // understand why this didn't previously crash prior to kotlin 2.2.0
        // and what has changed to make this crash (as expected).
        textView = findViewById(R.id.alternative_text_view)
    }
}
