public class Teacher implements EducationalEntityComponent {
    private String name;
    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary) {
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void displayDetails() {
        System.out.println("Teacher: " + name);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: $" + salary);
    }

    @Override
    public int getStudentCount() {
        return 0; 
    }

    @Override
    public double calculateBudget() {
        return salary; 
    }
}

