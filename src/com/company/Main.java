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
        addEmployee(employee);
        addEmployee(employee2);
        addEmployee(employee3);
        addEmployee(employee4);
        addEmployee(employee5);
        printStarage();
        sumSalary();
        minMaxSallary();
        fullNameEmployee();
        increaseSallary();
        employeeMinSallary(2);
        employeSumSallary(2);
        employeIncreaseSallary(1, 10);
        employeDepartmenFullName(2);
        employeSallaryMinMAx(133_000);
    }

    private static void addEmployee(Employee employee) {
        int index = -1;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            storage[index] = employee;
        }
    }

    private static void printStarage() {
        for (int i = 0; i < storage.length; i++) {
            Employee employee = storage[i];
            if (employee == null) {
                break;
            }
            System.out.println(employee.getFullName() + " " + employee.getDepartment()
                    + " " + employee.getSallary() + " " + employee.getId());
        }
    }

    private static void sumSalary() {
        int sum = 0;
        int id = 0;
        for (Employee storage : storage) {
            if (storage == null) {
                break;
            }
            sum += storage.getSallary();
            id = storage.getId();
        }
        System.out.println("Сумма затрат за месяц " + sum);
        System.out.println("Средняя зарплата " + sum/id);
    }

    private static void minMaxSallary() {
        int min = storage[0].getSallary();
        int max = storage[0].getSallary();
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                break;
            }
            if (min > storage[i].getSallary()) {
                min = storage[i].getSallary();
            }
            if (max < storage[i].getSallary()) {
                max = storage[i].getSallary();
            }
        }
        System.out.println("Минимальная зарплата " + min);
        System.out.println("Максимальная зарплата " + max);
    }

    private static void fullNameEmployee() {
        String name;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                break;
            }
            name = storage[i].getFullName();
            System.out.print(" " + name);
        }
    }

    private static void increaseSallary() {
        double increaseSallary = 1.10;
        int salaryNew = 0;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                break;
            }
            salaryNew = storage[i].getSallary();
            salaryNew *= increaseSallary;
            System.out.println("Зарплаты с учетом изменения " + storage[i].getFullName() + " " + salaryNew);
        }
    }

    private static void employeeMinSallary(int department) {
        int min = storage[0].getSallary();
        int max = 0;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null && storage[i].getDepartment() == department) {
                if (max < storage[i].getSallary()) {
                    max = storage[i].getSallary();
                }
                if (min > storage[i].getSallary()) {
                    min = storage[i].getSallary();
                }
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой" + " в отделе "
                + department + " равна " + max);
        System.out.println("Сотрудник с минимальной зарплатой" + " в отделе "
                + department + " равна " + min);
    }

    private static void employeSumSallary(int department) {
        int sum = 0;
        int id = 0;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null && storage[i].getDepartment() == department) {
                sum += storage[i].getSallary();
                id = storage[i].getId();
            }
        }
        System.out.println("Сумма затрат за месяц" + " по отделу " + department + " равна " + sum);
        System.out.println("Среднии затраты за месяц" + " по отделу " + department + " равны " + sum/id);
    }

    private static void employeIncreaseSallary(int department, double increase) {
        int salaryNew;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null && storage[i].getDepartment() == department) {
                salaryNew = storage[i].getSallary();
                salaryNew *= (1 + (increase / 100));
                System.out.println("Зарплаты с учетом изменения " + " по отделу " + department + " "
                        + storage[i].getFullName() + " равна " + salaryNew);
            }
        }
    }

    private static void employeDepartmenFullName(int department) {
        String name;
        System.out.print("Сотрудники" + " в отделе " + department);
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null && storage[i].getDepartment() == department) {
                name = storage[i].getFullName();
                System.out.print(" " + storage[i].getFullName());
            }
        }
    }

    private static void employeSallaryMinMAx ( int num){
            int min = num;
            int max = num;
            String fullName = null;
            int id = 0;
            for (int i = 0; i < storage.length; i++) {
                if (storage[i] == null) {
                    break;
                }
                if (min > storage[i].getSallary()) {
                    min = storage[i].getSallary();
                    id = storage[i].getId();
                    fullName = storage[i].getFullName();
                }
                if (max < storage[i].getSallary()) {
                    max = storage[i].getSallary();
                    id = storage[i].getId();
                    fullName = storage[i].getFullName();
                }
            }
            System.out.println("\n" + "Сотрудник с минимальная зарплата " + fullName +
                    " id " + id + " зарплата - " + min);
            System.out.println("Сотрудник с максимальной зарплата " + fullName +
                    " id " + id + " зарплата - " + max);
        }
    }
