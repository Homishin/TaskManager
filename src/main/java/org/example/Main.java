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
                        case 3:
                            System.out.println("Какой тип задачи?\n" +
                                    "1. Новая\n" +
                                    "2. В процессе\n" +
                                    "3. Готово\n");
                            int y = scanner.nextInt();
                            if (y == 1) {
                                taskManager.fillterTask(Status.NEW);
                            } else if (y == 2) {
                                taskManager.fillterTask(Status.IN_PROGRESS);
                            } else if (y == 3) {
                                taskManager.fillterTask(Status.DONE);
                            }
                            break;
                            case 4:
                                Status newStatus = null;
                                System.out.println("ID задачи");
                                int taskId = scanner.nextInt();
                                System.out.println("Новый статус:\n" +
                                        "1. Новая\n" +
                                        "2. В работе\n" +
                                        "3. Готово\n");
                                int idStatus = scanner.nextInt();

                                if (idStatus == 1) {
                                    newStatus = Status.NEW;
                                } else if (idStatus == 2) {
                                    newStatus = Status.IN_PROGRESS;
                                } else if (idStatus == 3) {
                                    newStatus = Status.DONE;
                                }

                                taskManager.changeStatusById(taskId,newStatus);
                                break;
                                case 5:
                                    taskManager.getAllTasks();
                                    break;
                                    case 6:
                                        runProgramm = false;
                                        break;

            }
        }

    }
}