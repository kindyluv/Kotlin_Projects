package oop

class Person(val firstName: String, val lastName: String, var age: Int) {
    val fname: String
    val personAge: Int

    init{
        fname = firstName.capitalize()
        personAge = age

        println("First name = $fname")
        println("Person age = $personAge")
    }
}