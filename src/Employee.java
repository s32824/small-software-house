import java.util.Objects;

public class Employee {
    private String employeeId;
    private String firstName;
    private String lastName;
    private double baseSalary;

    public Employee(String employeeId, String firstName, String lastName, double baseSalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
    }

    public final String getEmployeeId() {
        return employeeId;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double calculateMonthlyCost() {
        return baseSalary;
    }

    public String introduceYourself() {
        return "I am " + firstName + " " + lastName + " (ID: " + employeeId + ")";
    }

    @Override
    public String toString() {
        return "Employee[ID=" + employeeId + ", Name=" + firstName + " " + lastName + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeId, employee.employeeId);
    }
}