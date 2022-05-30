package com.example.weather.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.weather.model.AppState
import com.example.weather.model.repository.Repository

class MainViewModel (private val repository: Repository) : ViewModel() {
    private val localLiveData = MutableLiveData<AppState>()
    val liveData: LiveData<AppState> get() = localLiveData

    fun getWeatherFromLocalSourceRus() = getDataFromLocalSource(true)

    private fun getDataFromLocalSource(isRussian: Boolean) {
        localLiveData.value = AppState.Loading
        Thread {
            Thread.sleep(1000)
            localLiveData.postValue(
                if (isRussian) {
                    AppState.Success(repository.getWeatherFromLocalStorageRus())
                } else {
                    AppState.Success(repository.getWeatherFromLocalStorageWorld())
                }
            )
        }.start()
    }

    fun getWeatherFromLocalSourceWorld() = getDataFromLocalSource(false)




}