package menu;

import department.Department;
import menu.*;

public class MenuComponent {

    private Department department;

    private String[] components;

    public MenuComponent(Department department, String[] components) {
        this.department = department;
        this.components = components;
    }

    public Department getDepartment() {
        return department;
    }

    public String[] getComponents() {
        return components;
    }
}
