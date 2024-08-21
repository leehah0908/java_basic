package etc.api.utiil.collection.list;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // 추가
        list.add("홍길동");
        list.add("김철수");
        list.add("박영희");

        list.addFirst("맨 앞");
        list.addLast("맨 뒤");

        System.out.println(list);
        System.out.println(list.get(3)); // 인덱스로 접근을 하는 것처럼 보이지만, 내부에선 주소로 접근을 하는 것임
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.remove("맨 앞");
        System.out.println(list);

        System.out.println("=================================");
        // LIFO -> Stack
        list.push("춘식이"); // -> 맨 앞에 추가
        System.out.println(list);

        // 삭제와 동시에 참조 (Stack)
        System.out.println(list.pop()); // -> 리턴값이 있음!
        System.out.println(list);

        // 삭제하지 않으면서 참조
        System.out.println(list.peek()); // -> 리턴값이 있음!
        System.out.println(list);

        System.out.println("=================================");
        // FIFO -> Queue
        // offer, poll, peak
        list.offer("a"); // -> 맨 뒤에 추가
        list.offer("b");
        list.offer("c");
        System.out.println(list);

        // 삭제와 동시에 참조 (Queue)
        System.out.println(list.poll()); // -> 리턴값이 있음!
        System.out.println(list);

    }
}
