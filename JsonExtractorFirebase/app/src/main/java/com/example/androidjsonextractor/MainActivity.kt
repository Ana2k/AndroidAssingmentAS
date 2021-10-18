package com.example.androidjsonextractor

import androidx.fragment.app.FragmentManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.fragment.NavHostFragment

//https://github.com/anoopg87/NavController/blob/master/app/src/main/java/com/example/navcomponents/NavigationActivity.kt
//for understading when to switch the nav and when not to...conditional switching based.
//from the article
//https://medium.com/@anoopg87/set-start-destination-for-navhostfragment-dynamically-b072a29bfe49

class MainActivity : AppCompatActivity() {//we have used the navigation based architecture here.
    //for other architecture types of navigation
    //you can refer to FragmentMenuNavGraph or RecyclerViewYT app

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       //setup navgraph here
        //https://stackoverflow.com/questions/50730494/new-navigation-component-from-arch-with-nested-navigation-graph
        //good article to understand the flow of this.
        //https://medium.com/@muhamed.riyas/navigation-component-the-complete-guide-c51c9911684
        //for overall code writing
        val host: NavHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val graphInflater = host.navController.navInflater
        val navController = host.navController
        val navGraph = graphInflater.inflate(R.navigation.nav_graph)
        navGraph.startDestination = R.id.usersFragment
        navController.graph = navGraph
    }


}