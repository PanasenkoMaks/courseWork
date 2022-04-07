package com.company;

public class Main {
    private static final Employee[] storage = new Employee[10];

    public static void main(String[] args) {
        Employee employee = new Employee("Ivanov", 1, 188_000);
        Employee employee2 = new Employee("Petrov", 1, 122_222);
        Employee employee3 = new Employee("Sidorov", 2, 44_332);
        Employee employee4 = new Employee("Putin", 2, 2_099);
        Employee employee5 = new Employee("Medvedev", 3, 1_333);
        Employee employee6 = new Employee("lykashenko", 2, 109);
    EmployeeBook book = new EmployeeBook(5);
    book.addEmployee(employee);
    book.addEmployee(employee2);
    book.addEmployee(employee3);
    book.addEmployee(employee4);
    book.addEmployee(employee5);
    book.addEmployee(employee6);
    book.setSallaryDepartment("Ivanov", 222, 4);
    book.printStarage();
    book.deleteEmployee(5);
    book.printBook();
    }
    }
