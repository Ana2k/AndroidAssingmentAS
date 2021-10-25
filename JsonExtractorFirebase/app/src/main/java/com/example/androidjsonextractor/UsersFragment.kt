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
    private lateinit var itemsUsers: List<UsersProperty>//instead of lateinit we are trying this.
    private lateinit var binding: FragmentUsersBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentUsersBinding.inflate(inflater)
        return binding.root
    }


    @DelicateCoroutinesApi
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG,"OnViewCreated Called")
        initREtrofitRecyclerViewCall(binding)//the @GET() call was not right. it should have ebeen @GET(<extension base url>)
    }

    @DelicateCoroutinesApi
    private fun initREtrofitRecyclerViewCall(binding: FragmentUsersBinding) {
        GlobalScope.launch {
            Log.d(TAG,"Inside initRetrofitCall -- global Scope")
            try {
                itemsUsers = UsersApi.retrofitService.getAllUsers()
//                Log.d(TAG, itemsUsers.toString())
            }
            catch (e:Exception){
                Log.d("ERROR",e.toString())
            }

            //RECYCLER VIEW
            val recyclerView = binding.recyclerView
            Log.d("RecyclerView1",recyclerView.toString())
            recyclerView.layoutManager = LinearLayoutManager(activity)//ERROR here with the layout.???
            Log.d("RecyclerView2",recyclerView.layoutManager.toString())
            val decoration = DividerItemDecoration(activity, DividerItemDecoration.HORIZONTAL)
            recyclerView.addItemDecoration(decoration)
            Log.d("RecyclerView3",recyclerView.toString())

            ///adapter
            recyclerView.adapter = UsersAdapter(requireContext(), itemsUsers) //ERROR, itemsUser not initialised
            Log.d("RecyclerView",recyclerView.adapter.toString())
            Log.d("RecyclerView4",itemsUsers.toString())


        }
        //https://github.com/peculiaruc/RickyandMortyApp/tree/master/app/src/main/java/com/pecpacker/rickyandmortyapp
        //for basic skeleton trying to refer this.
    }


}
//https://proandroiddev.com/suspend-what-youre-doing-retrofit-has-now-coroutines-support-c65bd09ba067
//coroutines now need lesser code.
//https://medium.com/@jencisov/androids-data-binding-with-kotlin-df94a24ffc0f
//for the plugins that were added and how they worked.