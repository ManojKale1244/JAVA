public class MaxSubarray {
    public static void Subarray(int arr[]) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    sum = sum + arr[k];

                }
                System.out.println(sum);
                if (max < sum) {
                    max = sum;
                }
            }

        }
        System.out.println("max sum :" + max);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        Subarray(arr);
    }
}
