package oop

class Automobile {
    var mode: String
    var year: Int

    init{
        println("initializer Block")
    }

    constructor(mode: String, year: Int) {
        this.mode = mode
        this.year = year
        println("Car Model is: = $mode")
        println("Car year is: = $year")
    }
}