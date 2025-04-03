package Collection;

import java.util.HashSet;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        Set <Integer> str=new HashSet<>();
        str.add(11);
        str.add(21);
        str.add(11);
        str.add(null);
        str.add(22);
        System.out.println(str);

    }
}
