package department.impl;

import cooker.Cooker;
import department.Department;
import menu.*;

import java.util.ArrayList;

public class TestyDepartment extends Department {

    public TestyDepartment() {
        this.cookers = new Cooker[]{
                new Cooker("Taras", new String[]{"пирожене", "крем"}),
                new Cooker("Petro", new String[]{"фрукты"}),
        };
    }

    @Override
    public ArrayList<String> cook(MenuPoint  menuPoint) {
        ArrayList<String> dish = new ArrayList<>();
//        Dish dish = new Dish();
        for (String component : MenuComponents.getComponents(menuPoint)) {
            try {
                dish.add(getDishComponent(component));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return dish;
    }
}
