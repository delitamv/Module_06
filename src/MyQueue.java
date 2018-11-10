public class MyQueue<T> extends MyLinkedList{

    // get FIFO
    public T peek() {
        return (size() > 0)?(T)get(0):null;
    }

    // get and remove FIFO
    public T poll() {
        T result = peek();
        if(size() > 0) {
            remove(0);
        }
        return result;
    }
}
