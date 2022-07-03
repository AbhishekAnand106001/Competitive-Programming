import java.util.Scanner;
class Linear_Search {
    public static void linearSearch(int arr[], int x) {
        int left = 0;
        int length = arr.length;
        int right = length - 1;
        int position = -1;
        for (left = 0; left <= right;) {
            if (arr[left] == x) {
                position = left;
                System.out.println("Element found at position at" + (position + 1) + "Position with" + (left + 1) + "Attempts");
                break;
            }
            if (arr[right] == x) {
                position = right;
                System.out.println("Element found at position at" + (position + 1) + "Position with" + (length - right) + "Attempt");
                break;
            }
            left++;
            right--;
        }
        if (position == -1)
            System.out.println("Element not found in array" + left + "Attempt");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        linearSearch(arr, x);
    }
}