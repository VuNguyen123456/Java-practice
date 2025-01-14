
package taskmanager;
public class Task {
    private int id;
    private String title;
    private String description;
    private boolean completed;

    /**
     * This is the constructor for Task
     * @param id
     * @param title
     * @param description
     * It takes 3 arguments to initialize a task object
     */
    public Task(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    @Override
    public String toString() {
        return "Task #" + id + ": " + title + "\nDescription: " + description + "\n" ;
    }
}
