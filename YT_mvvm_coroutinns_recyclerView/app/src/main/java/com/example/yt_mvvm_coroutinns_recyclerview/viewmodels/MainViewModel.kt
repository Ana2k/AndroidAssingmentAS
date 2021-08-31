package com.example.yt_mvvm_coroutinns_recyclerview.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.yt_mvvm_coroutinns_recyclerview.models.RecyclerList
import kotlinx.coroutines.Dispatchers
import okhttp3.Dispatcher

class MainViewModel: ViewModel() {
    lateinit var recyclerListLiveData: MutableLiveData<RecyclerList>

    init {
        recyclerListLiveData = MutableLiveData()
    }

    fun getRecyclerListObserver(): MutableLiveData<RecyclerList> {
        return recyclerListLiveData
    }

    fun makeApiCall() {
        viewModelScope.launch(Dispatchers.IO) {

        }

    }
}