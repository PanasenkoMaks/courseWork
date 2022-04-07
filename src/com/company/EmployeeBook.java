package com.company;

import java.util.Locale;

public class EmployeeBook {
    private final Employee[] storage;
    int size;

    public EmployeeBook(int size) {
        this.storage = new Employee[size];
    }

    public void addEmployee(Employee employee) {
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

    public void printStarage() {
        for (int i = 0; i < storage.length; i++) {
            Employee employee = storage[i];
            if (employee == null) {
                break;
            }
            System.out.println(employee.getFullName() + " " + employee.getDepartment()
                    + " " + employee.getSallary() + " " + employee.getId());
        }
    }

    public void sumSalary() {
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
        System.out.println("Средняя зарплата " + sum / id);
    }

    public void minMaxSallary() {
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

    public void fullNameEmployee() {
        String name;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                break;
            }
            name = storage[i].getFullName();
            System.out.print(" " + name);
        }
    }

    public void increaseSallary() {
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

    public void employeeMinSallary(int department) {
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

    public void employeSumSallary(int department) {
        int sum = 0;
        int id = 0;
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null && storage[i].getDepartment() == department) {
                sum += storage[i].getSallary();
                id = storage[i].getId();
            }
        }
        System.out.println("Сумма затрат за месяц" + " по отделу " + department + " равна " + sum);
        System.out.println("Среднии затраты за месяц" + " по отделу " + department + " равны " + sum / id);
    }

    public void employeIncreaseSallary(int department, double increase) {
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

    public void employeDepartmenFullName(int department) {
        String name;
        System.out.print("Сотрудники" + " в отделе " + department);
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null && storage[i].getDepartment() == department) {
                name = storage[i].getFullName();
                System.out.print(" " + storage[i].getFullName());
            }
        }
    }

    public void employeSallaryMinMAx(int num) {
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

    public void deleteEmployee(int id) {
        for (int i = 0; i > storage.length; i++) {
            if (storage[i] != null && storage[i].getId() == id) {
                id = storage[i].getId();
                id = 0;
            }
        }
    }

    public void setSallaryDepartment(String fullName, int newSallary, int newDepartment) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] != null && storage[i].getFullName() == fullName) {
                storage[i].setSallary(newSallary);
                storage[i].setDepartment(newDepartment);
            }
        }
    }

    public void printBook() {
        String fullName;
        int departmet;
        for (int i = 0; i < storage.length; i++) {
            fullName = storage[i].getFullName();
            departmet = storage[i].getDepartment();
            System.out.println(fullName + " " + departmet);
        }
    }

}
