public class Person {
    String name;
    //Person next = null;
    int rank;
    public Person(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }
/*
    public Person(String name, Person next) {
        this.name = name;
        this.next = next;
    }
*/
    public String getName() {
        return name;
    }

}
