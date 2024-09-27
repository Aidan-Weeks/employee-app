fun main(){
    println("Pay Slip Printer")
    println(
    """-----------------------------------------------
        |              monthly Payslip                |
        |                                             |
        |---------------------------------------------|
        |                                             |
        | employee Name: $firstName $Surname $gender Employee ID: $employeeId |
        |                                            |
        ----------------------------------------------
        |                                            |
        | PAYMENT DETAILS      DEDUCTION DETAILS     |
        |                                            |
        ----------------------------------------------
        |   Salary:  ${"%.2f".format(grossSalary/12)}       PAYE:  ${"%.2f".format(((grossSalary/12)/100)*PAYE)}    |
        |   Bonus: ${"%.2f".format(bonus)}       PRSI: + ${"%.2f".format(((grossSalary/12)/100)*PRSI)}      |
        |              Cycle To Work: + ${CycleToWorkScheme} +     |
        |                                            |
        ----------------------------------------------
        |  Gross:  ${"%.2f".format((grossSalary/12) + bonus)}      Total Deductions:   ${"%.2f".format(((grossSalary/12)/100)*PAYE + ((((grossSalary/12)/100)*PRSI) + CycleToWorkScheme))}  |
        |                                            |
        ----------------------------------------------
        |             Net Pay:  + ${"%.2f".format((((grossSalary/12) + bonus) - (((grossSalary/12)/100)*PAYE) + ((grossSalary/12)/100)*PRSI) + CycleToWorkScheme)}             |
        |                                            |
        ----------------------------------------------""")

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
