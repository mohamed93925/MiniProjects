package com.Package.TaskManagementSystem;

import com.Package.TaskManager;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        TaskManager taskManager = new TaskManager();

        while (true) {
            System.out.println("\n===== TASK MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Completed Task");
            System.out.println("5. Delete Task");
            System.out.println("6. Exit");

            System.out.print("Enter your Choice : ");
            int choice = scan.nextInt();

            switch(choice){

                case 1:
                    System.out.print("Enter your TaskId : ");
                    int id = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Enter your TaskTitle : ");
                    String title = scan.nextLine();

                    taskManager.addTask(id,title);
                    break;

                case 2:
                    taskManager.viewTask();
                    break;

                case 3:
                    System.out.print("Enter your TaskId : ");
                    id = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Enter your Updated : ");
                    title = scan.nextLine();


                    taskManager.updateTask(id,title);
                    break;

                case 4:

                    System.out.print("Enter your TaskID : ");
                    id = scan.nextInt();

                    taskManager.completedTask(id);
                    break;

                case 5:
                    System.out.print("Enter the TaskId : ");
                    id = scan.nextInt();

                    taskManager.deleteTasks(id);
                    break;

                case 6:
                    System.out.print(" Thanks for using Task Management System...");
                    scan.close();
                    return;

                default:
                    System.out.print("Invalid choice, Try  Again...");





            }

        }


    }

}