package org.example.microservice

import org.springframework.stereotype.Service
import org.example.microservice.Repository
import kotlin.math.log

@Service
class KotlinService(private val repository: Repository){


    fun hello(entity: Entity) {
        validation(entity)
        repository.save(entity)





    }


    fun validation(request: Entity) {
        if (request.id.isEmpty()) {
            throw Exception("ERROR id cant be empty")

        }
        if (request.id.length > 10) {
            throw Exception("ERROR id cant be greater than 10")

        }
        if (request.id.length < 10) {
            throw Exception("ERROR id cant be less than 10")

        }
        if (request.id.length != 10) {
            throw Exception("ERROR id cant be 10")

        }
        else {
            println("OK")
        }

    }
}