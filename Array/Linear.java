public class Linear {
    public static boolean Search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("The key is found in position :" + "" + i);
                return true;
            }
        }
        System.out.println("The Key is not found ");
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6, 7 };
        Search(arr, 7);

    }
}