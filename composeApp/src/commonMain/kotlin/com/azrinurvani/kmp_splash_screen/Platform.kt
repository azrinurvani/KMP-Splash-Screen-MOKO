package com.azrinurvani.kmp_splash_screen

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform