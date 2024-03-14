import java.util.Arrays;

public class Sum_two_three {
    public static void main(String[] args) {
        int[] values = {20, 63, 72, 39, 47, 82, 11};
        Arrays.sort(values);
        int secondLargest = values[values.length - 2];
        int thirdLargest = values[values.length - 3];
        int sum = secondLargest + thirdLargest;
        System.out.println("The sum is" + sum);
    }
}