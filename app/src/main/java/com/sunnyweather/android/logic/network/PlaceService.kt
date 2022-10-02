package com.sunnyweather.android.logic.network

import com.sunnyweather.android.SunnyWeatherApplication

interface PlaceService {
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>

}