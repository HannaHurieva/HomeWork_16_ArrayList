package department.impl;

import SimpleList.MyArrayList;
import cooker.Cooker;
import department.Department;
import menu.*;

import java.util.ArrayList;

public class ColdDepartment extends Department {

    public ColdDepartment() {
        this.cookers = new Cooker[]{
                new Cooker("Vasiliy", new String[]{"паста", "салат", "сало", "селедка", "заправка"}),
                new Cooker("Inna", new String[]{"соус", "свинец", "огурцы"}),
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
                String ex = component + " not in the kitchen, sorry";
                dish.add(ex);
                return dish;
            }
        }
        return dish;
    }


}
