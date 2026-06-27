import java.util.Stack;

public class redoundo {
    public static void main(String[] args) {
        Stack<String> undoStack = new Stack<>();
        Stack<String> redoStack = new Stack<>();

        // User actions
        undoStack.push("Type A");
        undoStack.push("Type B");
        undoStack.push("Type C");

        System.out.println("Current Actions: " + undoStack);

        // Undo
        String action = undoStack.pop();
        redoStack.push(action);
        System.out.println("Undo: " + action);

        // Redo
        action = redoStack.pop();
        undoStack.push(action);
        System.out.println("Redo: " + action);

        System.out.println("Final Actions: " + undoStack);
    }
}