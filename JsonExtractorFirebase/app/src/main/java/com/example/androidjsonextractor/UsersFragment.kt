package com.example.androidjsonextractor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.androidjsonextractor.databinding.FragmentUsersBinding
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class UsersFragment: Fragment() {

    private var itemsUsers: ArrayList<UsersProperty>? = null//instead of lateinit we are trying this.
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //val view = inflater.inflate(R.layout.fragment_user_list,container,false)
        //do we need this view at all?
        val binding = FragmentUsersBinding.inflate(inflater)
        initRetrofitCall(binding)//ERROR, itemsUsers not initialised.
        //initialiseRecyclerView(binding)

        return binding.root
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


    @DelicateCoroutinesApi
    private fun initRetrofitCall(binding: FragmentUsersBinding) {
        GlobalScope.launch {
            itemsUsers = UsersApi.retrofitService.getAllUsers()
        }
    }
}
//https://proandroiddev.com/suspend-what-youre-doing-retrofit-has-now-coroutines-support-c65bd09ba067
//coroutines now need lesser code.
//https://medium.com/@jencisov/androids-data-binding-with-kotlin-df94a24ffc0f
//for the plugins that were added and how they worked.