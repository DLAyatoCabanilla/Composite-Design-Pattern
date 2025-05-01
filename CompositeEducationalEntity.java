import java.util.ArrayList;
import java.util.List;

// Abstract composite class for uniqueness
public abstract class CompositeEducationalEntity implements EducationalEntityComponent {
    protected String name;
    protected List<EducationalEntityComponent> components = new ArrayList<>();

    public CompositeEducationalEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addComponent(EducationalEntityComponent component) {
        components.add(component);
    }

    public void removeComponent(EducationalEntityComponent component) {
        components.remove(component);
    }

    public List<EducationalEntityComponent> getComponents() {
        return components;
    }

    @Override
    public int getStudentCount() {
        int totalStudents = 0;
        for (EducationalEntityComponent component : components) {
            totalStudents += component.getStudentCount();
        }
        return totalStudents;
    }

    @Override
    public double calculateBudget() {
        double totalBudget = 0;
        for (EducationalEntityComponent component : components) {
            totalBudget += component.calculateBudget();
        }
        return totalBudget;
    }
}
