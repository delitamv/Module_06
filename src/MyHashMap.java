import java.util.Objects;

public class MyHashMap<K, V> {
    static final int MAXIMUM_CAPACITY = 16;
    private NodeMap<K, V>[] table;
    private int size;

    public MyHashMap() {
        table = new NodeMap[MAXIMUM_CAPACITY];
        size = 0;
    }

    private int hash(int h) {
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }

    private int indexFor(int h, int length) {
        return h & (length - 1);
    }

    private void addEntry(int hash, K key, V value, int index) {
        boolean found = false;
        NodeMap<K, V> e = table[index];

        while (e != null){
            if (replace(hash, key, value, e)) {
                found = true;
                break;
            }
            e = e.getNext();
        }

        if (!found) {
            e = table[index];
            table[index] = new NodeMap<K, V>(hash, key, value, e);
            size++;
        }
    }

    private boolean replace(int hash, K key, V value, NodeMap<K,V> e){
        if (e.getHash() == hash && (e.getKey() == key || key.equals(e.getKey()))) {
            e.setValue(value);
            return true;
        }
        return false;
    }

    private V getValue(int hash, K key, NodeMap<K,V> e){
        if (e != null && e.getHash() == hash && (e.getKey() == key || key.equals(e.getKey()))) {
            return e.getValue();
        }
        return null;
    }

    public void print() {
        for (int i = 0; i < table.length; i++){
            NodeMap<K,V> iterator = table[i];
            if (iterator == null) continue;
            do {
                System.out.print("" + iterator.getKey() + ":" + iterator.getValue() + " ");
                iterator = iterator.getNext();
            } while (iterator != null);
        }
        System.out.println();
    }

    // add <key,value>
    public void put(K key, V value){
        int index;
        int hash;
        hash = hash(Objects.hashCode(key));
        index = indexFor(hash,MAXIMUM_CAPACITY);
        addEntry(hash,key,value,index);
    }
    // remove element by key
    public void remove(K key){
        int index;
        int hash;
        hash = hash(Objects.hashCode(key));
        index = indexFor(hash,MAXIMUM_CAPACITY);
        NodeMap<K,V> nodeMap = getNodeMap(key);
        NodeMap<K,V> nodeMapPrevious = getPreviousNodeMap(key);
        if (nodeMapPrevious != null) nodeMapPrevious.setNext(nodeMap.getNext());
        if (table[index] == nodeMap){
            table[index] = null;
        }
        nodeMap = null;
        size--;
    }

    private NodeMap<K,V> getPreviousNodeMap(K key){
        NodeMap<K,V> nodeMapPrevious = null;
        int index;
        int hash;
        hash = hash(Objects.hashCode(key));
        index = indexFor(hash,MAXIMUM_CAPACITY);
        NodeMap<K, V> e = table[index];
        while (e != null){
            if (e.getHash() == hash && (e.getKey() == key || key.equals(e.getKey()))) {
                break;
            }
            nodeMapPrevious = e;
            e = e.getNext();
        }
        return nodeMapPrevious;
    }

    private NodeMap<K,V> getNodeMap(K key){
        NodeMap<K,V> nodeMap = null;
        int index;
        int hash;
        hash = hash(Objects.hashCode(key));
        index = indexFor(hash,MAXIMUM_CAPACITY);
        NodeMap<K, V> e = table[index];
        while (e != null){
            nodeMap = e;
            if (e.getHash() == hash && (e.getKey() == key || key.equals(e.getKey()))) {
                break;
            }
            e = e.getNext();
        }
        return nodeMap;
    }

    // get size
    public int size(){
        return size;
    }

    public void clear() {
        NodeMap<K,V>[] tab;
        if ((tab = table) != null && size > 0) {
            size = 0;
            for (int i = 0; i < tab.length; ++i)
                tab[i] = null;
        }
    }

    public V get(K key){
        V value = null;
        int index;
        int hash;
        hash = hash(Objects.hashCode(key));
        index = indexFor(hash,MAXIMUM_CAPACITY);
        NodeMap<K, V> e = table[index];
        while (e != null){
            value = getValue(hash,key,e);
            if (value != null) break;
            e = e.getNext();
        }
        return value;
    }
}

