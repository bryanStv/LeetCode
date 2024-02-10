public class MergeTwoSortedList21 {
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
    public static void main(String[] args) {
        //list1 = [1,2,4], list2 = [1,3,4]
        ListNode list1 = new ListNode(1);
        ListNode list3 = new ListNode(2);
        ListNode list4 = new ListNode(4);
        list1.next = list3;
        list3.next = list4;
        ListNode list2 = new ListNode(1);
        ListNode list5 = new ListNode(3);
        ListNode list6 = new ListNode(4);
        list2.next = list5;
        list5.next = list6;

        printList(mergeTwoLists(list1,list2));
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode aux = new ListNode();
        ListNode resultado = aux;
        while (list1 != null && list2 != null){
            if(list1.val < list2.val){
                resultado.next = list1;
                list1 = list1.next;
            }else{
                resultado.next = list2;
                list2 = list2.next;
            }
            resultado = resultado.next;
        }
        resultado.next = (list1 != null) ? list1 : list2;
        return aux.next;
    }

    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            if(current.next == null){
                System.out.println(current.val);
                return;
            }
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println();
    }
}
class ListNode{
    protected int val;
    protected ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
    @Override
    public String toString(){
        return this.val+"";
    }
}
