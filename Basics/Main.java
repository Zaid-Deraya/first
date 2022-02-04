// package Basics;

// enum Department
// {
// IT,ADMIN,HR,TRAINING
// }
// abstract class Employee
// {
// private String employeeId;
// private short employeeAge;
// private Department employeeVertical;
// private float employeeSalary;

// abstract void CalculateTax();
// public float GetEmployeeSalary()
// {
// return this.employeeSalary;
// }
// Employee()
// {
// System.out.println("EMPLOYEE CONSTRUCTOR CALLED");
// }
// //1 parameter user-defined constructor
// Employee(int data)
// {
// System.out.println("EMPLOYEE WITH 1 ARG");
// }
// Employee(String id, short age, Department type, float salary)
// {
// this.employeeId = id;
// this.employeeAge = age;
// this.employeeVertical = type;
// this.employeeSalary = salary;
// }
// }
// class Manager extends Employee
// {
// short employeeTeamSize;
// @Override
// void CalculateTax()
// {
// System.out.println("Salary for this employee will be 10% of salary which is"
// + 0.1 * this.GetEmployeeSalary());
// }
// void DecideMeetingSlot()
// {
// System.out.println("Meeting at 11AM");
// }
// Manager(String id, short age, Department type, float salary, short teamSize)
// {
// super(id,age,type,salary);
// this.employeeTeamSize=teamSize;
// }
// }
// class Director extends Manager
// { String directorLocation;
// void PresentReport()
// {
// System.out.println("REPORT FOR THIS YEAR PRESENTED");
// }

// Director()
// {
// System.out.println("ggCONSTRUCTOR CALLED");
// }
// Director(String id,short age, Department type,float salary,short teamSize,
// String location)
// {
// super(id,age,type,salary,teamSize);
// this.directorLocation =location;
// }
// }
// public class Main
// {
// public static void main(String[] args)
// {
// Director d1 = new Director("TORUS101",(short) 28, Department.TRAINING,
// (float)20000 , (short) 10, "Mumbai");
// System.out.println(d1);

// //Director obj1=new Employee();
// Employee obj = new Director();
// }
// }
// //Employee data members: salary,name,age,department
// //manager data members(Employees PLUS) teamSize
// //Director data members: (MANAGERS PLUS) location

// /*
// To create a director object, I must pass
// i)
// */