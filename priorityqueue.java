import java.util.PriorityQueue;

public class priorityqueue {
    public static void main(String[] args){
        PriorityQueue<Integer> p=new PriorityQueue<>();
        p.offer(40);
        p.offer(30);
        p.offer(12);
        p.offer(21);
         System.out.println(p);
         p.poll();
        System.out.println(p);
        p.remove();
        System.out.println(p);
        p.offer(50);
        System.out.println(p);
        p.peek();
        System.out.println(p);
        //p.clear();
        System.out.println(p);
        System.out.println(p.size());
        System.out.println(p.isEmpty());
    }
}
