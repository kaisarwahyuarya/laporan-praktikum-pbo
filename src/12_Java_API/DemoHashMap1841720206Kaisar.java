package Jobsheet12;

import java.util.HashMap;
import java.util.Collection;
import java.util.Iterator;

public class DemoHashMap1841720206Kaisar {

    public static void main(String[] args) {
        HashMap hMapItem = new HashMap();
        hMapItem.put("1", "biskuit");
        hMapItem.put("2", "Shampoo");
        hMapItem.put("3", "Soap");
        System.out.println(hMapItem);
        System.out.format("HashMao Item Total : %d\n\n", hMapItem.size());

        //Collection mCollection = hMapItem.values();
        //Iterator mIterator = mCollection.iterator();
        //while (mIterator.hasNext()){
        //    System.out.println(mIterator.next());
        //}
        
        Object mObject = hMapItem.remove("1");
        System.out.format("%s remove from Hashmap\n", mObject);
        System.out.format("HasMap item Total : %d\n", hMapItem.size());
        System.out.println(hMapItem);

        hMapItem.clear();
        System.out.format("HasMap Item Total : %d\n", hMapItem.size());
    }
}