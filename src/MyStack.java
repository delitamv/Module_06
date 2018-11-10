public class MyStack<T> extends MyLinkedList{

    public void push(T currentElement) {
        super.add(currentElement);
    }

    // get LIFO
    public T peek() {
        return (size() > 0)?(T)get(size() -1):null;
    }

    // get and remove LIFO
    public T pop() {
        T result = peek();
        if(size() > 0) {
            remove(size() -1);
        }
        return result;
    }
}

