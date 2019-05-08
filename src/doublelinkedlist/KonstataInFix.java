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
public class KonstataInFix {
    char [] operator = {'+','-','*','/','^'};
    char [] operand = {'0','1','2','3','4','5','6','7','8','9'};
    private char data;

    public KonstataInFix() {
        data = ' ';
    }
    
    public boolean isOperand(){
        boolean t = false;
        for (int i = 0; i < operand.length; i++) {
            if (data == operand[i]) {
                t = true;
                break;
            }
  
        }
        return t;
    }
    
    public boolean isOperator(){
        boolean t = false;
        for (int i = 0; i < operator.length; i++) {
            if (data == operator[i]) {
                t = true;
                break;
            }
        }
        return t;
    }

    public void setData(char data) {
        this.data = data;
    }

    public char getData() {
        return data;
    }
    
    
}
