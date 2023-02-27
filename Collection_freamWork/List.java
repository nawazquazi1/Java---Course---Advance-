package Collection_freamWork;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class List {

    public static void main(String[] args) {
//        ArrayList
//       It is best option for frequent retrieval operations
        ArrayList<String> list = new ArrayList<>();
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");
        list.add("60");
        System.out.println(list);

//        LinkedList

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("10");
        linkedList.add("20");
        linkedList.add("30");
        linkedList.add("40");
        linkedList.add("50");
        linkedList.add("60");
        System.out.println(linkedList);
        System.out.println(linkedList.size());//6
        System.out.println(linkedList.contains("30"));//true
        System.out.println(linkedList.element());//10
        System.out.println(linkedList.get(3));//40
        System.out.println(linkedList.lastIndexOf("40"));//3
        System.out.println(linkedList.getFirst());//10
        System.out.println(linkedList.getLast());//60
        System.out.println(linkedList.indexOf("60"));//5
        System.out.println(linkedList.offer("70"));//add 70
        System.out.println(linkedList);
        System.out.println(linkedList.peek());//10
        System.out.println(linkedList.peekFirst());//10
        System.out.println(linkedList.poll());//
        System.out.println(linkedList);
        System.out.println(linkedList.pop());//20 remove
        linkedList.add(3, "50");
        System.out.println(linkedList);


        Deque<String> dq = new ArrayDeque<>();
        dq.addFirst("AAA");
        dq.addLast("bbb");
        dq.offerFirst("ccc");
        dq.offerLast("ddd");
        dq.addFirst("eee");
        dq.offerLast("fff");
        System.out.println(dq);
    }
}
