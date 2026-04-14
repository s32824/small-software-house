import java.util.ArrayList;

public class ProjectTeam {
    private String projectName;
    private ArrayList<Employee> employees;

    public ProjectTeam(String projectName) {
        this.projectName = projectName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public double calculateTotalCost() {
        double total = 0;
        for (Employee e : employees) {
            //polymorphism
            total += e.calculateMonthlyCost();
        }
        return total;
    }

    public void printTeamMembers() {
        System.out.println("Project Team: " + projectName);
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
    }
}