package com.example.test

import com.example.test.entity.ApiResponse
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
    
    @GetMapping("/helloResponse")
    fun helloResponse(name: String):ApiResponse<String>{
        return ApiResponse.successfulResponse("hello,$name")
    }
}