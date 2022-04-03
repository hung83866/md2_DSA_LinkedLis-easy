package com.company;

import LinkList.LinkedList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("-------------check add last------------");
        LinkedList<Integer> ints = new LinkedList<Integer>(10);
        ints.printList();

        System.out.println("số phần tử = " + ints.getNumberNodes());
        ints.addLast(11);
        ints.printList();
        System.out.println("số phần tử = " + ints.getNumberNodes());
        System.out.println("-------------check add first------------");
        ints.addFirst(6);
        ints.printList();
        System.out.println("số phần tử = " + ints.getNumberNodes());
        System.out.println("-------------check add(index,e)  0 < index < length------------");
        ints.add(1, 100);
        ints.printList();
        System.out.println("-------------check add(index,e) index > length || index < 0------------");
        ints.add(10, 6);
        ints.printList();
        System.out.println("--------------");
        ints.add(10, 6);
        ints.add(0, 0);
        ints.printList();
        System.out.println("-------------check remove(index) return E------------");
        System.out.println("element deleted = " + ints.remove(3));
        ints.printList();
        System.out.println("element deleted = " + ints.remove(0));
        ints.printList();
        System.out.println("-------------check boolean remove(index) return bl------------");
        System.out.println(ints.remove1(100));
        ints.printList();
        System.out.println("số phần tử = "+ints.getNumberNodes());
        System.out.println(ints.remove1(100));
        System.out.println(ints.remove1(11));
        ints.printList();
        System.out.println(ints.remove1(6));
        ints.printList();
        System.out.println("-------------check Clone return E------------");
        LinkedList<Integer> intssss = new LinkedList<Integer>();
        intssss = ints.clone();
        intssss.printList();
        System.out.println("-------------check Contains return BL------------");
        System.out.println(intssss.contains(100));
        System.out.println(intssss.contains(6));
        intssss.add(1,11);
        intssss.printList();
        System.out.println(intssss.contains(11));
        System.out.println("-------------check indexOf return int------------");
        intssss.printList();
        System.out.println("---");
        ints.printList();
    }
}
