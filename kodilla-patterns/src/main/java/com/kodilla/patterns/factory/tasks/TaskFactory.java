package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task doTask(final String taskType) {
        switch (taskType) {
            case SHOPPING:
                return new ShoppingTask("Shopping","Beer",6);
            case PAINTING:
                return new PaintingTask("Painting", "White", "Kitchen");
            case DRIVING:
                return new DrivingTask("Driving", "Home", "Taxi");
            default:
                return null;
        }
    }
}

//Następnie wymyśl, w jaki sposób przechowywać informację o tym, czy zadanie jest już wykonane i
// napisz fabrykę TaskFactory, która będzie tworzyła zadania zgodnie ze wzorcem Factory