import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedList21Test {

    private static boolean compararListas(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
    }

    @Test
    void mergeTwoLists() {
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

        ListNode listR1 = new ListNode(1);
        ListNode listR2 = new ListNode(1);
        ListNode listR3 = new ListNode(2);
        ListNode listR4 = new ListNode(3);
        ListNode listR5 = new ListNode(4);
        ListNode listR6 = new ListNode(4);
        listR1.next = listR2;
        listR2.next = listR3;
        listR3.next = listR4;
        listR4.next = listR5;
        listR6.next = listR6;

        ListNode resultado = MergeTwoSortedList21.mergeTwoLists(list1,list2);
        Assert.assertTrue(compararListas(listR1,resultado));
    }
}