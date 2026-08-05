package Arrays;

public class SecondLowest {

    static void secondLowest(int[] arr) {

        int min = arr[0];
        int smin = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                smin = min;
                min = arr[i];
            } else if (arr[i] < smin && arr[i] != min) {
                smin = arr[i];
            }
        }
        System.out.println("Second Lowest = " + smin);
    }

    public static void main(String[] args) {
        int[] arr = {10, 50, 30, 80, 20};
        secondLowest(arr);
    }
}