package department.impl;

import cooker.Cooker;
import department.Department;
import menu.*;

import java.util.ArrayList;

public class HotDepartment extends Department {

    public HotDepartment() {
        this.cookers = new Cooker[]{
                new Cooker("Alla", new String[]{"картошка", "тесто"}),
                new Cooker("Vasilisa", new String[]{"мясо", "соус", "начинка"}),
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
