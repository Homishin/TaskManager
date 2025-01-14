package org.example;

import java.util.ArrayList;

public class TaskManager {
    ArrayList<Task> taskList;

    public TaskManager() {
        taskList = new ArrayList<>();
    }

    public void addTask(Task task){
        taskList.add(task);
    }

    public void removeTaskById(int id){
        taskList.removeIf(task -> task.getId() == id);
    }

    public void getAllTasks(){
        for(Task task : taskList){
            System.out.println(task);
        }
    }
}
