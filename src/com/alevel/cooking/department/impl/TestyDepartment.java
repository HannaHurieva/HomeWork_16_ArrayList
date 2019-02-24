package department.impl;

import SimpleList.MyArrayList;
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
    public MyArrayList<String> cook(MenuPoint  menuPoint) {
        MyArrayList<String> dish = new MyArrayList<>();
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
