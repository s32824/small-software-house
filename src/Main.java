public class Main {
    public static void main(String[] args) {
        //the project management class
        ProjectTeam team = new ProjectTeam("Campus App");

        //polymorphism
        Employee e1 = new Developer("E-101", "Anna", "May", 12000.0, "Java", 4);
        Employee e2 = new Tester("E-201", "Peter", "Fox", 9800.0, true, 25);
        Employee e3 = new Developer("E-102", "Charles", "Smith", 11500.0, "Kotlin", 3);

        //adding different types to the same list
        team.addEmployee(e1);
        team.addEmployee(e2);
        team.addEmployee(e3);

        //testing polymorphic behavior
        team.printTeamMembers();
        System.out.println("Total team cost: " + team.calculateTotalCost());

        //testing overridden methods
        System.out.println(e1.introduceYourself());
        System.out.println(e2.introduceYourself());

        //safe casting using 'instanceof'
        if (e1 instanceof Developer) {
            Developer developer = (Developer) e1;
            developer.printTechnologies();
        }

        //testing object comparison (equals)
        //returns true because compared by employeeId that matches "E-201"
        System.out.println("Comparison Result (Same ID): " +
                e2.equals(new Tester("E-201", "Other", "Data", 9000.0, false, 10)));

        //testing toString() override
        System.out.println(e2);
    }
}