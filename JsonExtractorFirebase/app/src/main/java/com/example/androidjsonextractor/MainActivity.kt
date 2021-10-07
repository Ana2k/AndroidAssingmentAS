package com.example.androidjsonextractor

import androidx.fragment.app.FragmentManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction


class MainActivity : AppCompatActivity() {//we have used the navigation based architecture here.
    //for other architecture types of navigation
    //you can refer to FragmentMenuNavGraph or RecyclerViewYT app

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       //setup navgraph here
    }


}