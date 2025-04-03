package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<String > arr=new ArrayList<>();
        arr.add("Gaurav");
        arr.add("Sachin");
        arr.add(null);
        arr.add("Abhi");
        arr.add("Gaurav");
        Iterator <String>it= arr.iterator();
       while(it.hasNext()){
           System.out.println(it.next());
       }


    }
}
