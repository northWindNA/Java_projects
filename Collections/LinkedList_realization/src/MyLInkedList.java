import java.util.Arrays;

public class MyLInkedList {
    private Node head;
    private int size;

    public void add (int value) {
        //first addition to list
        if (head == null) {
            this.head = new Node(value);
        } else {
            Node temp = head;
            //[1]->[2]->[3] etc, moving to the end of the list
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            //now ...[3] <- head is here
            temp.setNext(new Node(value));
            //list is [1]->[2]->[3]->[4] <- new element in the end
        }
        size++;
    }

    public int get(int index) {
        int currentIndex = 0;
        Node temp = head;

        while (temp != null) {
            if (currentIndex == index) {
                return temp.getValue();
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
        //[1]->[2]->([3])->[4]
        throw new IllegalArgumentException();
    }

    public void remove(int index) {
        int currentIndex = 0;
        Node temp = head;

        //[1]->[2]->[3]->[4]
        while (temp != null) {
            if (index == 0) {
                
            }
            if ((currentIndex + 1) == index) {
                //[1]->[2]->[3]->[4]
                temp.setNext(temp.getNext().getNext());
                //[1]->[2]->->[4]
                //[1]->[2]->[3] node was deleted
                size--;
                return;
            } else {
                temp = temp.getNext();
                currentIndex++;
            }
        }
    }

    @Override
    public String toString() {
        int[] result = new int[size];
        int idx = 0;
        Node temp = head;

        while (temp != null) {
            result[idx] = temp.getValue();
            temp = temp.getNext();
            idx++;
        }
        //[1]->[2]->[3]->[4] => [[1][2][3][4]]
        return Arrays.toString(result);
    }

    public static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
