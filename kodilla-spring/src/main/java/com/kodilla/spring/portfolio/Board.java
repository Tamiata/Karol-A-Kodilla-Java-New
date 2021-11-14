package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Component;

public final class Board {

    final TaskList toDoList;
    final TaskList inProgressList;
    final TaskList doneList;

    public Board(final TaskList toDoList, final TaskList inProgressList, final TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;

    }

    public TaskList getToDoList(){
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}


//Board posiadającą trzy pola: toDoList, inProgressList oraz doneList. Pola te powinny być typu TaskList.