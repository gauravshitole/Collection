package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue <String> que=new LinkedList<>();
        que.add("sachin");
        que.add("tajas");
        que.add("abhi");
        que.add("sachin");
        System.out.println(que);
        System.out.println(que.peek());
        System.out.println(que);
        System.out.println(que.element());
        System.out.println(que);
        System.out.println(que.poll());
        System.out.println(que);
        System.out.println(que.isEmpty());

    }
}
