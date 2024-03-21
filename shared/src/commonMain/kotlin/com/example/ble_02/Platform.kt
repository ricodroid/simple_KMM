package com.example.ble_02

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform