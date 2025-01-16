package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        boolean runProgramm = true;
        int taskCount = 0;

        while (runProgramm) {
            System.out.println("Выберите действие:\n" +
                    "1. Добавить задачу\n" +
                    "2. Удалить задачу\n" +
                    "3. Показать задачи по статусу\n" +
                    "4. Обновить статус задачи\n" +
                    "5. Показать все задачи\n" +
                    "6. Выйти");
            int x = scanner.nextInt();
            switch (x) {
                case 1:
                    taskCount += 1;
                    int id = taskCount;
                    System.out.println("Название задачи:");
                    String title = scanner.next();
                    System.out.println("Описание");
                    String description = scanner.next();

                    Task task = new Task(id,title,description,Status.NEW);
                    taskManager.addTask(task);
                    break;
                    case 2:
                        System.out.println("ID задачи");
                        int idTask = scanner.nextInt();
                        taskManager.removeTaskById(idTask);
                        break;
                        case 5:
                            taskManager.getAllTasks();
                            break;


            }
        }

    }
}