public class Linky {
    Node first;
    Node last;
    private static class Node{
        Person person;
        Node next;
        Node(Person person, Node next) {
            this.person = person;
            this.next = next;
        }
    }
    public void add(Person person){
        Node n = new Node(person, null);
        if (first == null) first = n; //Listan är tom
        if (last != null) last.next = n; //Gamla last.next blir nya n
        last = n; //Nya noden blir nya last
    }
    public int size() {
        int count = 0;
        Node n = first;
        while (n != null) {

            n = n.next;
            count++;
        }
        return count;
    }
    public void printLinky(){
        System.out.print("Linky: ");
        Node n = first;
        while (n != null) {
            System.out.print(n.person.getName()+ " ");
            n = n.next;
        }
        System.out.println("");
    }
}
