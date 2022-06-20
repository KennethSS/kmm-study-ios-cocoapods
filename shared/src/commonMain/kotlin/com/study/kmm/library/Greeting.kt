package com.study.kmm.library

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}