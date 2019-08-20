package concurrency.list;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* CopyOnWriteArrayList :
A thread-safe variant of ArrayList in which all mutative operations (e.g. add, set, remove..)
 are implemented by creating a separate copy of underlying array. It achieves thread-safety by
 creating a separate copy of List which is a is different way than vector or other collections
  use to provide thread-safety.

It is useful when you can’t or don’t want to synchronize the traversal, yet need to prevent
interference among concurrent threads.
It is costly as involves separate Array copy with every write operation(e.g. add, set, remove..)
It is very efficient when you have List and need to traverse over its elements and don’t modify often it.
Iterator does not throw ConcurrentModificationException even if copyOnWriteArrayList is modified
once iterator is created because iterator is iterating over the separate copy of ArrayList while
write operation is happening on another copy of ArrayList.
 */
public class EgOfCopyOnWriteArrayList {
    public static void main(String args[]){
       List<String> threadSafeList = new CopyOnWriteArrayList<String>(); //No compilation errors
        threadSafeList.add("1");
        threadSafeList.add("2");
        threadSafeList.add("3");
        threadSafeList.add("4");
            Iterator<String> it = threadSafeList.iterator();
            while (it.hasNext()) {
                String value = it.next();
                System.out.println(" " + value);
                if (value.equals("2"))
                    threadSafeList.remove(value);
            }
            Iterator<String> it1 = threadSafeList.iterator();
            while (it1.hasNext()) {
                String value = it1.next();
                System.out.println(" " + value);
                //it1.remove(); //throws UnsupportedOperationException
            }



    }

}
