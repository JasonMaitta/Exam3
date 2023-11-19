class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress,
                 String department, double monthlySalary, String dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, department, monthlySalary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString() + " [Title=" + title + "]";
    }
}