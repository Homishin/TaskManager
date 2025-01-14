package org.example;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task(1,"Подрочить","Сегодня левой",Status.DONE);
        Task task2 = new Task(2,"Подрочить в обед","Сегодня правой",Status.NEW);
        Task task3 = new Task(3,"Подрочить перед сном","Двумя",Status.IN_PROGRESS);

        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);

        task2.setStatus(Status.IN_PROGRESS);

        System.out.println(task2);
    }
}