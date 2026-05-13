package com.owlite.mora

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform