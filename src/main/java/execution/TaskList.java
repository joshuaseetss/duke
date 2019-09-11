package execution;

import models.Task;

import java.util.ArrayList;

/**
 * Represents a tasklist that will keep track of the tasks that the user enters.
 * It consists of methods that will add, delete and mark complete tasks in the current list.
 */
public class TaskList {

    private ArrayList<Task> list;

    /**
     * Creates a tasklist object by creating a new empty arraylist.
     */
    public TaskList() {

        this.list = new ArrayList<>();
    }

    /**
     * Creates a tasklist object with an existing list of tasks.
     *
     * @param currentList of existing tasks reloaded from the duke.txt file.
     */
    public TaskList(ArrayList<Task> currentList) {

        this.list = currentList;
    }

    public int getSize() {
        return this.list.size();
    }

    /**
     * Returns the current list.
     *
     * @return the existing ArrayList.
     */
    public ArrayList<Task> getList() {

        return this.list;

    }

    public Task getTaskByIndex(int index) {

        return this.list.get(index);
    }

    /**
     * Adds a task to the list attribute of this execution.TaskList object.
     *
     * @param current the models.Task object to be added to the list.
     */
    public void addTask(Task current) {

        this.list.add(current);

    }

    /**
     * Deletes a task off the list attribute of this execution.TaskList object.
     *
     * @param current the models.Task object to be deleted off the list.
     */
    public Task deleteTask(int current) {

        Task deleted = list.get(current);
        list.remove(current);

        return deleted;

    }

    /**
     * Marks the task to be completed. The method removes the task by referencing the task based on its position on the
     * list.
     *
     * @param taskNumber which is an integer, which refers to the position of the task in the current list.
     */
    public void completeTask(int taskNumber) {

        Task completed = list.get(taskNumber);
        completed.markAsDone();
        System.out.println("Nice! I've marked this task as done: \n" + "   " + completed);

    }

    /**
     * Prints the current existing list of tasks.
     */
    public void printList() {
        int n = 1;

        if (list.isEmpty()) {

            System.out.println("List is empty");

        } else {

            for (Task item : list) {
                System.out.println(n + "." + item);
                n++;
            }

        }
    }

    /**
     * Finds the existing list for tasks that have matching keywords.
     *
     * @param keyword that the user wants to find tasks with common word.
     * @return a list of tasks that have the common keyword.
     */
    public ArrayList<Task> find(String keyword) {
        ArrayList<Task> list = new ArrayList<>();
        for (Task current : this.list) {
            String taskInString = current.getDescription();

            if (taskInString.toLowerCase().contains(keyword.toLowerCase())) {
                list.add(current);
            }
        }
        return list;
    }

}
