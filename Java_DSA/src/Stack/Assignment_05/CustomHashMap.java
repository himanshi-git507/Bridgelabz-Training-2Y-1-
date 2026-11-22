package Stack.Assignment_05;

public class CustomHashMap {

    static class Node {
        int key;
        int value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    Node[] buckets;
    int size;

    CustomHashMap() {
        buckets = new Node[10];
    }

    int hash(int key) {
        return Math.abs(key % buckets.length);
    }

    void put(int key, int value) {
        int index = hash(key);
        Node current = buckets[index];

        while (current != null) {
            if (current.key == key) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;
    }

    int get(int key) {
        int index = hash(key);
        Node current = buckets[index];

        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }

        return -1;
    }

    void remove(int key) {
        int index = hash(key);
        Node current = buckets[index];
        Node prev = null;

        while (current != null) {
            if (current.key == key) {
                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return;
            }

            prev = current;
            current = current.next;
        }
    }

    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();

        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        map.put(12, 1200);

        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(12));

        map.remove(2);

        System.out.println(map.get(2));
    }
}
