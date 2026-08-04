package Arrays;

public class MaximumNum {
    static void highest(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max " + max);
    }

    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 80, 20};
        highest(arr);
    }
}