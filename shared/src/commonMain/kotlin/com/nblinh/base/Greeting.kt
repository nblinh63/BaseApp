package com.nblinh.base

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}