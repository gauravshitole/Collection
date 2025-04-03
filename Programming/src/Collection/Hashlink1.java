package Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Hashlink1 {
    public static void main(String[] args) {
        Set<Integer> str=new LinkedHashSet<>();
        str.add(11);
        str.add(null);
        str.add(31);
        str.add(11);
        str.add(19);
        System.out.println(str);
    }
}
