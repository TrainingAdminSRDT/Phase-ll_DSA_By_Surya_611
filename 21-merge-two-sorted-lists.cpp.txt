class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        ListNode dummy(0);          // dummy head, value doesn't matter
        ListNode *tail = &dummy;    // tail always points to last node added
        
        while (list1 != nullptr && list2 != nullptr) {
            if (list1->val <= list2->val) {
                tail->next = list1;
                list1 = list1->next;
            } else {
                tail->next = list2;
                list2 = list2->next;
            }
            tail = tail->next;
        }
        
        // attach whichever list still has leftover nodes
        tail->next = (list1 != nullptr) ? list1 : list2;
        
        return dummy.next;
    }
};