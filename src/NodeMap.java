public class NodeMap<K, V>  {
    private int hash;
    private K key;
    private V value;
    private NodeMap<K, V> next;

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public NodeMap<K, V> getNext() {
        return next;
    }

    public void setNext(NodeMap<K, V> next) {
        this.next = next;
    }

    public NodeMap(int hash, K key, V value, NodeMap<K, V> next) {
        this.hash = hash;
        this.key = key;
        this.value = value;
        this.next = next;
    }
}
