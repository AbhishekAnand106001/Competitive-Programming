//Scanner class is used to take input from user
//arr[] - Array is decleared
//l - Starting point of array
//m - Ending Point of Array
//x - Number to be Searched
//mid - Middle Point in Array

import java.util.Scanner;
class Binary_Search
{
    int binarySearch(int arr[], int l, int m, int x)
    {
        if(m >= 1)
        {
            int mid = l + (m-1) / 2;
            if(arr[mid] == x)
                return mid;

            if(arr[mid] > x)
                return binarySearch(arr, l, mid-1, x); // if searched number is smaller than the middle point, so ending point is taken as (mid-1)

            if(arr[mid] < x)
                return binarySearch(arr, mid+1, m, x); // if searched number is greater that the middle point, so starting point is taken as (mid+1)
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
        Binary_Search ob = new Binary_Search(); // Object is created
        int x = sc.nextInt();
        int result = ob.binarySearch(arr, 0, n-1, x);
        if(result == -1)
            System.out.println("Element Not Present");
                else
                    System.out.println("Element is Present and found at Index" + result);
    }
}

