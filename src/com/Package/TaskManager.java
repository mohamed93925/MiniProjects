package com.Package;

import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(int id, String title){

        Task task = new Task(id,title);
        tasks.add(task);

        System.out.println("Task Added Successfully");
    }

    public void viewTask(){
        if(tasks.isEmpty()){
            System.out.println("no task to view");
            return;

        }

        for(int i =0;i<tasks.size();i++){
            Task task = tasks.get(i);

            System.out.println("id : " + task.getId() + " | title : " + task.getTitle() + " | completed : " + task.isCompleted() );

        }
    }

    public void completedTask(int id){
        for(int i =0;i<tasks.size();i++){

            Task task = tasks.get(i);
            if(task.getId()==id){
                task.markCompleted();
                System.out.println("task completed successfully...");
                return;

            }
        }

        System.out.println("task not found");
    }

    public void deleteTasks(int id){

        for(int i=0;i< tasks.size();i++){
            if(tasks.get(i).getId() == id) {
                tasks.remove(i);
                System.out.println("task deleted!");
                return;

            }

        }
        System.out.println("task not found");

    }

    public void updateTask(int id, String newTitle){

        for(int i=0;i<tasks.size();i++){
            Task task = tasks.get(i);

            if(task.getId() ==id){
                task.setTitle(newTitle);
                System.out.println("task updated...");
                return;

            }

        }
        System.out.println("task not found");

    }
}
