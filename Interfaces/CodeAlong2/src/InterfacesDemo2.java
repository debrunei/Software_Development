import java.util.Arrays;
import java.util.Random;

public class InterfacesDemo2 {
    public static void main(String[] args) {
        int[] data = randomArray(12, 0, 99);
        SortContext ctx = new SortContext(); // start with Bubble
        System.out.println("Original: " + Arrays.toString(data));


    }

    private static int[] randomArray(int n, int lo, int hi) {
        Random r = new Random();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = r.nextInt(hi - lo + 1) + lo;
        return a;
    }
}

