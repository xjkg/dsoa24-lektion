public class BigO {
    public BigO(){

    // int[] data = {1,2,3,4,5,6,7...}
        int[] data = new int[100];

    //O(n)
        System.out.printf("O(n): %d datapunkter", data.length);
        int ops = 0;
        for (int i = 0; i < data.length; i++) {
            ops++;
        }
        System.out.printf("\n%d operationer", ops);

    //O(n^2)

        System.out.printf("\nO(n^2): %d datapunkter", data.length);
        ops = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                ops++;
            }
        }
        System.out.printf("\n%d operationer", ops);

    //O(log n)
        System.out.printf("\nO(log n): %d datapunkter", data.length);
        ops = 0;
        int len = data.length;
        while (len > 0) {
            len = len/2;
            ops++;
        }
        System.out.printf("\n%d operationer", ops);








    }
}
