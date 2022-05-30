package com.example.weather.model.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Weather(val city: City = getDefaultCity(), val temperature: Int = 0, val feelsLike: Int = 0) : Parcelable

private fun getDefaultCity() = City("Москва", 55.55555555555, 66.4444444444)

fun getRussianCities() = listOf(
    Weather(City("Воронеж1", 55.55555555555, 66.444444444), 2, 23),
    Weather(City("Воронеж2", 55.55555555555, 66.444444444), 2, 23),
    Weather(City("Воронеж3", 55.55555555555, 66.444444444), 2, 23),
    Weather(City("Воронеж4", 55.55555555555, 66.444444444), 2, 23),
    Weather(City("Воронеж5", 55.55555555555, 66.444444444), 2, 23),
    Weather(City("Воронеж6", 55.55555555555, 66.444444444), 2, 23),
    Weather(City("Воронеж7", 55.55555555555, 66.444444444), 2, 23),
)

fun getWorldCities() = listOf(
    Weather(City("Париж1", 55.55555555555, 66.444444444), 2, 23),
    Weather(City("Париж2", 55.55555555555, 66.444444444), 2, 23),
    Weather(City("Париж3", 55.55555555555, 66.444444444), 2, 23),
    Weather(City("Париж4", 55.55555555555, 66.444444444), 2, 23),
    Weather(City("Париж5", 55.55555555555, 66.444444444), 2, 23),
    Weather(City("Париж6", 55.55555555555, 66.444444444), 2, 23),
    Weather(City("Париж7", 55.55555555555, 66.444444444), 2, 23),
)
