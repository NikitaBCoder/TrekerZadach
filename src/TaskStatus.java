import java.util.HashMap;
import java.util.Map;

public enum TaskStatus {
    NEW(0),
    IN_PROGRESS(1),
    DONE(2);

    private final int id;
    private static final Map<Integer, TaskStatus> BY_ID = new HashMap<>();
    static {
        for (TaskStatus role : TaskStatus.values()) {
            BY_ID.put(role.id, role);
        }
    }
    TaskStatus(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static TaskStatus getById(int id) {
        // Метод get() возвращает null, если ключ не найден
        return BY_ID.get(id);
    }

}
