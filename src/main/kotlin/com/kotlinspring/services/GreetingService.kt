package com.kotlinspring.services

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class GreetingService {

    @Value("\${message}")
    lateinit var message: String

    fun retrieveGreeting(name: String): String {
        return "$name, $message"
    }
}