public class Task {
    private static int nextId = 1;
    private int id;
    private String description;
    private String status; // Например: "NEW", "IN_PROGRESS", "DONE"

    public Task(String description) {
        this.id = nextId++;
        this.description = description;
        this.status = "NEW";
    }

    // Геттеры и сеттеры
    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{id=" + id + ", description='" + description + "', status='" + status + "'}";
    }
}