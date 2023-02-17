package task_876;

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {

    public ListNode middleNode(ListNode head) {
        ListNode currentNode = head;
        int length = 1;
        while (currentNode.next != null) {
            length += 1;
            currentNode = currentNode.next;
        }
        length /= 2;
        length++;
        currentNode = head;
        int currentLenght = 1;
        while (currentLenght < length) {
            currentNode = currentNode.next;
            currentLenght++;
        }
        return currentNode;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("Array list insertion:");
        long start = System.nanoTime();
        for (int i = 0; i < 1_000; i++) {
            arrayList.add(i);
            //System.out.println("Item #" + i + ": " + (System.nanoTime() - start) + " ns");
            System.out.println((System.nanoTime() - start));
        }
//        for (int i = 0; i < 1_000; i++) {
//            linkedList.add(i);
//            //System.out.println("Item #" + i + ": " + (System.nanoTime() - start) + " ns");
//            System.out.println((System.nanoTime() - start));
//        }
    }

}
