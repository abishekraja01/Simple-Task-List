# Simple-Task-List

Overview
The Task List Application is a simple Java-based console application that allows users to manage a list of tasks. Users can add tasks, remove tasks, and view the list of tasks. This application is a great way to practice basic Java programming concepts including ArrayList, Scanner, and control structures.

How It Works

Main Components
1. Main Class (TaskListApp):

displayMenu(): Prints the menu options to the console.
getUserChoice(): Reads the user's menu selection.
getTaskName(): Prompts the user to enter a task name.

2. TaskList Class:

addList(String name): Adds a new task to the list.
removeList(int taskNumber): Removes a task from the list based on its number.
viewList(): Displays all the tasks in the list.
IsEmpty(): Checks if the task list is empty.
isValidTaskNumber(int taskNumber): Validates if the entered task number exists in the list.

Detailed Code Explanation
1. TaskListApp Class:

The main method initializes a Scanner for user input and a TaskList object for managing tasks.
displayMenu() is called to show the available options.
The program enters a loop where it prompts the user to select an option and performs actions based on the user's choice using a switch statement.
Option 1: Calls task.addList() to add a task to the list.
Option 2: Checks if the list is not empty, then displays the tasks and removes the specified task by its number.
Option 3: Displays all tasks if the list is not empty.
Option 4: Exits the program.

2. TaskList Class:

Manages an ArrayList of tasks.
addList(String name): Adds a task to the list and confirms the addition.
removeList(int taskNumber): Removes a task based on its number (1-based index).
viewList(): Prints all tasks with their numbers.
IsEmpty(): Checks if the task list is empty.
isValidTaskNumber(int taskNumber): Validates if the task number is within the range of existing tasks.

Example Usage
When you run the application, you will see a menu with the following options:

Task List Application
1. Create List
2. Remove List
3. View List
4. Quit

Create List: Enter the task name when prompted to add a new task to the list.
Remove List: Enter the task number of the task you want to remove from the list.
View List: Displays all the tasks with their corresponding task numbers.
Quit: Closes the application.

   
