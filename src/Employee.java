abstract class Employee extends Person {
    private String department;
    private double monthlySalary;
    private String dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress,
                    String department, double monthlySalary, String dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.department = department;
        this.monthlySalary = monthlySalary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return super.toString() + " [Department=" + department + ", Monthly Salary=" + monthlySalary
                + ", Date Hired=" + dateHired + "]";
    }
}