#include <stack>
using namespace std;

class Solution {
public:
    bool isValid(string s) {
        stack<char> st;
        
        for (char c : s) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                // it's a closing bracket
                if (st.empty()) return false;  // nothing to match against
                
                char top = st.top();
                if ((c == ')' && top == '(') ||
                    (c == '}' && top == '{') ||
                    (c == ']' && top == '[')) {
                    st.pop();  // matched! remove the opener
                } else {
                    return false;  // mismatched bracket types
                }
            }
        }
        
        return st.empty();  // valid only if everything got matched
    }
};