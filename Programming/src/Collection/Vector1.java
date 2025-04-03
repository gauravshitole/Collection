package Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        List<Integer> list=new Vector<>();
        list.add(11);
        list.add(14);
        list.add(11);
        list.add(null);
        Iterator it=list.iterator();
        while(it.hasNext()){
            System.out.println("Vector is: "+it.next());

    }
    }
}
