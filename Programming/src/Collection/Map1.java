package Collection;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(11,"Ganesh");
        map.put(21,"Sachin");
        map.put(22,null);
        map.put(12,"Rahul");
        map.put(201,"Anikte");

        System.out.println(map);
        System.out.println(map.get(11));
    }
}
