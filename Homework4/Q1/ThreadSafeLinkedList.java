import java.util.LinkedList;
public class ThreadSafeLinkedList<T> {

    private static Object obj;
    private LinkedList<T> list;

    public ThreadSafeLinkedList(){
        obj = new Object();
        list = new LinkedList<T>();
    }

    public void addAtPosition(int index, T element){
        synchronized (obj){
            list.add(index,element);
        }
    }

    public void removeAtPosition(int index){
        synchronized (obj){
            if(list.size() <= index || index < 0) return;
            list.remove(index);
        }
    }

    public T getFirst() {
        synchronized (obj){
            return list.getFirst();
        }
    }

    public T getLast() {
        synchronized (obj){
            return list.getLast();
        }
    }

    public int size(){
        synchronized (obj){
            return list.size();
        }
    }
}
