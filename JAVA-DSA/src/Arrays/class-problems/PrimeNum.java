package Arrays;

public class PrimeNum {
    static void primeNumber(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) count++;
            }

            if (count == 2) System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 15, 11, 20, 13, 8};
        System.out.print("Prime Numbers = ");
        primeNumber(arr);
    }
}