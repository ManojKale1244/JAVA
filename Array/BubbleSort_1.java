public class BubbleSort_1 {
    public static void BubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        System.out.print("The sorted array is :");

    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        BubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
