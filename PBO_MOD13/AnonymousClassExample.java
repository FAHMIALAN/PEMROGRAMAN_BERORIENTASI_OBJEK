
interface Task {

    void perform();
}

class Project {

    void startTask(Task task) {
        task.perform();
    }
}

public class AnonymousClassExample {

    public static void main(String[] args) {
        Project project = new Project();

        // Anonymous class implementation
        project.startTask(new Task() {
            @Override
            public void perform() {
                System.out.println("Task is being performed");
            }
        });
    }
}
