package com.ebabu.fancontrollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myDialView.listener = object : OnValueChangeListener {
            override fun speed(num: String) {
                println("current speed $num")
            }
        }
    }
}
