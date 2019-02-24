package department;

import cooker.Cooker;
import menu.*;

import java.util.ArrayList;

public abstract class Department {

    protected Cooker[] cookers;

    protected Cooker chief;

    public abstract ArrayList<String> cook(MenuPoint menuPoint);

    protected String getDishComponent(String component) throws Exception{
        for (Cooker cooker : cookers) {
            if (haveCurrentResponsibility(cooker.getResponsibility(), component))
                return cooker.addDishComponent(component);
        }
        throw new Exception("Apologize! We can not cook your chosen dish.");
    }

    private boolean haveCurrentResponsibility(String[] responsibilities, String component) {
        for (String responsibility : responsibilities) {
            if (responsibility.equals(component)) return true;
        }
        return false;
    }
}