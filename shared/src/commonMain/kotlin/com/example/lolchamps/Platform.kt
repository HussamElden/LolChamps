package com.example.lolchamps

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform