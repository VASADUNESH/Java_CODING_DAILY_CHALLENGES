package OCT_3;

public class P1 {

	public static void main(String[] args) {
		
		Task task1 = new Task("Finish Project", "Complete documentation", "High");
        System.out.println("Task Title: " + task1.getTitle());
        System.out.println("Task Description: " + task1.getDescription());
        System.out.println("Task Priority: " + task1.getPriority());
        System.out.println("Is Task Completed? " + task1.isCompleted());
        System.out.println();
        Task task2 = new Task("", "Complete documentation", "High");
        System.out.println();
        
        Task task3 = new Task("Finish Project", "", "High");


	}

}


/*
Question - 1
---------------
You are developing a task management application that allows users to create and manage their tasks efficiently. 

Design a Java class named Task (Business Class)

Attributes :

name			data type
-------			------------
title			: String
description		: String
priority		: String

Acess modifier : private(for all varriables)

Constructor: Initialize the task object all properties.


Methods:
[Return type of all methods is void and acess modifier is public]

updateDescription(String newDescription): This method should update the description of the task.

updatePriority(String newPriority): This method should update the priority level of the task.

markAsCompleted(): This method should mark the task as completed.

getTitle(): This method should return the title of the task.

getDescription(): This method should return the description of the task.

getPriority(): This method should return the priority level of the task.

isCompleted(): This method should return true if the task is completed, and false otherwise.


Create another class main which is having main method and instantiate the task object and execute the method.

Test Cases :

case -1
---------
Task Title: Finish Project
Task Description: Complete documentation
Task Priority: High
Is Task Completed? false

Expected Output: 
Valid input, (print all the above information)

case-2
---------
Title: ""
Description: "Complete documentation"
Priority: "High"

Expected Output: 
Error message indicating invalid title.

case-3
--------
Title: "Finish Project"
Description: ""
Priority: "High"

Expected Output: 
Error message indicating invalid description
*/