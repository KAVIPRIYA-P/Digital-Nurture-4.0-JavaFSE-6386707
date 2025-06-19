package TaskManagementSystem;

public class TaskManager {
    private Node head;

    public void addTask(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
            System.out.println("Task added as head.");
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            System.out.println("Task added to the list.");
        }
    }

    public Task searchTask(int taskId) {
        Node temp = head;
        while (temp != null) {
            if (temp.task.taskId == taskId) {
                return temp.task;
            }
            temp = temp.next;
        }
        return null;
    }

    public void traverseTasks() {
        Node temp = head;
        if (temp == null) {
            System.out.println("No tasks to display.");
            return;
        }
        System.out.println("Task List:");
        while (temp != null) {
            System.out.println(temp.task);
            temp = temp.next;
        }
    }

    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        if (head.task.taskId == taskId) {
            head = head.next;
            System.out.println("Task deleted from head.");
            return;
        }

        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            if (curr.task.taskId == taskId) {
                prev.next = curr.next;
                System.out.println("Task deleted.");
                return;
            }
            prev = curr;
            curr = curr.next;
        }
        System.out.println("Task not found.");
    }

}
