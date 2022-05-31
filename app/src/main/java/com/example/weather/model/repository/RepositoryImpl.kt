package com.example.weather.model.repository

import com.example.weather.model.entities.Weather
import com.example.weather.model.entities.getRussianCities
import com.example.weather.model.entities.getWorldCities

class RepositoryImpl: Repository {

    override fun getWeatherFromServer() = Weather()
    override fun getWeatherFromLocalStorageRus() = getRussianCities()
    override fun getWeatherFromLocalStorageWorld() = getWorldCities()

}
