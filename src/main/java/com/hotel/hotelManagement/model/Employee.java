package com.hotel.hotelManagement.model;

import java.time.LocalDate;

public class Employee {
    private long employee_id;
    private long department_id;
    private String first_name;
    private String last_name;
    private String schedule;
    private LocalDate hire_date;
    private double hourly_pay_rate;

    public Employee() {
    }

    public Employee(long employee_id, long department_id, String first_name, String last_name, String schedule, LocalDate hire_date, double hourly_pay_rate) {
        this.employee_id = employee_id;
        this.department_id = department_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.schedule = schedule;
        this.hire_date = hire_date;
        this.hourly_pay_rate = hourly_pay_rate;
    }

    public long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(long employee_id) {
        this.employee_id = employee_id;
    }

    public long getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(long department_id) {
        this.department_id = department_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public LocalDate getHire_date() {
        return hire_date;
    }

    public void setHire_date(LocalDate hire_date) {
        this.hire_date = hire_date;
    }

    public double getHourly_pay_rate() {
        return hourly_pay_rate;
    }

    public void setHourly_pay_rate(double hourly_pay_rate) {
        this.hourly_pay_rate = hourly_pay_rate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", department_id=" + department_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", schedule='" + schedule + '\'' +
                ", hire_date=" + hire_date +
                ", hourly_pay_rate=" + hourly_pay_rate +
                '}';
    }
}
