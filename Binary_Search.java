import java.util.Scanner;
class Binary_Search
{
    int binarySearch(int arr[], int l, int m, int x)
    {
        if(m >= 1)
        {
            int mid = l + (m - 1) / 2;
            if(arr[mid] == x)
                return mid;

            if(arr[mid] > x)
                return binarySearch(arr, l, mid-1, x);

            if(arr[mid] < x)
                return binarySearch(arr, mid+1, m, x);
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        Binary_Search ob = new Binary_Search();
        int x = sc.nextInt();
        int result = ob.binarySearch(arr, 0, n-1, x);
        if(result == -1)
            System.out.println("Element Not Present");
                else
                    System.out.println("Element is Present and found at Index" + result);
    }
}

