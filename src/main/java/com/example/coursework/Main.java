package com.example.coursework;

public class Main {
    public static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Ivan", "Petrov", "Valentinovich", 1, 32000.55);
        employees[1] = new Employee("Petr", "Ivanov", "Vyacheslavovich", 2, 52988.35);
        employees[2] = new Employee("Kirill", "Vasiliev", "Petrovich", 3, 76553.53);
        employees[3] = new Employee("Vasily", "Stepanov", "Ivanovich", 4, 67400.32);
        employees[4] = new Employee("Svetlana", "Epiphantseva", "Vasilevna", 5, 80242);
        employees[5] = new Employee("Ekaterina", "Petrova", "Valentinovna", 1, 68777.20);
        employees[6] = new Employee("Petr", "Mamonov", "Nikolaevich", 2, 52700.50);
        employees[7] = new Employee("Segrey", "Pahomov", "Igorevich", 3, 66666.66);
        employees[8] = new Employee("Svetlana", "Baskova", "Yrevna", 3, 49887.32);
        employees[9] = new Employee("Vladimir", "Epiphancev", "Georgievich", 4, 64392);
        employees[0].setSalary(50505);
        employees[9].setDepartment(3);
        System.out.println("Cписок всех сотрудников со всеми имеющимися по ним данными:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
        System.out.println();
        sumSalaryMonth();
        minSalaryMonth();
        maxSalaryMonth();
        meanSalaryMonth();
        System.out.println();
        System.out.println("ФИО всех работников.");
        printFullName();
        System.out.println();
        System.out.println("Индексация заработной платы.");
        indexingSalary(10);
    }

    private static void sumSalaryMonth() {
        double sum = 0;
        for (Employee employee : Main.employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        System.out.println("Сумма затрат на зарплаты в месяц = " + sum);
    }

    private static void minSalaryMonth() {
        double min = Main.employees[0].getSalary();
        String fullName = null;
        for (Employee employee : Main.employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                fullName = employee.getEmployeeFullName();
            }
        }
        System.out.println("Заработная плата сотрудника " + fullName + " - " + min + " руб. минимальная.");
    }

    private static void maxSalaryMonth() {
        double max = Main.employees[0].getSalary();
        String fullName = null;
        for (int i = 1; i < Main.employees.length; i++) {
            if (Main.employees[i] != null && Main.employees[i].getSalary() > max) {
                max = Main.employees[i].getSalary();
                fullName = Main.employees[i].getEmployeeFullName();
            }
        }
        System.out.println("Заработная плата сотрудника " + fullName + " - " + max + " руб. максимальная.");
    }

    private static void meanSalaryMonth() {
        double mean = 0;
        for (Employee employee : Main.employees) {
            if (employee != null) {
                mean += employee.getSalary() / Main.employees.length;
            }
        }
        System.out.println("Среднее значение зарплат = " + (float) mean);
    }

    private static void printFullName() {
        String fullName;
        for (Employee employee : Main.employees) {
            if (employee != null) {
                fullName = employee.getEmployeeFullName();
                System.out.println(fullName);
            }
        }
    }

    public static void indexingSalary(int percent) {
        double index;
        for (Employee employee : employees) {
            index = employee.getSalary() + ((employee.getSalary() / 100) * percent);
            System.out.println("Проиндексированная заработная плата " + employee.getEmployeeFullName() + " - " + (float) index + " руб.");
        }
    }
}