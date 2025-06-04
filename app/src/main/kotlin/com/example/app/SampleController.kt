package com.example.app

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {
    @GetMapping("/hello")
    fun hello(): String = "Hello from SampleController!"
}

