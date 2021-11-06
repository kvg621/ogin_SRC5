package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R.layout.main_activity

class MainActivity : AppCompatActivity() {

val TAGS:String="DEBUG_SYS"
    override fun onCreate(savedInstanceState: Bundle?) {
              super.onCreate(savedInstanceState)
        setContentView(main_activity)
        Log.d(TAGS,"Однажды, в студеную зимнюю пору")

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAGS,"Гляжу, поднимается медленно в гору")

    }
    override fun onStart() {
        super.onStart()
        Log.d(TAGS,"Я из лесу вышел; был сильный мороз.")

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAGS,"И шествуя важно, в спокойствии чинном,")

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAGS,"Лошадка, везущая хворосту воз.")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAGS,"Лошадку ведет под уздцы мужичок")

    }
}
/*
Однажды, в студеную зимнюю пору
Я из лесу вышел; был сильный мороз.
Гляжу, поднимается медленно в гору
Лошадка, везущая хворосту воз.
И шествуя важно, в спокойствии чинном,
Лошадку ведет под уздцы мужичок

*/
