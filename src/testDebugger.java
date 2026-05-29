import java.util.Arrays;

public class testDebugger {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,-1,-8};
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i + "\t");
        }
    }
}
