
import SimpleList.MyArrayList;
import menu.MenuComponents;
import menu.MenuPoint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ofic {
    private final String name;


    public Ofic(String name) {
        this.name = name;
        MenuPoint.values();
    }


    public String getName() {
        return name;
    }

    public void createOrder() {
        System.out.println(Arrays.toString(MenuPoint.getMenuList()));
        MyArrayList<MenuPoint> menuPoints = buildOrder();
        //only test
        for (MenuPoint menuPoint : menuPoints) {
//            if (menuPoint == null) break;
            System.out.println(menuPoint.toString().charAt(menuPoint.toString().length() - 1) +
                    " " + MenuComponents.getDepartment(menuPoint).cook(menuPoint));
        }

    }

    private MyArrayList<MenuPoint> buildOrder() {
        Scanner scanner = new Scanner(System.in);
        MyArrayList<MenuPoint> order = new MyArrayList<>();
        boolean isFinish = false;
        while (!isFinish) {
            String menuPoint = scanner.nextLine();
            if (isValueInputOrder(menuPoint)) {
                int point = Integer.parseInt(menuPoint);
                if (point == 0) {
                    break;
                } else {
                    order.add(MenuPoint.getPointByMenuNumber(point));
                }
            }
        }
        return order;
    }

    public boolean isValueInputOrder(String str) {
        int menuPoint;
        try {
            menuPoint = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            //If number is not integer,you wil get exception and exception message will be printed
            System.out.println("Error: " + e);
            System.out.println("You entered is not integer! Try again");
            return false;
        }
        if (menuPoint > MenuPoint.getMenuSize() || menuPoint < 0) {
            System.out.println("Error: You entered a number not from the menu items. Try again");
            return false;
        }
        return true;
    }
}
