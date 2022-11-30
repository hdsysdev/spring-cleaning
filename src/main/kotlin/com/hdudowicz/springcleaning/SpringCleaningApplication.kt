package com.hdudowicz.springcleaning

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCleaningApplication

fun main(args: Array<String>) {
	runApplication<SpringCleaningApplication>(*args)
}
