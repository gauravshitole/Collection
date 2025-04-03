package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linklist1 {
    public static void main(String[] args) {
        List <Integer> al=new LinkedList<>();
        al.add(11);
        al.add(21);
        al.add(51);
        al.add(11);
        al.add(null);

        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println("Linklist is :"+itr.next());
        }
    }

}
