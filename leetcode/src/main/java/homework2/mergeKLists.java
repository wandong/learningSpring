package homework2;

public class mergeKLists {


    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {

            if(lists==null||lists.length==0) return null;


            return mergeNMLists(lists,0,lists.length-1);

        }


        ListNode mergeNMLists(ListNode[] lists,int n,int m){


            if(n==m)return lists[m];

            int mid = (n+m)/2;

            ListNode listNode1 = mergeNMLists(lists,n,mid);
            ListNode listNode2 = mergeNMLists(lists,mid+1,m);

            return mergeTwoLists(listNode1,listNode2);


        }



        public ListNode mergeTwoLists(ListNode listNode1,ListNode listNode2){


            if(listNode1==null) return listNode2;

            if(listNode2==null ) return mergeTwoLists(listNode2,listNode1) ;

            if(listNode1.val>=listNode2.val){

                listNode2.next= mergeTwoLists(listNode1,listNode2.next);
                return listNode2;
            }

            return mergeTwoLists(listNode2,listNode1);




        }

    }
}
