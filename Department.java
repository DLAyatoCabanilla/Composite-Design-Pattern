public class Department extends CompositeEducationalEntity {

    public Department(String name) {
        super(name);
    }

    @Override
    public void displayDetails() {
        System.out.println("Department: " + name);
        System.out.println("Number of students: " + getStudentCount());
        System.out.println("Budget: $" + calculateBudget());

        System.out.println("Components:");
        for (EducationalEntityComponent component : components) {
            System.out.print("  ");
            component.displayDetails();
        }
    }
}