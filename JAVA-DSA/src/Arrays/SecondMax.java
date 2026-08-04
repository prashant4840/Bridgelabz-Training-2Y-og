package Arrays;

public class SecondMax {

    static void secondHighest(int[] arr) {

        int max = arr[0];
        int smax = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }
        System.out.println("Second Max " + smax);
    }

    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 80, 20};
        secondHighest(arr);
    }
}
