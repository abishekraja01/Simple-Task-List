import java.util.ArrayList;
import java.util.Scanner;

public class TaskListApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TaskList task = new TaskList();
        displayMenu();
        while (true) {
            System.out.print("Select an option : ");
            int choice = getUserChoice(scan);

            switch (choice) {
                case 1:
                    task.addList(getTaskName(scan));
                    break;
                case 2:
                    if (!task.IsEmpty()) {
                        task.viewList();
                        System.out.print("Enter the Task Number : ");
                        int taskNumber = scan.nextInt();
                        if (task.isValidTaskNumber(taskNumber)) {
                            task.removeList(taskNumber);
                        } else {
                            System.out.println("Invalid Task Number!!!");
                        }
                    }
                    else {
                        System.out.println("No tasks to remove!!!");
                    }

                    break;
                case 3:
                    if (!task.IsEmpty()) {
                        task.viewList();
                    } else {
                        System.out.println("No tasks in the list");
                    }
                    break;
                case 4:
                    scan.close();
                    return;
                default:
                    System.out.println("Invalid choice !!! Please Try again....");
            }

        }
    }

    private static int getUserChoice(Scanner scan) {
        return scan.nextInt();
    }

    private static void displayMenu() {
        System.out.println("Task List Application");
        System.out.println("1. Create List");
        System.out.println("2. Remove List");
        System.out.println("3. View List");
        System.out.println("4. Quit");

    }


    private static String getTaskName(Scanner scan) {
        System.out.print("Enter the Task Name : ");
        return scan.next();
    }

    private static int getUserInput(Scanner scan) {
        return scan.nextInt();
    }

}

class TaskList{
    private final ArrayList<String> tasks = new ArrayList<>();

    public void addList(String name) {
        tasks.add(name);
        System.out.println("Task Added.");
    }

    public void removeList(int taskNumber) {
        tasks.remove(taskNumber - 1);
        System.out.println("Task Removed");
    }

    public void viewList() {
        for (int i = 0; i < tasks.size(); i++){
            System.out.println((i + 1)+ ". " + tasks.get(i) );
        }
    }

    public boolean IsEmpty() {
        return tasks.isEmpty();
    }

    public boolean isValidTaskNumber(int taskNumber) {
        return taskNumber >=1 && taskNumber <= tasks.size();
    }
}