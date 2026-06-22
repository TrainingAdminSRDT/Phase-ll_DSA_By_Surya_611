class Solution {
public:
    bool isPalindrome(ListNode* head) {
        // Step 1: find middle using slow/fast
        ListNode *slow = head, *fast = head;
        while (fast != nullptr && fast->next != nullptr) {
            slow = slow->next;
            fast = fast->next->next;
        }
        
        // Step 2: reverse second half (starting at slow)
        ListNode *prev = nullptr, *curr = slow;
        while (curr != nullptr) {
            ListNode *nextTemp = curr->next;
            curr->next = prev;
            prev = curr;
            curr = nextTemp;
        }
        
        // Step 3: compare first half and reversed second half
        ListNode *p1 = head, *p2 = prev;
        bool result = true;
        while (p2 != nullptr) {
            if (p1->val != p2->val) {
                result = false;
                break;
            }
            p1 = p1->next;
            p2 = p2->next;
        }
        
        return result;
    }
};