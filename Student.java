public class Student implements EducationalEntityComponent {
    private String name;
    private String studentId;
    private double tuitionFee;

    public Student(String name, String studentId, double tuitionFee) {
        this.name = name;
        this.studentId = studentId;
        this.tuitionFee = tuitionFee;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student: " + name);
        System.out.println("ID: " + studentId);
        System.out.println("Tuition Fee: $" + tuitionFee);
    }

    @Override
    public int getStudentCount() {
        return 1;
    }

    @Override
    public double calculateBudget() {
        return -tuitionFee;
    }
}
