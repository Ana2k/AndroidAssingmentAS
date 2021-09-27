package com.example.androidjsonextractor

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidjsonextractor.databinding.ItemLayoutBinding

class UsersAdapter(val context: Context,val mItemsList: UsersProperty): RecyclerView.Adapter<UsersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemLayoutBinding.inflate(inflater,parent,false)

        return UsersViewHolder(binding)
    }
    //Written from ExampleItemAdapter in our gloc
    //link:https://github.com/Ana2k/Recycler-and-CardView/blob/main/app/src/main/java/com/example/ExampleItemAdapter.kt


    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) {

        val items = mItemsList.data//this is the entire list
        val singleItem = items?.get(position)
        holder.bind(singleItem)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}