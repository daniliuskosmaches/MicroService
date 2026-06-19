package org.example.microservice

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.example.microservice.KotlinService
import org.example.microservice.Entity
import org.springframework.http.ResponseEntity


@RestController
@RequestMapping("/api")
class Controller (private val KotlinService: KotlinService){

    @RequestMapping("/hello")
    fun controller(Entity: Entity): ResponseEntity<T> {
        KotlinService.hello(Entity)
        return ResponseEntity.ok().build()
    }

}