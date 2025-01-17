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

    public void fillterTask(Status status){
        for(Task task : taskList){
            if(task.getStatus().equals(status)){
                System.out.println(task);
            }
        }
    }

    public void changeStatusById(int id, Status newStatus){
        for(Task task : taskList){
            if(task.getId() == id){
                task.setStatus(newStatus);
            }
        }
    }

    public void kirillSoset(String tipOtsosa){
        System.out.println(tipOtsosa);
    }
}
