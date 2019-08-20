package concurrency.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class EgOfSynchList {
    public static void main(String args[]){
        List<String> a = Collections.synchronizedList(new ArrayList<String>());
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        synchronized(a) {
            // must be in synchronized block so that list is thredsafe
            Iterator<String> it = a.iterator();
            while (it.hasNext()) {
                String value = it.next();
                System.out.println(" " + value);
                //if (value.equals("2"))
                   // a.remove(value); //these will throw error as sync is on segment but on block
            }
        }

    }

}
