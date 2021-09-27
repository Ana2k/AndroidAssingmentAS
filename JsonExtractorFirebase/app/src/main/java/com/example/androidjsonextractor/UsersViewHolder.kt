package com.example.androidjsonextractor

import androidx.recyclerview.widget.RecyclerView
import com.example.androidjsonextractor.databinding.ItemLayoutBinding

class UsersViewHolder(private val binding: ItemLayoutBinding): RecyclerView.ViewHolder(binding.root) {
        val userId = binding.id
        val name = binding.name
        val userName = binding.userName
        val email = binding.email

        val street = binding.addressStreet
        val suite = binding.addressSuite
        val city = binding.addressCity
        val zipCode = binding.addressZipcode

        val latitude= binding.geoLatitude
        val longitude= binding.geoLongitude

        val phone = binding.phone
        val website = binding.website

        val companyName = binding.companyName
        val companyBs = binding.companyBs
        val catchPhrase = binding.catchPhrase

//         must be run on the ui thread.
//        fun bind(item: UsersProperty)

}
