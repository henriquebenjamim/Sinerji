package Entities;

import java.util.List;

public class Role {

    public String name;
    public Float salary;
    public Float benefit;
    public Float bonusPerYear;
    public List<Customer> customerList;

    public Role(String name, Float salary, Float benefit, Float bonusPerYear) {
        this.name = name;
        this.salary = salary;
        this.benefit = benefit;
        this.bonusPerYear = bonusPerYear;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public Float getSalary() {
        return salary;
    }

    protected Float setSalary(Float salary) {
        return salary;
    }

    public Float getBenefit() {
        return benefit;
    }

    protected void setBenefit(Float benefit) {
        this.benefit = benefit;
    }

    public Float getBonusPerYear() {
        return bonusPerYear;
    }

    protected void setBonusPerYear(Float bonusPerYear) {
        this.bonusPerYear = bonusPerYear;
    }

    public String addCustomer(Customer customerToAdd) {
        customerList.add(customerToAdd);
        return customerToAdd.getName() + " Added.";
    }

    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", benefit=" + benefit +
                ", bonusPerYear=" + bonusPerYear +
                '}';
    }
}
