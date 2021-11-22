package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    public final String taskName;
    public final String color;
    public final String whatToPrint;
    public boolean isTaskExecuted = false;

    public PaintingTask(String taskName, String color, String whatToPaint){
        this.taskName = taskName;
        this.color = color;
        this.whatToPrint = whatToPaint;
    }

    public void executeTask(){
        isTaskExecuted = true;
        System.out.println("Painting task was executed");
    }

    public String getTaskName(){
        return taskName;
    }

    public boolean isTaskExecuted(){
        return isTaskExecuted;
    }

}

//PaintingTask o konstruktorze PaintingTask(String taskName, String color, String whatToPaint)
