package taskmanager;

public class TaskList{
	private Task[] tasks;
	private int size = 0;
	
	/**
	 * This is the constructure
	 * @param capacity
	 */
	public TaskList(int capacity){
		tasks = new Task [capacity];
		size = 0;
	}
	/**
	 * This is where you add a task
	 * @param task
	 */
	public void addTask(Task task){
		if(size < tasks.length){
			tasks[size++] = task;
		}
		else{
			System.out.println("Task list is full. Cannot add more tasks.");
		}
	}
	/**
	 * This is where you print all Task 
	 * @return
	 */
	public Task[] getAllTasks(){
		Task[] allTasks = new Task[size];
		System.arraycopy(tasks, 0, allTasks,0,size);
		for (int i = 0; i < allTasks.length; i++){
			System.out.println(allTasks[i].toString());
		}
		return allTasks;
	}
}
