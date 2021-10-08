package com.example.androidjsonextractor

import androidx.fragment.app.FragmentManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction


class MainActivity : AppCompatActivity() {//we have used the navigation based architecture here.


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpFragments()
    }

    private fun setUpFragments() {//fragment Transaction
        val fragment = UsersFragment()
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(android.R.id.content,fragment)

        fragmentTransaction.commit()

//        val fragmentManager: FragmentManager = supportFragmentManager
//        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(android.R.id.content,fragment)
//        //android.R.id.content gives you the root element of a view, without having to know its actual name/type/ID.
//        fragmentTransaction.commit()
    }
}