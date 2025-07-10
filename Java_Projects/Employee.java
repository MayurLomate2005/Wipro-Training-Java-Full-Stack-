package Java_Projects;

import java.util.Scanner;

class EmployeeDetails {
    int empNo;
    String name;
    int joinDate;
    char designationCode;
    String department;
    int basic, hra, it;

    EmployeeDetails(int empNo, String name, int joinDate, char designationCode, String department, int basic, int hra, int it) {
        this.empNo = empNo;
        this.name = name;
        this.joinDate = joinDate;
        this.designationCode = designationCode;
        this.department = department;
        this.basic = basic;
        this.hra = hra;
        this.it = it;
    }
}

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDetails[] empList = new EmployeeDetails[3]; // change to 10 if needed

        // Step 1: Input employees from user
        for (int i = 0; i < empList.length; i++) {
            System.out.println("\nEnter the Details of Employee " + (i + 1));

            System.out.print("Emp No: ");
            int empNo = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Join Date (as integer like 20200101): ");
            int date = sc.nextInt();
            sc.nextLine();

            System.out.print("Designation Code (e/c/k/r/m): ");
            char descCode = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Basic Pay: ");
            int basic = sc.nextInt();

            System.out.print("HRA: ");
            int hra = sc.nextInt();

            System.out.print("IT: ");
            int it = sc.nextInt();
            sc.nextLine();

            empList[i] = new EmployeeDetails(empNo, name, date, descCode, dept, basic, hra, it);
        }

        // Step 2: Get EmpNo from command-line args
        if (args.length == 0) {
            System.out.println("Please provide Emp No as command-line argument.");
            return;
        }

        int searchEmpNo = Integer.parseInt(args[0]);
        boolean found = false;

        // Step 3: Search and display
        for (EmployeeDetails emp : empList) {
            if (emp.empNo == searchEmpNo) {
                found = true;

                String designation = "";
                int da = 0;

                switch (emp.designationCode) {
                    case 'e': designation = "Engineer"; da = 20000; break;
                    case 'c': designation = "Consultant"; da = 32000; break;
                    case 'k': designation = "Clerk"; da = 12000; break;
                    case 'r': designation = "Receptionist"; da = 15000; break;
                    case 'm': designation = "Manager"; da = 40000; break;
                    default: designation = "Unknown"; da = 0;
                }

                int salary = emp.basic + emp.hra + da - emp.it;

                System.out.println("\nEmp No.  Emp Name   Department    Designation   Salary");
                System.out.printf("%-8d %-10s %-14s %-13s %d\n",
                        emp.empNo, emp.name, emp.department, designation, salary);
                break;
            }
        }

        if (!found) {
            System.out.println("No employee with empid : " + searchEmpNo);
        }

        sc.close();
    }
}
