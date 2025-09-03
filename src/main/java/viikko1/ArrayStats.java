package viikko1;

public class ArrayStats {
    public static double average(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0.0;
        } else {
            double sum = 0;
            for (int num : arr) {
                sum += num;
            }

            return sum / arr.length;
        }
    }
    public static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            return Integer.MIN_VALUE;
        } else {
            int largest = arr[0];
            for (int num : arr) {
                if (num > largest) {
                    largest = num;
                }
            }
            return largest;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        double avg = average(numbers);
        int largest = max(numbers);
        System.out.println(avg);
        System.out.println(largest);
    }
}
