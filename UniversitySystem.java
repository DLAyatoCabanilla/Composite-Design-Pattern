public class UniversitySystem {
    public static void main(String[] args) {
        // Create the university structure
        College newEraUniversity = new College("New Era University");

        // Create colleges
        College collegeOfEngineering = new College("College of Engineering");
        College collegeOfBusiness = new College("College of Business");

        // Create departments for College of Engineering
        Department computerScienceDept = new Department("Department of Computer Science");
        Department informationTechDept = new Department("Department of Information Technology");

        // Create departments for College of Business
        Department accountingDept = new Department("Department of Accounting");
        Department marketingDept = new Department("Department of Marketing");

        // Create teachers
        Teacher teacher1 = new Teacher("Dr. Smith", "Java Programming", 75000);
        Teacher teacher2 = new Teacher("Dr. Johnson", "Database Systems", 70000);
        Teacher teacher3 = new Teacher("Prof. Williams", "Networking", 65000);
        Teacher teacher4 = new Teacher("Prof. Brown", "Accounting Principles", 68000);
        Teacher teacher5 = new Teacher("Dr. Davis", "Marketing Strategies", 72000);

        // Create students
        Student student1 = new Student("John Doe", "CS001", 10000);
        Student student2 = new Student("Jane Smith", "CS002", 10000);
        Student student3 = new Student("Mike Johnson", "IT001", 9500);
        Student student4 = new Student("Sarah Williams", "IT002", 9500);
        Student student5 = new Student("David Brown", "AC001", 9000);
        Student student6 = new Student("Emily Davis", "MK001", 9000);

        // Add departments to colleges
        collegeOfEngineering.addComponent(computerScienceDept);
        collegeOfEngineering.addComponent(informationTechDept);

        collegeOfBusiness.addComponent(accountingDept);
        collegeOfBusiness.addComponent(marketingDept);

        // Add colleges to university
        newEraUniversity.addComponent(collegeOfEngineering);
        newEraUniversity.addComponent(collegeOfBusiness);

        // Add teachers and students to respective departments
        computerScienceDept.addComponent(teacher1);
        computerScienceDept.addComponent(student1);
        computerScienceDept.addComponent(student2);

        informationTechDept.addComponent(teacher2);
        informationTechDept.addComponent(teacher3);
        informationTechDept.addComponent(student3);
        informationTechDept.addComponent(student4);

        accountingDept.addComponent(teacher4);
        accountingDept.addComponent(student5);

        marketingDept.addComponent(teacher5);
        marketingDept.addComponent(student6);

        // Display university details
        System.out.println("===== UNIVERSITY DETAILS =====");
        newEraUniversity.displayDetails();

        // Display college details
        System.out.println("\n===== COLLEGE OF ENGINEERING DETAILS =====");
        collegeOfEngineering.displayDetails();

        // Display department details
        System.out.println("\n===== COMPUTER SCIENCE DEPARTMENT DETAILS =====");
        computerScienceDept.displayDetails();

        // Display specific information
        System.out.println("\n===== SPECIFIC INFORMATION =====");
        System.out.println("Total number of students in the university: " + newEraUniversity.getStudentCount());
        System.out.println("Total budget for the university: $" + newEraUniversity.calculateBudget());
        System.out.println("Total number of students in College of Business: " + collegeOfBusiness.getStudentCount());
        System.out.println("Total budget for College of Business: $" + collegeOfBusiness.calculateBudget());
    }
}