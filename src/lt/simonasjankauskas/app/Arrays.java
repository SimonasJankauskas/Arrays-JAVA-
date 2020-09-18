package lt.simonasjankauskas.app;

import java.lang.reflect.Array;

public class Arrays {
    public static void main(String[] args) {
    Employee employee1 = new Employee("Romas", "Zamolskis", "IT", 2500.00);
    Employee employee2 = new Employee("Saulius", "Velečka", "HR", 3500.00);
    Employee employee3 = new Employee("Henrikas", "Daktaras", "Account", 4500.00);
    Employee employee4 = new Employee("Pablo", "Escobar", "CEO", 11500.00);
    Employee employee5 = new Employee("Remigijus", "Daškevičius", "Sports", 1500.00);
    int i;
    Employee x;
    Employee[] employees = new Employee[5];
    employees[0] = employee1;
    employees[1] = employee2;
    employees[2] = employee3;
    employees[3] = employee4;
    employees[4] = employee5;



    for (i = 0; i < employees.length; i++) {
        x = employees[i];
        System.out.println(x + " ");
        }
    }
}
class Employee {
    private String name;
    private String surname;
    private String department;
    private double salary;

    public Employee (){}

    public Employee(String n, String s, String d, double slr) {
        this.name = n;
        this.surname = s;
        this.department = d;
        this.salary = slr;
    }
        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getSurname(){
            return this.surname;
        }
        public void setSurname(String surname) {
            this.surname = surname;
        }
        public String getDepartment(){
            return this.department;
        }
        public void setDepartment(String department) {
            this.department = department;
        }
        public double getSalary() {
            return this.salary;
        }
        public void setSalary(double salary) {
            this.salary = salary;
        }

    @Override
    public String toString() {
        return                 "Name:" + name +
                " Surname: " + surname +
                " Department: " + department +
                " Salary: " + salary;
    }
}

