package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import problem.datastructures.LinkedListNode;

public class TestUtils {

    public static void compareListsOfStrings(LinkedListNode<String> list1, LinkedListNode<String> list2) {
        if (list1 == null || list2 == null) {
            assertNull(list1);
            assertNull(list2);
            return;
        }
        assertEquals(list1.getValue(), list2.getValue());
        compareListsOfStrings(list1.getNext(), list2.getNext());
    }

}
