package tests;

import static org.junit.Assert.assertNull;

import org.junit.Test;

import problem.datastructures.LinkedListNode;
import problem.*;

public class TestProblemSet2 {

    // ----- Uncomment the tests below once you have written all the classes/methods
    // ----- You can uncomment multiple lines by selecting them and pressing ctrl+/
    // ----- (command+/ on mac)
    // ----- These tests will not compile until you have written the required
    // ----- methods in the
    // ----- StringList class.

    // @Test
    // public void testDeleteElement() {
    //     StringList list = new StringList();
    //     LinkedListNode<String> set = new LinkedListNode<>("1",
    //             new LinkedListNode<>("2",
    //                     new LinkedListNode<>("3",
    //                             new LinkedListNode<>("4",
    //                                     new LinkedListNode<>("5", null)))));
    //     list.setList(set);

    //     list.deleteElement("3");
    //     LinkedListNode<String> expected = new LinkedListNode<>("1",
    //             new LinkedListNode<>("2",
    //                     new LinkedListNode<>("4",
    //                             new LinkedListNode<>("5", null))));
    //     TestUtils.compareListsOfStrings(expected, list.getList());

    //     list.deleteElement("4");
    //     expected = new LinkedListNode<>("1", new LinkedListNode<>("2", new LinkedListNode<>("5", null)));
    //     TestUtils.compareListsOfStrings(expected, list.getList());

    //     list.deleteElement("2");
    //     expected = new LinkedListNode<>("1", new LinkedListNode<>("5", null));
    //     TestUtils.compareListsOfStrings(expected, list.getList());
    // }

    // @Test
    // public void testDeleteFirstLast() {
    //     StringList list = new StringList();
    //     LinkedListNode<String> set = new LinkedListNode<>("1",
    //             new LinkedListNode<>("2",
    //                     new LinkedListNode<>("3",
    //                             new LinkedListNode<>("4",
    //                                     new LinkedListNode<>("5", null)))));
    //     list.setList(set);

    //     list.deleteElement("1");
    //     LinkedListNode<String> expected = new LinkedListNode<>("2",
    //             new LinkedListNode<>("3",
    //                     new LinkedListNode<>("4",
    //                             new LinkedListNode<>("5", null))));
    //     TestUtils.compareListsOfStrings(expected, list.getList());

    //     list.deleteElement("5");
    //     expected = new LinkedListNode<>("2", new LinkedListNode<>("3", new LinkedListNode<>("4", null)));
    //     TestUtils.compareListsOfStrings(expected, list.getList());

    //     list.deleteElement("4");
    //     expected = new LinkedListNode<>("2", new LinkedListNode<>("3", null));
    //     TestUtils.compareListsOfStrings(expected, list.getList());

    //     list.deleteElement("2");
    //     expected = new LinkedListNode<>("3", null);
    //     TestUtils.compareListsOfStrings(expected, list.getList());

    //     list.deleteElement("3");
    //     assertNull(list.getList());
    // }

    // @Test
    // public void testDeleteWithDuplicates() {
    //     StringList list = new StringList();
    //     LinkedListNode<String> set = new LinkedListNode<>("1",
    //             new LinkedListNode<>("3",
    //                     new LinkedListNode<>("3",
    //                             new LinkedListNode<>("3",
    //                                     new LinkedListNode<>("2",
    //                                             new LinkedListNode<>("3",
    //                                                     new LinkedListNode<>("1", null)))))));
    //     list.setList(set);

    //     list.deleteElement("3");
    //     LinkedListNode<String> expected = new LinkedListNode<>("1",
    //             new LinkedListNode<>("3",
    //                     new LinkedListNode<>("3",
    //                             new LinkedListNode<>("2",
    //                                     new LinkedListNode<>("3",
    //                                             new LinkedListNode<>("1", null))))));
    //     TestUtils.compareListsOfStrings(expected, list.getList());

    //     list.deleteElement("1");
    //     expected = new LinkedListNode<>("3",
    //             new LinkedListNode<>("3",
    //                     new LinkedListNode<>("2",
    //                             new LinkedListNode<>("3",
    //                                     new LinkedListNode<>("1", null)))));
    //     TestUtils.compareListsOfStrings(expected, list.getList());

    //     list.deleteElement("3");
    //     expected = new LinkedListNode<>("3",
    //             new LinkedListNode<>("2",
    //                     new LinkedListNode<>("3",
    //                             new LinkedListNode<>("1", null))));
    //     TestUtils.compareListsOfStrings(expected, list.getList());

    //     list.deleteElement("3");
    //     expected = new LinkedListNode<>("2",
    //             new LinkedListNode<>("3",
    //                     new LinkedListNode<>("1", null)));
    //     TestUtils.compareListsOfStrings(expected, list.getList());
    // }

    // @Test
    // public void testDeleteEmptyOrNoElement() {
    //     StringList list = new StringList();
    //     assertNull(list.getList());

    //     list.deleteElement("not in list");
    //     assertNull(list.getList());

    //     LinkedListNode<String> set = new LinkedListNode<>("1",
    //             new LinkedListNode<>("2",
    //                     new LinkedListNode<>("3",
    //                             new LinkedListNode<>("4",
    //                                     new LinkedListNode<>("5", null)))));
    //     list.setList(set);
    //     TestUtils.compareListsOfStrings(set, list.getList());

    //     list.deleteElement("not in list");
    //     TestUtils.compareListsOfStrings(set, list.getList());
    // }

}
