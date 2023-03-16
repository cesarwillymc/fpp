package prog9_1_startup;

public class MyStringStack {
    private MyStringLinkedList list;
    public MyStringStack() {
        list = new MyStringLinkedList();
    }

    public String pop() {
        String last = peek();
        if(last!=null){
            list.remove(0);
        }
        return last;
    }
    public String peek() {
        return list.get(0);
    }

    public void push(String s) {
        list.add(s);
    }

    public static void main(String[] args) {
        MyStringStack stack = new MyStringStack();
        stack.push("Bob");
        stack.push("Harry");
        stack.push("Alice");
        System.out.println("Popping…"+stack.pop());
        System.out.println("Peeking…."+stack.peek());
        System.out.println("Popping…"+stack.pop());
    }
}
