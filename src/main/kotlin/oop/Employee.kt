package oop

open class Employee(name: String, age: Int, salary: Float) {
    var employee_name = name
}

class Programmer(name: String, age: Int, salary: Float): Employee(name, age, salary){
    fun getName(): String{
        return employee_name
    }
}

class Salesman(name: String, age: Int, salary: Float): Employee(name, age, salary){

}

class BusinessAnalyst(name: String, age: Int, salary: Float): Employee(name, age, salary){

}