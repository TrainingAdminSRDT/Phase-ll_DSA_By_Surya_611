#include <iostream>
using namespace std;

class Node {
public:
    int data;
    Node* next;
    Node(int val) {
        data = val;
        next = nullptr;
    }
};

class Stack {
private:
    Node* topNode;  // head of the linked list = top of stack

public:
    Stack() {
        topNode = nullptr;
    }

    void push(int val) {
        Node* newNode = new Node(val);
        newNode->next = topNode;   // new node points to old top
        topNode = newNode;         // new node becomes the top
        cout << "Pushed: " << val << endl;
    }

    void pop() {
        if (isEmpty()) {
            cout << "Stack is empty, cannot pop!" << endl;
            return;
        }
        Node* temp = topNode;
        cout << "Popped: " << topNode->data << endl;
        topNode = topNode->next;   // move top to the next node
        delete temp;               // free the old top
    }

    int peek() {
        if (isEmpty()) {
            cout << "Stack is empty!" << endl;
            return -1;
        }
        return topNode->data;
    }

    bool isEmpty() {
        return topNode == nullptr;
    }

    void display() {
        Node* curr = topNode;
        cout << "Stack (top to bottom): ";
        while (curr != nullptr) {
            cout << curr->data << " ";
            curr = curr->next;
        }
        cout << endl;
    }
};

int main() {
    Stack s;

    s.push(9);
    s.push(7);
    s.pop();
    s.push(11);
    s.push(13);
    s.push(17);
    s.pop();
    s.pop();
    s.push(32);
    s.pop();
    s.pop();
    s.push(32);
    s.pop();

    s.display();

    return 0;
}