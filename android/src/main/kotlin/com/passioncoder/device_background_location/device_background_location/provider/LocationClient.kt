package com.passioncoder.device_background_location.device_background_location.provider

enum class LocationClient(val value: Int) {
    Google(0), Android(1);

    companion object {
        fun fromInt(value: Int) = values().firstOrNull { it.value == value }
    }
}