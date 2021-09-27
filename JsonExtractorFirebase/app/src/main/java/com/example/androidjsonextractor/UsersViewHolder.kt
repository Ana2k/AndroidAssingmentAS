package com.example.androidjsonextractor

import androidx.recyclerview.widget.RecyclerView
import com.example.androidjsonextractor.databinding.ItemLayoutBinding
import com.example.androidjsonextractor.model.Data

class UsersViewHolder(private val binding: ItemLayoutBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(singleItem: Data?) {//Data is the UsersProperty custom data type of list.. check UsersProperty
                binding.id.text = singleItem?.userId
                binding.name.text = singleItem?.name
                binding.userName.text = singleItem?.userName
                binding.email.text = singleItem?.email

                binding.addressStreet.text = singleItem?.address?.street
                binding.addressSuite.text = singleItem?.address?.suite
                binding.addressCity.text = singleItem?.address?.city
                binding.addressZipcode.text = singleItem?.address?.zipCode

                binding.geoLatitude.text = singleItem?.geo?.latitude.toString()
                binding.geoLongitude.text = singleItem?.geo?.longitude.toString()

                binding.phone.text = singleItem?.phone
                binding.website.text = singleItem?.website

                binding.companyName.text = singleItem?.company?.companyName
                binding.companyBs.text = singleItem?.company?.companyBs
                binding.catchPhrase.text = singleItem?.company?.companyCatchPhrase
        }

        //the links used for this entire program include
        // https://www.youtube.com/watch?v=zdfbHzBmzk8 basic overeview
        //https://johncodeos.com/how-to-parse-json-with-retrofit-converters-using-kotlin/
        //and marsReal estate app along with
        //https://github.com/Ana2k/Recycler-and-CardView/tree/main/app/src/main/java/com/example
        //mainly for the semi mvvm and adapter structure :)

}
