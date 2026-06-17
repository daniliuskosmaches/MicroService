package org.example.microservice

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<MicroServiceApplication>().with(TestcontainersConfiguration::class).run(*args)
}
