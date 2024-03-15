package com.example.kotlindemo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldDemo {
    //kotlin 集成 springboot demo

    @GetMapping("hello/{name}")
    fun helloDemo(@PathVariable name:String):String {
        return "hello, $name"
    }
}