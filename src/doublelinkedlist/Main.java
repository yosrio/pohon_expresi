/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doublelinkedlist;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
//        stack.push("1");
////        stack.push("2");
////        stack.push("3");
////        stack.push("4");
//        System.out.println(stack.toString());
//        stack.pop();
//        stack.push("2");
//        System.out.println(stack.toString());
        
        String i = "2 8 3 1 * - + 2 /";
        System.out.println(stack.operasi(i).toString());
    }
}
