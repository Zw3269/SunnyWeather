package com.sunnyweather.android.logic.model

data class PlaceResPonse(val status: String, val places: List<Place>)
data class Place(val name: String, val location: Location, @SeriaLizedName("formatted_address") val address: String)
data class Location(val lng: String, val lat: String)