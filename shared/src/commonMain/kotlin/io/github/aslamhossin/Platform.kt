package io.github.aslamhossin

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform