package com.kodilla.patterns.factory.tasks;

public interface Task {

    void executeTask();
    String getTaskName();
    boolean isTaskExecuted();

}


//Interfejs Task, który będzie udostępniał następujące metody:
//
//    executeTask() – wykonującą zadanie,
//    getTaskName() – zwracającą nazwę zadania do wykonania,
//    isTaskExecuted() – zwracającą true lub false, w zależności od tego, czy zadanie jest już wykonane.