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
public class ListNode {
    private String data;
    private ListNode next;
    
    ListNode(String data){
        this.data = data;
    }
    ListNode(int data, ListNode Node){
        
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getNext() {
        return next;
    }
    
    
}
