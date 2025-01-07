package app;

import taskmanager.Task;
import taskmanager.TaskList;

public class TaskManagerApp{
	public static void main(String[] args){
		
		if(args.length < 1){
			System.out.println("Max Task List Size Not Given");
			
		}
		
		int taskListSize = Integer.parseInt(args[0]);
		
		TaskList taskList = new TaskList(taskListSize);
		
		Task t1 = new Task(1, "Task1", "this is a new task");
		Task t2 = new Task(2, "Task2", "this is a newer task");
		
		taskList.addTask(t1);
		taskList.addTask(t2);
		taskList.getAllTasks();
	}
}
