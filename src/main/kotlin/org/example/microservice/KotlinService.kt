package org.example.microservice

import org.springframework.stereotype.Service
import org.example.microservice.Repository
import kotlin.math.log

@Service
class KotlinService(private val repository: Repository){


    fun hello(entity: Entitys): String{
        validation(entity)
        repository.save(entity)
        return "Hello ${entity.name}"
    }


    fun validation(request: Entitys):String {
        val id = request.id ?: throw IllegalArgumentException("Id must be provided")
        require(request.name.isNotBlank()) { "Name must not be blank" }
        println("ok")
        return "VALID"
    }

}