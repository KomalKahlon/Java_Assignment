import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Tasklist taskList = new Tasklist();
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;

            while (!exit) {
                System.out.println("Main Menu:");
                System.out.println("1. Add Task");
                System.out.println("2. Remove Task");
                System.out.println("3. Mark Task as Completed");
                System.out.println("4. View Tasks");
                System.out.println("5. View Task Statistics");
                System.out.println("6. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter task description: ");
                        String description = scanner.nextLine();
                        taskList.addTask(description);
                        break;
                    case 2:
                        System.out.print("Enter task index to remove: ");
                        int removeIndex = scanner.nextInt();
                        taskList.removeTask(removeIndex);
                        break;
                    case 3:
                        System.out.print("Enter task index to mark as completed: ");
                        int completeIndex = scanner.nextInt();
                        taskList.markTaskAsCompleted(completeIndex);
                        break;
                    case 4:
                        taskList.viewTasks();
                        break;
                    case 5:
                        taskList.viewStatistics();
                        break;
                    case 6:
                        exit = true;
                       
                }
            }

            scanner.close();
        }
    }

