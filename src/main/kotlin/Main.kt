package ie.setu

import ie.setu.EmployeeAPI
import ie.setu.Employee
import mu.KotlinLogging
import kotlin.math.round

var employees = EmployeeAPI()
val logger = KotlinLogging.logger {}

fun main(args: Array<String>){
    logger.info { "Launching Employee App" }
    start()
}

fun menu() : Int {
    print(""" 
         |Employee Menu
         |   1. Add Employee
         |   2. List All Employees
         |   3. Search Employees 
         |   4. Print Payslip for Employee
         |  -1. Exit
         |       
         |Enter Option : """.trimMargin())
    return readln().toInt()
}

fun start() {
    var input: Int

    do {
        input = menu()
        when (input) {
            1 -> add()
            2 -> list()
            3 -> search()
            4 -> paySlip()
            -99 -> dummyData()
            -1 -> println("Exiting App")
            else -> println("Invalid Option")
        }
        println()
    } while (input != -1)
}

fun list(){
    logger.info { "Listing Employees" }
    employees.findAll()
        .forEach{ println(it) }
}

fun search() {
    logger.info { "Searching Employees" }
    val employee = getEmployeeById()
    if (employee == null)
        println("No employee found")
    else
        println(employee)
}

internal fun getEmployeeById(): Employee? {
    print("Enter the employee id to search by: ")
    val employeeID = readLine()!!.toInt()
    return employees.findOne(employeeID)
}

fun paySlip(){
    val employee = getEmployeeById()
    if (employee != null)
        println(employee.getPayslip())
}

fun dummyData() {
    employees.create(Employee("Joe", "Soap", 'm', 0, 35655.43, 31.0, 7.5, 2000.0, 25.6))
    employees.create(Employee("Joan", "Murphy", 'f', 0, 54255.13, 32.5, 7.0, 1500.0, 55.3))
    employees.create(Employee("Mary", "Quinn", 'f', 0, 75685.41, 40.0, 8.5, 4500.0, 0.0))
}

fun add(){
    logger.info { "Adding an Employee" }
    print("Enter first name: ")
    val firstName = readlnOrNull().toString()
    print("Enter surname: ")
    val surname = readlnOrNull().toString()
    print("Enter gender (m/f): ")
    val gender = readln().toCharArray()[0]
    print("Enter gross salary: ")
    val grossSalary = readln().toDouble()
    print("Enter PAYE %: ")
    val payePercentage = readln().toDouble()
    print("Enter PRSI %: ")
    val prsiPercentage = readln().toDouble()
    print("Enter Annual Bonus: ")
    val annualBonus= readln().toDouble()
    print("Enter Cycle to Work Deduction: ")
    val cycleToWorkMonthlyDeduction= readln().toDouble()

    employees.create(Employee(firstName, surname, gender, 0, grossSalary, payePercentage, prsiPercentage, annualBonus, cycleToWorkMonthlyDeduction))
}

//https://discuss.kotlinlang.org/t/how-do-you-round-a-number-to-n-decimal-places/8843
//There are several options...try each of them out
fun roundTwoDecimals(number: Double) = round(number * 100) / 100
//fun roundTwoDecimals(number: Double) = "%.2f".format(number).toDouble()