package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val drawerLayout : DrawerLayout  = findViewById(R.id.my_drawer_layout)
        drawerLayout.setOnClickListener { launchmypage()}
    }

   private fun launchmypage(){

    }
}