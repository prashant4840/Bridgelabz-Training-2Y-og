package Arrays;

public class LowestNum {

    static void lowest(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Min " + min);
    }

    public static void main(String[] args) {

        int[] arr = {10, 50, 30, 80, 20};

        lowest(arr);
    }
}