package Easy;

/*

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Example 1:

Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]

 */

public class MergeTwoSortedLists {
        private ListNode list1, list2;

        public MergeTwoSortedLists(ListNode list1, ListNode list2) {
                this.list1 = list1;
                this.list2 = list2;
        }

        public ListNode offerSolution() {
                ListNode dummy = new ListNode();
                ListNode currNode = dummy;

                while(list1 != null && list2 != null) {
                        if (list1.val < list2.val) {
                                currNode.next = list1;
                                list1 = list1.next;
                        } else {
                                currNode.next = list2;
                                list2 = list2.next;
                        }
                        currNode = currNode.next;
                }

                if (list1 != null) currNode.next = list1;
                else if (list2 != null) currNode.next = list2;


                return dummy.next;
        }
}
