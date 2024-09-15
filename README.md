fun main(){
    println("Pay Slip Printer")
    println("-------------------------------------------")
    println("|              monthly Payslip            |")
    println("|                                         |")
    println("-------------------------------------------")
    println("|                                         |")
    println("| employee Name: " + firstName + " " + Surname + gender + " Employee ID: " + employeeId + " |")
    println("|                                         |")
    println("-------------------------------------------")
    println("|                                         |")
    println("| PAYMENT DETAILS      DEDUCTION DETAILS  |")
    println("|                                         |")
    println("-------------------------------------------")
    println("|   Salary: " + "%.2f".format(grossSalary/12) + "       PAYE: " + "%.2f".format(((grossSalary/12)/100)*PAYE) + "   |")
    println("|   Bonus: " +"%.2f".format(bonus) + "       PRSI: " + "%.2f".format(((grossSalary/12)/100)*PRSI) + "     |")
    println("|                Cycle To Work: " + CycleToWorkScheme + "     |")
    println("|                                         |")
    println("-------------------------------------------")
    println("|  Gross: " + "%.2f".format((grossSalary/12) + bonus) + "    Total Deductions: " + "%.2f".format((((grossSalary/12)/100)*PAYE) + ((((grossSalary/12)/100)*PRSI) + CycleToWorkScheme)) + "  |")
    println("|                                         |")
    println("-------------------------------------------")
    println("|             Net Pay: " + "%.2f".format(((grossSalary/12) + bonus) - ((((grossSalary/12)/100)*PAYE) + ((grossSalary/12)/100)*PRSI) + CycleToWorkScheme) + "            |")
    println("|                                         |")
    println("-------------------------------------------")

}

val firstName = "Joe"
val Surname = "soap"
val gender = "(m)"
val employeeId = 6143
val grossSalary = 67_543.21
val PAYE = 38.5
val PRSI = 5.2
val bonus = 1450.50
val CycleToWorkScheme = 54.33
