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
println("Однажды, в студеную зимнюю пору")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAGS,"OnResume")
        println("Гляжу, поднимается медленно в гору")
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAGS,"OnStart")
        println("Я из лесу вышел; был сильный мороз.")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAGS,"OnStop")
        println("Лошадка, везущая хворосту воз.")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAGS,"OnPause")
        println("И шествуя важно, в спокойствии чинном,")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAGS,"OnDestroy")
        println("Лошадку ведет под уздцы мужичок")
    }
}