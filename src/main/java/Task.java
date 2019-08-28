/**
 * Representing the attributes and behavior of a general Task. The abstract methods will be more specific for the child
 * classes of the Task class.
 */
public abstract class Task {

    protected String description;
    protected boolean isDone;
    protected char identity;

    /**
     * Creating a task object. It is the default for a task to be not done upon creation.
     *
     * @param description of the task being created.
     */
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    /**
     * Recovery of a task object based on the format of a task in the Duke.txt file that we save our information into.
     * Whether the task is done or not depends on the int value of the task when it is saved.
     *
     * @param intDone if task is done, the int value == 1. If the task is not done, int value == 0.
     * @param description of the task.
     */
    public Task(int intDone, String description) {
        this.description = description;
        if(intDone==1) {
            this.isDone = true;
        } else {
            this.isDone = false;
        }
    }

    /**
     * Returns the status icon of the task. This is dependent on whether the task is done or not.
     *
     * @return the icon, which is a string value.
     */
    public String getStatusIcon() {
        return (isDone ? "[\u2713]" : "[\u2718]"); //return tick or X symbols
    }

    /**
     * Marks the task as done.
     */
    public void markAsDone() {
        this.isDone = !isDone;
    }

    /**
     * Returns the string value of a Task object.
     *
     * @return the status icon and description of the task.
     */
    @Override
    public String toString(){
        return getStatusIcon() + " " + this.description;
    }

    /**
     * Returns a string to be saved in the Duke.txt file. It is an abstract method that needs to be implemented
     * by the sub classes.
     *
     * @return string value to be saved in the Duke.txt file.
     */
    public abstract String toTextFile() ;

}
