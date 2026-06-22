#include <iostream>
#include <stack>
using namespace std;

int main() {
    stack<int> s;
    
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
    
    // print remaining stack
    cout << "Final stack (top to bottom): ";
    while (!s.empty()) {
        cout << s.top() << " ";
        s.pop();
    }
    cout << endl;
    
    return 0;
}