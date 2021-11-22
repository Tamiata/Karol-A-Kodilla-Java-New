package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    public final String taskName;
    public final String whatToBuy;
    public final double quantity;
    public boolean isTaskExecuted = false;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public void executeTask(){
        isTaskExecuted = true;
        System.out.println("Shopping task was executed");
    }

    public String getTaskName(){
        return taskName;
    }

    public boolean isTaskExecuted(){
        return isTaskExecuted;
    }

}

//ShoppingTask o konstruktorze ShoppingTask(String taskName, String whatToBuy, double quantity)