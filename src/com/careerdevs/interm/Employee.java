package com.careerdevs.interm;

public class Employee {
    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getHourlyWage() {
        return hourlyWage;
    }


    public void setHourlyWage(int hourlyWage) {
        if (hourlyWage <= 0)
            throw new IllegalArgumentException("wage can not be 0 or negative");
        this.hourlyWage = hourlyWage;
    }

    int baseSalary;
    int hourlyWage;

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyWage + extraHours);
    }


        public static void main(String[] args) {
            var employee = new Employee();
            employee.setBaseSalary(50000);
            employee.getBaseSalary();
            employee.setHourlyWage(20);
            int wage = employee.calculateWage(20);
            System.out.println(wage);


        }

}
