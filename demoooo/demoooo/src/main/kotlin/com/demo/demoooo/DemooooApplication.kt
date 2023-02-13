package com.demo.demoooo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.Scanner
@SpringBootApplication
class DemooooApplication

fun main(args: Array<String>) {
	val reader = Scanner(System.`in`)
	print("Enter a number: ")
	var integer:Int = reader.nextInt()
	println("You entered: $integer")
	runApplication<DemooooApplication>(*args)
}
