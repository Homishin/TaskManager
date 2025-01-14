package org.example;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Task task1 = new Task(1, "Подрочить", "Сегодня левой", Status.DONE);
        Task task2 = new Task(2, "Подрочить в обед", "Сегодня правой", Status.NEW);
        Task task3 = new Task(3, "Подрочить перед сном", "Двумя", Status.IN_PROGRESS);

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);
        taskManager.getAllTasks();
        System.out.println();
        taskManager.removeTaskById(2);
        taskManager.getAllTasks();
    }
}