package Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Stack1 {
    public static void main(String[] args) {

        Stack <Integer> str=new Stack<>();
        str.push(11);
        str.push(22);
        str.push(12);
        str.push(14);

        str.push(22);
        str.push(1);



        System.out.println("After peek  " +str.peek());
        System.out.println(str);
        System.out.println("after pop  "+str.pop());
        System.out.println(str);
    }
}
