package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task create(final String createClass, final String productColourWhere) {
        switch (createClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Shop",productColourWhere, 2);
            case PAINTINGTASK:
                return new PaintingTask("Paint", productColourWhere, "Roof");
            case DRIVINGTASK:
                return new DrivingTask("Drive", productColourWhere, "yes");
            default:
                return null;
        }
    }
}
