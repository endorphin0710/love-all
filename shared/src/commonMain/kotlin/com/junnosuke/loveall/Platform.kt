package com.junnosuke.loveall

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform