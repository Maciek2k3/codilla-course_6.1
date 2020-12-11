package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task task(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Shop", "Bread", 2);
            case PAINTINGTASK:
                return new PaintingTask("Paint", "Black", "Roof");
            case DRIVINGTASK:
                return new DrivingTask("Drive", "WAW", "yes");
            default:
                return null;
        }
    }
}
