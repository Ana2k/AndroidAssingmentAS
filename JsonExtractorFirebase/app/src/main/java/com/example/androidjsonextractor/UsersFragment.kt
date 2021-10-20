package com.example.androidjsonextractor

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.androidjsonextractor.databinding.FragmentUsersBinding
import com.example.androidjsonextractor.model.UsersProperty
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch




class UsersFragment: Fragment() {

    private val TAG = "Inside UsersFragment"
    private var itemsUsers: List<UsersProperty>? = null//instead of lateinit we are trying this.
    private lateinit var binding: FragmentUsersBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //val view = inflater.inflate(R.layout.fragment_user_list,container,false)
        //do we need this view at all?
        binding = FragmentUsersBinding.inflate(inflater)

        Log.d(TAG,"Did the REtrofit Call-- in onCreate")
        initialiseRecyclerView(binding)
        Log.d(TAG,"Did the RecyclerView Call-- in onCreate")
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRetrofitCall()//ERROR, itemsUsers not initialised.
    }

    private fun initialiseRecyclerView(binding: FragmentUsersBinding) {

        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(activity)
        val decoration = DividerItemDecoration(activity, DividerItemDecoration.HORIZONTAL)
        recyclerView.addItemDecoration(decoration)

        ///adapter
        recyclerView.adapter =
            itemsUsers?.let { UsersAdapter(requireContext(), it) }//ERROR, itemsUser not initialised
    }


    private fun initRetrofitCall() {
        GlobalScope.launch {
            Log.d(TAG,"Inside initRetrofitCall -- global Scope")
            itemsUsers = UsersApi.retrofitService.getAllUsers()
            Log.d(TAG, itemsUsers.toString())
        }
    }


}
//https://proandroiddev.com/suspend-what-youre-doing-retrofit-has-now-coroutines-support-c65bd09ba067
//coroutines now need lesser code.
//https://medium.com/@jencisov/androids-data-binding-with-kotlin-df94a24ffc0f
//for the plugins that were added and how they worked.