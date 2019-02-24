package menu;

import department.Department;
import department.impl.ColdDepartment;
import department.impl.HotDepartment;
import department.impl.TestyDepartment;

import java.util.HashMap;
import java.util.Map;

import static menu.MenuPoint.*;

public class MenuComponents {
    private static Map<MenuPoint, MenuComponent> menuComponents = new HashMap();

    static {
        menuComponents.put(POINT1, new MenuComponent(new HotDepartment(), new String[]{"картошка", "мясо", "соус"}));
        menuComponents.put(POINT2, new MenuComponent(new HotDepartment(), new String[]{"тесто", "начинка", "соус"}));
        menuComponents.put(POINT3, new MenuComponent(new ColdDepartment(), new String[]{"паста", "соус"}));
        menuComponents.put(POINT4, new MenuComponent(new ColdDepartment(), new String[]{"салат", "свинец", "заправка"}));
        menuComponents.put(POINT5, new MenuComponent(new TestyDepartment(), new String[]{"пирожене", "крем", "фрукты"}));
        menuComponents.put(POINT6, new MenuComponent(new ColdDepartment(), new String[]{"сало", "селедка", "огурцы", "водка"}));
    }

    public static Department getDepartment(MenuPoint menuPoint) {
        return menuComponents.get(menuPoint).getDepartment();
    }


    public static String[] getComponents(MenuPoint menuPoint) {
        return menuComponents.get(menuPoint).getComponents();
    }
}
