package demo_chanhtran.ss11_generic_stack_queu;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DemoSuDunStackVaQueu {
    public static void main(String[] args) {
        Stack<Integer> stacks = new Stack<>();
        stacks.push(1);
        stacks.push(3);
        stacks.push(4);
        System.out.println(stacks);
//        System.out.println(stacks.pop());  // 4
//        System.out.println(stacks.pop());  // 3
//        System.out.println(stacks.pop());  // 1

        while (!stacks.isEmpty()){
            System.out.println("phần tử: "+ stacks.pop());
        }

        // ứng dụng chuyển đổi thập phân sang nhị phần  10/2=5 du 0 => 5/2=2 du 1 => 2/2 =1 dư 0 , 1/2=0 du 1   1010

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }
        System.out.println(queue);

//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.poll());
//        System.out.println(queue.element());
    }
}
