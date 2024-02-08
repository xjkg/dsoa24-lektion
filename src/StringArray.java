import java.util.Arrays;

public class StringArray {
    // Vi antar att vi inte har tillgång till ArrayList

    String[] values;
    public StringArray(String[] values) {
        this.values = values;
    }
    public String toString() {
        return Arrays.toString(values);
    }
    public int size() {
        return values.length;
    }
    public void add (String value) {
        // Skapa ny array
        String[] newValues = new String[values.length+1];
        int i = 0;
        // kopiera över innehållet
        for (i = 0; i < values.length; i++) {
            newValues[i] = values[i];
        }
        // Lägg till värdet på slutet
        newValues[i] = value;
        values = newValues;
    }

    public void add(int index, String value) {
        add(null); // lägg till null på slutet av values
        // flytta varje värde ett steg framåt från slutet till index
        int i = 0;
        // kopiera över innehållet
        for (i = values.length-1; i > index; i--) {
            values[i] = values[i-1];
        }
        // Lägg till värdet på rätt plats
        values[index] = value;
    }

    public void reverse() {
        int start = 0;
        int end = values.length-1;
        while (start<end) {
            String temp = values[start];
            values[start] = values[end];
            values[end] = temp;
            start++;
            end--;
        }
    }
}
