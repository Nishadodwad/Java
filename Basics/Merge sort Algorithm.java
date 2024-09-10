import java.io.*;
import java.util.*;

public class Solution {

    public static int[] MergeTwoSortedArray(int fh[],int sh[])
    {
        int i=0,j=0,k=0;
        int n1 = fh.length;
        int n2 = sh.length;
        int ans[] = new int [n1+n2];
        while(i<n1 && j<n2)
        {
            if(fh[i]>sh[j])
            {
                ans[k]=sh[j];
                j++;
            }
            else
            {
                ans[k]=fh[i];
                i++;
            }
            k++;
        }
        while(i<n1)
        {
            ans[k]=fh[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            ans[k]=sh[j];
            j++;
            k++;
        }
        return ans;
    }
    public static int[] MergeSort(int a[],int n,int low, int high)
    {
        if(low==high)
        {
            int base[] = new int[1];
            base[0]=a[high];
            return base;
        }
        int mid=(low+high)/2;
        
        int fh[]=MergeSort(a,n,low,mid);
        int sh[]=MergeSort(a,n,mid+1,high);
        
        return MergeTwoSortedArray(fh,sh);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
        }
       int ans[] = MergeSort(a,n,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(ans[i]+" ");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
