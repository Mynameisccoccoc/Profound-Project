package profound;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        List<String>list=new ArrayList<String>();
        list.add("Pune");
        list.add("Mumbai");
        list.add("Delhi");
        list.add("Nashik");
        list.add("Pune");
        System.out.println(list);
        for(String s1:list)
        {
            System.out.println(s1);
        }
        Iterator<String> itr=list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
                System.out.println("Element at 2 pos="+list.get(1));
        list.set(2, "New Delhi");
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        list.add(2,"Solapur");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
