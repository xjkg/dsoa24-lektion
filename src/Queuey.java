public class Queuey {
    Node front, rear;
    private static class Node{
        String value;
        Node next;
        Node(String value) {
            this.value = value;
        }
    }
    public void enqueue(String value){
        Node n = new Node(value);
        if (front == null) { //kön är tom
            front = n;
            rear = n;
        } else {
            rear.next = n;
            rear = n;
        }
        printQueue();
    }
    public void printQueue(){
            System.out.print("Queue: ");
            Node n = front;
            while (n != null) {
                System.out.print(n.value + " ");
                n = n.next;
            }
            System.out.println("");
    }

    public String dequeue(){
        String ret;
        ret = front.value;
        front = front.next;
        printQueue();
        return ret;
    }

}

