package com.springbootcrud_jdbc.springboot_jdbc.model;

public class Salary {

    private int id;
    private long joining_salary;
    private long curr_salary;

    public Salary() {
    }

    public Salary(int id, long joining_salary, long curr_salary) {
        this.id = id;
        this.joining_salary = joining_salary;
        this.curr_salary = curr_salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getJoining_salary() {
        return joining_salary;
    }

    public void setJoining_salary(long joining_salary) {
        this.joining_salary = joining_salary;
    }

    public long getCurr_salary() {
        return curr_salary;
    }

    public void setCurr_salary(long curr_salary) {
        this.curr_salary = curr_salary;
    }
}
