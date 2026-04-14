public class Tester extends Employee {
    private boolean automationTester;
    private int scenarioCount;

    public Tester(String employeeId, String firstName, String lastName, double baseSalary, boolean automationTester, int scenarioCount) {
        //calling the parent constructor
        super(employeeId, firstName, lastName, baseSalary);
        this.automationTester = automationTester;
        this.scenarioCount = scenarioCount;
    }

    //logic for automation bonuses
    @Override
    public double calculateMonthlyCost() {
        double automationBonus = automationTester ? 500.0 : 0.0;
        return getBaseSalary() + automationBonus + (scenarioCount * 10);
    }

    @Override
    public String introduceYourself() {
        String type = automationTester ? "Automation Tester" : "Manual Tester";
        return super.introduceYourself() + " and I am an " + type;
    }

    //a specific method unique to Testers
    public void runTestingReport() {
        System.out.println("Generating report for " + scenarioCount + " scenarios. Automation: " + automationTester);
    }
}