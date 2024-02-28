import java.util.Arrays;

public class Sorty {
    private String[] values;
    public Sorty(String[] values) {
        this.values = values.clone(); //clone() skapar en deep copy, inte mera kopia av referensen till arrayn

        System.out.println("String array sort: " + Arrays.toString(this.values));
    }
    public void bubbleSort() {
        int ops = 0;
        //Yttre loop
        for (int i = 0; i < values.length; i++) {
            //Inre loop
            for (int j = 1; j < values.length-i; j++) {
                //Swappar om första i paret är större
                if (values[j-1].compareTo(values[j])>0){
                    String temp = values[j-1];
                    values[j-1] = values[j];
                    values[j] = temp;
                }
                ops++;
            }
        }
        System.out.println("BubbleSorted: " + ops + " " + Arrays.toString(values));
    }

    public void insertionSort(){
        int ops = 0;
        //Yttre loop
        for (int i = 1; i < values.length; i++) {
            String currentValue = values[i];
            int j = i-1; //Jämför bakåt
            //inre loop
            while(j>=0 && values[j].compareTo(currentValue)>0){
                values[j+1] = values[j];
                j--;
                ops++;
            }
            values[j+1] = currentValue;
        }
        System.out.println("InsertionSorted: " + ops + " " + Arrays.toString(values));
    }

    public String[] getValues() {
        return values;
    }
}
