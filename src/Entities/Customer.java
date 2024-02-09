package Entities;

public class Customer {

    public String name;
    public Role role;
    public String sinceMonthYear;

    public Customer() {
    }

    public Customer(String name, Role role, String sinceMonthYear) {
        this.name = name;
        this.role = role;
        this.sinceMonthYear = sinceMonthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getSinceMonthYear() {
        return sinceMonthYear;
    }

    public void setSinceMonthYear(String sinceMonthYear) {
        this.sinceMonthYear = sinceMonthYear;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", sinceMonthYear='" + sinceMonthYear + '\'' +
                '}';
    }
}
