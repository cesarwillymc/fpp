package prog9_4_startup;

public class Main {

    public static void main(String[] args) {

        NodeQueue theQueue = new NodeQueue(); // queue holds 5 items
        try {
            theQueue.dequeue();
        } catch (Exception e) {
            if (e.getClass() != QueueException.class) {
                System.out.println("The wrong kind of exception was just thrown");
            } else {
                System.out.println(e.getMessage());
            }
        }
        theQueue.enqueue("1");

        System.out.println("head "+theQueue);
        System.out.println("tail "+theQueue.toStringTail());
        theQueue.enqueue("2");
        theQueue.enqueue("3");
        theQueue.enqueue("4");
        System.out.println("head "+theQueue);
        System.out.println("tail "+theQueue.toStringTail());
        theQueue.enqueue("5");
        System.out.println(theQueue);

        try {
            for (int i = 0; i < 5; ++i) {
                System.out.println("Removed " + theQueue.dequeue());
            }
        } catch (QueueException e) {
            System.out.println("Unexpected QueueException while dequeueing");
        }
        System.out.println("Is the queue empty? " + theQueue.isEmpty());


    }

}
