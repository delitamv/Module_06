import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       MyArrayList<String> myArrayList = new MyArrayList<>();

        System.out.println("Add My Array List: ");
        myArrayList.add("Marina");
        myArrayList.add("Masha");
        myArrayList.add("Djastin");
        myArrayList.add("Kos");
        myArrayList.add("Mary");
        myArrayList.add("Sasha");
        myArrayList.add("Ira");
        myArrayList.add("Polina");
        myArrayList.add("Serg");
        myArrayList.add("Kira");
        myArrayList.add("Fima");
        myArrayList.add("Alla");
        myArrayList.add("Sonya");
        myArrayList.add("Sofi");
        myArrayList.add("Antoha");
        myArrayList.print();

        System.out.print("Size after add: ");
        System.out.println(myArrayList.size());
        System.out.println("\n" + "Remove MyArrayList: ");

        myArrayList.remove(2);
        myArrayList.print();
        System.out.print("Size after remove: ");
        System.out.println(myArrayList.size());

        System.out.println("\n" + "Getting element by index: ");
        System.out.println(myArrayList.get(5));

        System.out.println("\n" + "Clear MyArrayList: ");
        myArrayList.clear();
        System.out.print("Size after clear: ");
        System.out.println(myArrayList.size());

     System.out.print("\n" + "MyLinkedList: ");
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.add(6);
        myLinkedList.print();

     System.out.print("Size after add: " + myLinkedList.size());
     System.out.println("\n" + "Remove MyLinkedList: ");
     myLinkedList.remove(2);
     System.out.print("Size after remove: ");
     System.out.print(myLinkedList.size());
     System.out.print("\n" + "Getting element by index: ");
     System.out.print(myLinkedList.get(2));   // 4
     myLinkedList.clear();
     System.out.print("Size after clear: " + myLinkedList.size());

     System.out.print("\n" + "MyQueue: ");
     MyLinkedList<Integer> queue = new MyQueue<>();
     queue.add(1);
     queue.add(2);
     queue.add(3);
     queue.add(4);
     queue.add(5);
     queue.add(6);
     queue.add(7);
     queue.print();
     System.out.print("Size after add: " + queue.size());
     queue.remove(5);
     System.out.println("\n" + "Size after remove: " + queue.size());
     System.out.println("Peek: " + ((MyQueue) queue).peek());    //result - 1
     ((MyQueue) queue).poll();
     System.out.print("Size after pool: " + queue.size());
     queue.clear();
     System.out.println("\n" + "Size after clear: " + queue.size());

     System.out.print("\n" + "MyStack: ");
     MyLinkedList<Integer> stack = new MyStack<>();
     stack.add(11);
     stack.add(12);
     stack.add(13);
     stack.add(14);
     stack.add(15);
     stack.add(16);
     stack.add(17);
     stack.add(18);
     stack.add(19);

     stack.print();
     System.out.print("Size after add: " + stack.size());     //  9
     stack.remove(5);
     System.out.println("\n" + "Size after remove: " + stack.size());   // 8
     System.out.println("Peek: " + ((MyStack) stack).peek());    // 19
     ((MyStack) stack).pop();
     System.out.print("Size after pop: " + stack.size());   //  7
     stack.clear();
     System.out.println("\n" + "Size after clear: " + stack.size());  // 0

     System.out.print("\n" + "MyHashMap: ");
     MyHashMap<String, Integer> map = new MyHashMap<>();
     map.put("Ukraine", 1000);
     map.put("USA", 500);
     map.put("France", 250);
     map.put("Italy", 100);
     map.print();
     System.out.print("Size after add: " + map.size());
     System.out.println("\n" + "Element with key (Ukraine)" + " has value " + map.get("Ukraine"));

     System.out.println("Remove element (France) from MyHashMap: ");
     map.remove("France");
     map.print();
     System.out.println("Clear MyHashMap: ");
     map.clear();
     System.out.println("Size after clear: " + map.size());


    }
}
