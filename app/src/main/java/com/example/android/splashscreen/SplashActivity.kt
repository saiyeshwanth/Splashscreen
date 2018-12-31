package com.example.android.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        val s1 = object : Thread() {
            override fun run() {
                try {
                    Thread.sleep(5000)
                    val i = Intent(this@SplashActivity,MainActivity::class.java)
                    startActivity(i)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
        s1.start()
    }
}