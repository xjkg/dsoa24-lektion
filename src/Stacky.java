import java.util.Arrays;

public class Stacky {
    String[] data;
    int stackSize;
    int topOfStack = -1;

    public Stacky(int stackSize) {
        this.stackSize = stackSize;
        data = new String[stackSize];
    }
    public void push(String value){
        if (topOfStack+1 >= stackSize){
            System.out.println("StackOverflowError: Stacken är full");
            return;
            //throw new StackOverflowError("Stacken är full");
        }
        topOfStack++;
        data[topOfStack] = value;
    }
    public String pop(){
        String ret = data[topOfStack];
        topOfStack--;
        return ret;
    }

    public String toString(){
        String ret = "";
        for (int i = 0; i <= topOfStack; i++) {
            ret += data[i] + " ";
        }
        return ret;
    }
}
