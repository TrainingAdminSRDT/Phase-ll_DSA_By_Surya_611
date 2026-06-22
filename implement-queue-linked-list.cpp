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

class Queue {
private:
    Node* front;
    Node* rear;

public:
    Queue() {
        front = nullptr;
        rear = nullptr;
    }

    void enqueue(int val) {
        Node* newNode = new Node(val);
        if (rear == nullptr) {
            // queue was empty: new node is both front and rear
            front = newNode;
            rear = newNode;
        } else {
            rear->next = newNode;  // attach new node after current rear
            rear = newNode;        // new node becomes the new rear
        }
        cout << "Enqueued: " << val << endl;
    }

    void dequeue() {
        if (isEmpty()) {
            cout << "Queue is empty, cannot dequeue!" << endl;
            return;
        }
        Node* temp = front;
        cout << "Dequeued: " << front->data << endl;
        front = front->next;       // move front forward
        if (front == nullptr) {
            rear = nullptr;         // queue is now empty, reset rear too
        }
        delete temp;
    }

    int peek() {
        if (isEmpty()) {
            cout << "Queue is empty!" << endl;
            return -1;
        }
        return front->data;
    }

    bool isEmpty() {
        return front == nullptr;
    }

    void display() {
        Node* curr = front;
        cout << "Queue (front to rear): ";
        while (curr != nullptr) {
            cout << curr->data << " ";
            curr = curr->next;
        }
        cout << endl;
    }
};

int main() {
    Queue q;

    q.enqueue(9);
    q.enqueue(7);
    q.dequeue();
    q.enqueue(11);
    q.enqueue(13);
    q.enqueue(17);
    q.dequeue();
    q.dequeue();
    q.enqueue(32);
    q.dequeue();
    q.dequeue();
    q.enqueue(32);
    q.dequeue();

    q.display();

    return 0;
}