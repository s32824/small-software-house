public class Developer extends Employee {
    private String mainLanguage;
    private int repositoryCount;

    public Developer(String employeeId, String firstName, String lastName, double baseSalary, String mainLanguage, int repositoryCount) {
        //calling super() to call the parent constructor
        super(employeeId, firstName, lastName, baseSalary);
        this.mainLanguage = mainLanguage;
        this.repositoryCount = repositoryCount;
    }

    //adding a bonus
    @Override
    public double calculateMonthlyCost() {
        return getBaseSalary() + (repositoryCount * 100);
    }

    @Override
    public String introduceYourself() {
        return super.introduceYourself() + " and I am a Developer specializing in " + mainLanguage;
    }

    //a specific method unique to this class
    public void printTechnologies() {
        System.out.println("Tech stack: " + mainLanguage + " | Repositories: " + repositoryCount);
    }
}