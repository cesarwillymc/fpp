package prog2;

public class MyStringLinkedList {
    Node header;

    MyStringLinkedList() {
        header = new Node(null);
    }

    //adds to the front of the list
    public void addFirst(String item) {
        Node n = new Node(item);
        //place new node after header and
        //establish links from new node to
        //surrounding nodes
        n.next = header.next;
        n.previous = header;

        //establish links from surrounding
        //nodes to the new node
        if (header.next != null) {
            header.next.previous = n;
        }
        header.next = n;
    }

    //adds to the end of the list
    public void addLast(String item) {
        Node n = new Node(item);
        //find last node
        Node last = header;
        while (last.next != null) {
            last = last.next;
        }
        //now last.next == null
        last.next = n;
        n.previous = last;
    }

    //removes node in last position
    public void removeLast() {
        //if list is empty, return
        if (header.next == null) return;

        Node current = header;
        //traverse the list until current.next is
        //null - then remove current
        while (current.next != null) {
            current = current.next;
        }
        //now current.next == null, so remove current
        Node previous = current.previous;
        //previous is not null since current is not header
        previous.next = null;
        current.previous = null;
    }

    boolean remove(String data) {
        if (data == null) return false;
        if (header.next != null && header.next.value.equals(data)) {
            header = header.next;
            return true;
        }
        Node previous = header;
        Node next = header.next;
        while (next != null) {
            if (data.equals(next.value)) {
                previous.next = next.next;
                return true;
            }
            previous = next;
            next = next.next;
        }
        return false;
    }

    int size() {
        if (header.next == null) return 0;
        Node temp = header.next;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    void insert(String data, int pos) {
        int size = size();
        if (pos < 0 || pos > size) {
            throw new IllegalArgumentException(
                    "Illegal position for new node");
        }
        if (pos == size) addLast(data); //same as add(s);
        else if (pos == 0) addFirst(data);
        else {
            Node n = new Node(data);
            n.value = data;
            if (header.next == null) header.next = n;
            else {
                Node temp = header.next;
                int count = 1;
                while (count < pos) {
                    temp = temp.next;
                    count++;
                }
                //insert n between temp and temp.node
                Node last = temp.next;
                temp.next = n;
                n.next = last;  //placing n into position pos
            }
        }
    }

    //determines whether the input string is in the list
    public boolean search(String s) {
        Node next = header.next;
        while (next != null && !next.value.equals(s)) {
            next = next.next;
        }
        //either next == null or next.value is s
        if (next == null) return false;
        else {//next.value.equals(s)
            return true;
        }
    }

    public String toString() {
        var sb = new StringBuffer();
        Node next = header.next;
        while (next != null) {
            sb.append(next.toString() + ", ");
            next = next.next;
        }
        var result = sb.toString().trim();
        if (result.length() == 0) return "<empty list>";
        if (result.charAt(result.length() - 1) == ',') {
            return result.substring(0, result.length() - 1);
        }
        return result;
    }

    /******* sorting methods ********/
    public void minSort() {
        if (header.next == null) return;
        Node next = header.next;
        while (next != null) {
            Node nextMinNode = minNode(next);
            System.out.println(nextMinNode.value);
            swap(next, nextMinNode);
            next = next.next;
        }
    }

    void swap(Node n1, Node n2) {

        String temp = n1.value;
        n1.value = n2.value;
        n2.value = temp;

    }

    //find minimum of arr between the indices bottom and top
    public Node minNode(Node n) {

        Node minNode = n;
        Node nextNode = n.next;
        while (nextNode != null) {

            String nextNodeValue = nextNode.value;
            if (nextNodeValue.length() < minNode.value.length()) {
                minNode = nextNode;
            } else if (nextNodeValue.length() == minNode.value.length()) {
                int result = nextNodeValue.compareTo(minNode.value);
                if (result < 0) {
                    minNode = nextNode;

                }
            }
			nextNode = nextNode.next;
        }

        //return location of min, not the min itself
        return minNode;
    }

    class Node {
        String value;
        Node next;
        Node previous;

        Node(String value) {
            this.value = value;
        }

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args) {
        var list = new MyStringLinkedList();
        list.addLast("Rich");
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        list.addFirst("Bob");
        list.addFirst("Harry");
        list.addFirst("Steve");
		list.addFirst("Steva");
		list.addFirst("Stevi");
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        System.out.println(list.search("Harry"));
        System.out.println(list.search("Bob"));
        list.addLast("Tom");
        System.out.println(list);

        list.insert("Steve2", 0);
        System.out.println(list);
        list.minSort();
        System.out.println(list);
    }
}
