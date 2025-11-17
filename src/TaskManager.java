import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String description) {
        Task newTask = new Task(description);
        tasks.add(newTask);
        System.out.println("Задача добавлена успешно (ID: " + newTask.getId() + ")");
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст.");
        } else {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    public void updateTaskStatus(int id, TaskStatus newStatus) {
        Task task = findTaskById(id);
        if (task != null) {
            task.setStatus(String.valueOf(newStatus));
            System.out.println("Статус задачи ID " + id + " обновлен на '" + newStatus + "'");
        } else {
            System.out.println("Задача с ID " + id + " не найдена.");
        }
    }

    public void deleteTask(int id) {
        Task task = findTaskById(id);
        if (task != null) {
            tasks.remove(task);
            System.out.println("Задача с ID " + id + " удалена.");
        } else {
            System.out.println("Задача с ID " + id + " не найдена.");
        }
    }

    private Task findTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

}