public class MyArrayList<T> {
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    private Object[] elementData;
    private int size;

    public MyArrayList() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
        this.size = 0;
    }

    public Object[] getElement() {
        return elementData;
    }

    //add element to the end
    public void add(T value) {
        Object[] oldElement = getElement();
        Object[] newElement = new Object[oldElement.length + 1];
        System.arraycopy(oldElement, 0, newElement, 0, oldElement.length);
        newElement[newElement.length - 1] = value;
        elementData = newElement;
        size++;
    }

    // remove
    public void remove(int index) {
        if (index < size) {
            Object[] oldElement = getElement();
            Object[] newElement = new Object[oldElement.length - 1];
            System.arraycopy(oldElement, 0, newElement, 0, index);
            System.arraycopy(oldElement, index + 1, newElement, index, size - index - 1);
            elementData = newElement;
            size--;} else {
            System.out.println("Index " + index + " is not found");
        }
    }
    // clear
    public void clear() {
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
        this.size = 0;
    }

    //get
    public Object get(int index) {
        if (index <= size) {
            return elementData[index];
        } else {
            System.out.println("Index " + index + " is not found");
                return null;
        }
    }

    // print elements
    public void print() {
        for(Object element : elementData) {
            System.out.print(" " + element + " ") ;
        }
        System.out.println();
    }

    public int size() {
        return size;
    }
}
