import java.io.*;
import java.util.*;

public class Solution {

    public static int sortbypivot(int a[],int low,int high,int pivot)
    {
        int i=low,j=low;
        while(i<=high)
        {
            if(a[i]<=pivot)
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j++;
            }
            else
            {
                i++;
            }
        }
        return j-1;
    }
    public static void quickSort(int a[], int low, int high)
    {
        if(low>high)
            return;
        
        int pivot = a[high];
        int pidx = sortbypivot(a,low,high,pivot);
        
        quickSort(a,low,pidx-1);
        quickSort(a,pidx+1,high);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
        }
        quickSort(a,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
