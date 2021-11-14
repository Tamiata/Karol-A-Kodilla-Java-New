package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {

    final List<String> tasks;
    public TaskList(){
        tasks = new ArrayList<>();
    }

    @Override
    public String toString() {
        return tasks.toString();
    }

    public void addTask(String taskName) {
        tasks.add(taskName);
    }

    public List<String> getTasks() {
        return tasks;
    }
}


//TaskList w tym samym pakiecie – powinna ona zawierać właściwość List<String> tasks.
// Jej zawartość powinna być inicjowana w konstruktorze przy pomocy polecenia tasks = new ArrayList<>();