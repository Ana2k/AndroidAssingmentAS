package com.example.androidjsonextractor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidjsonextractor.databinding.FragmentUserListBinding
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class UsersFragment: Fragment() {

    private lateinit var itemsUsers: UsersProperty
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //val view = inflater.inflate(R.layout.fragment_user_list,container,false)
        //do we need this view at all?
        val binding = FragmentUserListBinding.inflate(inflater)

        initViewModel(binding)//ERROR, itemsUsers not initialised.
        return binding.root
    }


    @DelicateCoroutinesApi
    private fun initViewModel(binding: FragmentUserListBinding) {
        GlobalScope.launch{
            itemsUsers = UsersApi.retrofitService.getAllUsers()
        }//Retrofit call in non main thread.

        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(activity)
        val decoration = DividerItemDecoration(activity, DividerItemDecoration.HORIZONTAL)
        recyclerView.addItemDecoration(decoration)

        ///adapter
        recyclerView.adapter = UsersAdapter(requireContext(),itemsUsers)//ERROR, itemsUser not initialised
        //https://medium.com/@jencisov/androids-data-binding-with-kotlin-df94a24ffc0f
        //for the plugins that were added and how they worked.
    }

}