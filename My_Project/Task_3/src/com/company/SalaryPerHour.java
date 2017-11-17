package com.company;

public class SalaryPerHour extends Employee{
    private double per_hour;

    SalaryPerHour(String name, int id, double salary_per_hour){
        super(id, name);
        this.per_hour = salary_per_hour;
        total(per_hour);
    }

    public double getHourFee(){
        return per_hour;
    }

    @Override
    public void total(double salary_per_hour){
        this.setSalary(salary_per_hour * 20.8 * 8);
    }
}
