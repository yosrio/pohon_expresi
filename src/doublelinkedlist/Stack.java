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
public class Stack {

    private LinkedList tumpukan;

    public Stack() {
        tumpukan = new LinkedList();
    }

    public void push(String data) {
        tumpukan.addLast(data);
    }

    public ListNode pop() {
        return tumpukan.removeLast();
    }

    public int size() {
        return tumpukan.getSize();
    }

    public boolean isEmpty() {
        return tumpukan.isEmpty();
    }

    public LinkedList getTumpukan() {
        return tumpukan;
    }
    
    

    @Override
    public String toString() {
        return tumpukan.toString();
    }
    
    public Stack operasi (String exp){
        Stack s = new Stack();
        String [] split = exp.split(" ");
        KonstataInFix [] kif = new KonstataInFix[split.length];
        
        for (int i = 0; i < kif.length; i++) {
            kif[i] = new KonstataInFix();
            kif[i].setData((char)split[i].charAt(0));
            System.out.print(kif[i].getData() + " ");
        }
        System.out.println("");
        for (int i = 0; i < kif.length; i++) {
            if (kif[i].isOperand()) {
                s.push(String.valueOf(kif[i].getData()));
            } else if(kif[i].isOperator()){
                String b = s.getTumpukan().getLastNode().getData();
                s.pop();
                String a = s.getTumpukan().getLastNode().getData();
                s.pop();
                if (kif[i].getData() == '+') {
                    double hasil = Double.parseDouble(a) + Double.parseDouble(b);
                    s.push(String.valueOf(hasil));
                }
                else if (kif[i].getData() == '-') {
                    double hasil = Double.parseDouble(a) - Double.parseDouble(b);
                    s.push(String.valueOf(hasil));
                }
                if (kif[i].getData() == '*') {
                    double hasil = Double.parseDouble(a) * Double.parseDouble(b);
                    s.push(String.valueOf(hasil));
                }
                if (kif[i].getData() == '/') {
                    double hasil = Double.parseDouble(a) / Double.parseDouble(b);
                    s.push(String.valueOf(hasil));
                }
            }
            
        }
        return s;
    }
}
