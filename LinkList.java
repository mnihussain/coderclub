package DS;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("NY");
        list.add("FL");
        list.add("CA");
        list.add("NJ");
        list.add("AZ");

        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (String st:list) {
            System.out.println("foreach loop "+"\n"+ st);

        }


    }
}
