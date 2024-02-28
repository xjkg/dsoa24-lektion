public class Hashy {
    private Person[] hashTable;
    private int size;
    public int totalCols;
    public Hashy(int dataSize) {
        size = dataSize*10;
        hashTable = new Person[size];
    }
    public int hash(String str){
       int ret = 0;
        for (int i = 0; i < str.length() ; i++) {
            ret += ((int) str.charAt(i)*9.8);
        }
        return ret % size;
        //return ret ;
    }
    public Person search(String name){
        int idx = hash(name);
        int ops = 1;
        while (!hashTable[idx].getName().equals(name)){
            idx++;
            idx %= size; //om de int finns en ledig tom plats, gå till början
            ops++;
            if (ops > size) return null;
        }
        System.out.printf("Hashtable search %s ops: %d\n", name, ops);
        return hashTable[idx];
    }
    public void add(Person person){
        int idx = hash(person.getName());
        int cols = 0;
        while (hashTable[idx] != null) {
            idx++; //öka index, kolla om nästa är ledig
            cols++;
        }
        hashTable[idx] = person;
        totalCols += cols;
        /*
        System.out.printf("Add %s at index %d %s\n",
                person.getName(),
                idx,
                (cols > 0) ? cols + " COLLISIONS" : "");*/
    }
}
