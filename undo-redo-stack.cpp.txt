#include <iostream>
#include <stack>
#include <string>
using namespace std;

class UndoRedo {
private:
    stack<string> undoStack;
    stack<string> redoStack;

public:
    // Call this whenever a new action is performed
    void doAction(const string& action) {
        undoStack.push(action);
        // new action invalidates redo history
        while (!redoStack.empty()) redoStack.pop();
        cout << "Did: " << action << endl;
    }

    void undo() {
        if (undoStack.empty()) {
            cout << "Nothing to undo!" << endl;
            return;
        }
        string action = undoStack.top();
        undoStack.pop();
        redoStack.push(action);
        cout << "Undid: " << action << endl;
    }

    void redo() {
        if (redoStack.empty()) {
            cout << "Nothing to redo!" << endl;
            return;
        }
        string action = redoStack.top();
        redoStack.pop();
        undoStack.push(action);
        cout << "Redid: " << action << endl;
    }
};

int main() {
    UndoRedo editor;

    editor.doAction("Type 'Hello'");
    editor.doAction("Type ' World'");
    editor.doAction("Type '!'");

    editor.undo();   // undoes "Type '!'"
    editor.undo();   // undoes "Type ' World'"
    editor.redo();   // redoes "Type ' World'"

    editor.doAction("Type ' there'"); // new action -> clears redo history

    editor.redo();   // nothing to redo now

    return 0;
}