package profound;
import java.util.*;
public class Linklist {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(10);
        System.out.println(list);
        for(Integer n1:list)
        {
            System.out.println(n1);
        }
        System.out.println("First Occurance of 10="+list.indexOf(10));
        System.out.println("Last Occurance of 10="+list.lastIndexOf(10));
        List<Integer>list2=list.subList(1,3);
        System.out.println(list2);
    }
}
