package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    public final String taskName;
    public final String where;
    public final String using;
    public boolean isTaskExecuted = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public void executeTask(){
        isTaskExecuted = true;
        System.out.println("Driving task was executed");
    }

    public String getTaskName(){
        return taskName;
    }

    public boolean isTaskExecuted(){
        return isTaskExecuted;
    }


}

//DrivingTask o konstruktorze DrivingTask(String taskName, String where, String using)