import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Меню Трекера Задач ---");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Посмотреть все задачи");
            System.out.println("3. Обновить статус задачи");
            System.out.println("4. Удалить задачу");
            System.out.println("5. Выйти");
            System.out.print("Введите ваш выбор: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    // Логика добавления задачи
                    System.out.println("Введите описание задачи:");
                    String DiskriptionTask = scanner.nextLine();
                    taskManager.addTask(DiskriptionTask);
                    break;
                case "2":
                    // Логика просмотра задач
                    taskManager.viewTasks();
                    break;
                case "3":
                    // Логика обновления статуса задачи
                    taskManager.viewTasks();
                    System.out.print("Введите id задачи: ");
                    String NumTaskUpdate = scanner.nextLine();
                    for (TaskStatus status : TaskStatus.values()) {
                        System.out.println(status.ordinal() + " " + status);
                    }
                    System.out.print("Введите номер статуса: ");
                    String number = scanner.nextLine();

                    TaskStatus StatusUpdate = TaskStatus.getById(Integer.parseInt(number));

                    if (StatusUpdate == null){
                        System.out.print("Статус с ID " + number + " не найден.");
                        break;
                    }else {
                        taskManager.updateTaskStatus(Integer.parseInt(NumTaskUpdate), StatusUpdate);
                    }

                    break;
                case "4":
                    // Логика удаления задачи
                    taskManager.viewTasks();
                    System.out.print("Введите id задачи: ");
                    String NumTaskDelete = scanner.nextLine();
                    taskManager.deleteTask(Integer.parseInt(NumTaskDelete));
                    break;
                case "5":
                    System.out.println("Выход из программы.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Неверный ввод. Пожалуйста, попробуйте снова.");
            }
        }
    }
}
