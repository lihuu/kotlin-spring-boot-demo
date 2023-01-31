package com.example.test

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * @author lihu
 * @since 2023/1/31 10:59
 */
@RestController
@RequestMapping("/test")
class TestController {
    @GetMapping("/hello")
    fun hello(name: String):ResponseEntity<String>{
        return ResponseEntity.ok("hello,${name}")
    }
}