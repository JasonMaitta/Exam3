import java.util.ArrayList;

public class TestSchoolRecords {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Student("John Doe", "123 Main St", "555-1234", "john.doe@example.com", "Freshman"));
        persons.add(new Student("Jane Smith", "456 Oak St", "555-5678", "jane.smith@example.com", "Sophomore"));
        persons.add(new Faculty("Prof. Johnson", "789 Elm St", "555-8765", "johnson@example.com", "Computer Science", 6000.0, "2022-01-01", "10 AM - 2 PM", "Senior"));
        persons.add(new Faculty("Dr. Davis", "987 Pine St", "555-4321", "davis@example.com", "Mathematics", 7000.0, "2021-12-01", "2 PM - 6 PM", "Junior"));
        persons.add(new Staff("Alice Brown", "654 Birch St", "555-2345", "alice@example.com", "Administration", 5000.0, "2023-03-15", "Secretary"));
        persons.add(new Staff("Bob White", "321 Cedar St", "555-7890", "bob@example.com", "Finance", 5500.0, "2023-02-28", "Accountant"));

        for (Person person : persons) {
            System.out.println(person);
        }

        ArrayList<Employee> employees = filterEmployees(persons);
        System.out.println("\nEmployees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static ArrayList<Employee> filterEmployees(ArrayList<Person> persons) {
        ArrayList<Employee> employees = new ArrayList<>();
        for (Person person : persons) {
            if (person instanceof Employee) {
                employees.add((Employee) person);
            }
        }
        return employees;
    }
}