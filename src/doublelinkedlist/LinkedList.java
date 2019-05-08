/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlist;

/**
 *
 * @author Johan
 */
public class LinkedList {

    private ListNode firstNode;
    private ListNode lastNode;
    private String nama;
    private int size;

    LinkedList() {
        size = 0;
    }

    LinkedList(String nama) {
        this.nama = nama;
    }

    public void addFirst(String data) {
        ListNode baru = new ListNode(data);
        if (isEmpty()) {
            firstNode = baru;
            lastNode = baru;

        } else {
            baru.setNext(firstNode);
            firstNode = baru;
        }
        size++;
    }

    public void addLast(String data) {
        ListNode baru = new ListNode(data);
        if (isEmpty()) {
            firstNode = baru;
            lastNode = baru;
        } else {
            lastNode.setNext(baru);
            lastNode = baru;

        }
        size++;
    }

    public ListNode removeFirst() {
        if (!isEmpty()) {
            ListNode bantu = firstNode;
            firstNode = firstNode.getNext();
            size--;
            return bantu;
        } else {
            return null;
        }
    }

    public ListNode removeLast() {
        if (!isEmpty()) {
            ListNode bantu = firstNode;
            if (size == 1) {
                firstNode = null;
                lastNode = null;
            } else {

                while (bantu.getNext() != lastNode) {
                    bantu = bantu.getNext();
                }
                lastNode = bantu;
                lastNode.setNext(null);
            }

            size--;
            return bantu;
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        if (firstNode == null && lastNode == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String isi = "[";
        if (!isEmpty()) {
            ListNode pointer = firstNode;
            isi = isi + pointer.getData();

            pointer = pointer.getNext();

            while (pointer != null) {
                isi = isi + ", " + pointer.getData();
                pointer = pointer.getNext();
            }
            isi = isi + "]";
        }
        return isi;
    }

    public int getSize() {
        return size;
    }

    public ListNode getLastNode() {
        return lastNode;
    }

    
}
