package org.example.microservice

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.example.microservice.KotlinService
import org.example.microservice.Entitys
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody


@RestController
@RequestMapping("/api")
class Controller (private val kotlinService: KotlinService){

    @PostMapping("/hello")
    suspend fun controller(@Validated @RequestBody Entitys: Entitys): ResponseEntity<String> {
        val result = kotlinService.hello(Entitys)
        return ResponseEntity.ok(result)

    }

}