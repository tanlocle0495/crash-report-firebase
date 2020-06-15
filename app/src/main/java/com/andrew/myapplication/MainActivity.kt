package com.andrew.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.google.firebase.crashlytics.FirebaseCrashlytics
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    var crashButton: Button? = null;
    var edt: EditText? = null;
    var i = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnDemo.setOnClickListener {
            try {
                edt!!.apply {
                    text = null;
                }
            } catch (e: Exception) {
                throw RuntimeException("Test Crash") // Force a crash

            }
        }
    }
}