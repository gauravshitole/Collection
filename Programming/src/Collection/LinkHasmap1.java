package Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkHasmap1 {
    public static void main(String[] args) {
        Map<Integer,String> map=new LinkedHashMap<>();
        map.put(1,"Virat");
        map.put(2,"Rahul");
        map.put(3,"Rohit");
        map.put(1,"ajit");
        map.put(4,"Virat");
        System.out.println(map);
    }
}
