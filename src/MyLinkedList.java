public class MyLinkedList<T> {
    private Node<T> first;

    public void add(T currentElement) {
        if(first == null) {
            first = new Node<>(currentElement);
        } else {
            Node<T> current = first;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            Node<T> newNode = new Node<>(currentElement);
            current.setNext(newNode);
            newNode.setPrev(current);
        }
    }

    public int size() {
        if (first == null) {
            return 0;
        } else {
            Node<T> current = first;
            int count = 1;
            while (current.getNext() != null) {
                current = current.getNext();
                count++;
            }
            return count;
        }
    }

    public void remove(int index) {
        if(size() < index) {
            return;
        } else if(index == 0) {
            first = first.getNext();
            first.setPrev(null);
        } else if(index == size() - 1) {
            getNode(index - 1).setNext(null);
        } else {
            Node right = getNode(index + 1);
            Node left = getNode(index - 1);
            left.setNext(right);
            right.setPrev(left);
        }
    }

    public void clear() {
        first = null;
    }

    public T get (int index) {
        return getNode(index).getCurrentElement();
    }

    private Node<T> getNode(int index) {
        int hop = 0;
        Node<T> current = first;
        while (hop < index) {
            current = current.getNext();
            hop++;
        }
        return current;
    }

    // print list
    public void print() {
        Node<T> iterator = first;
        if (iterator == null) return;

        do {
            System.out.print("" + iterator.getCurrentElement() + " ");
            iterator = iterator.getNext();
        } while (iterator != null);
        System.out.println();
    }
}
