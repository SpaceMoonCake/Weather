package com.example.weather.model.entities

class Weather {
    val city: City = getDefaultCity()
    val temperature: Int = 0
    val feelsLike: Int = 0

    private fun getDefaultCity() = City("Москва", 55.55555555555, 66.4444444444)
}