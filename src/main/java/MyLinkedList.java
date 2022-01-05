import java.util.Collection;

public class MyLinkedList <T> {
    private Entry<T> first;
    private Entry<T> last;
    private int size;

    public MyLinkedList(){

    }

    public MyLinkedList(Collection<? extends T> c){
    }

    public Integer size(){
        return null;
    }

    public void add(T value){

    }

    public T remove(T value){
        return null;
    }

    public void sort(){

    }

    public static class Entry<T>{
        private T element;
        private Entry<T> prev;
        private Entry<T> next;
        public Entry(T element,Entry<T> prev,Entry<T> next){
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }

}
