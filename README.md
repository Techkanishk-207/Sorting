import java.util.*;
public class MergeSort {
    static void mergesort(int[] arr,int low,int mid,int high){
         int x = mid -low + 1;
         int y = high - mid;

         int [] left = new int[x];
         int [] right = new int[y];

         for(int i=0;i<x;i++){
            left[i] = arr[low + i];
         }
         for(int j=0;j<y;j++){
            right[j] = arr[mid + 1 + j];
         }
         int i=0,j=0;
         int k = low;
         while(i<x && j<y){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
         }
         while(i<x){
            arr[k] = left[i];
            i++;
            k++;
         }
         while(j<y){
            arr[k] = right[j];
            j++;
            k++;
         }
    }
    static void Sorting(int[] arr,int low,int high){
        if(low < high){
           int mid = (low+high)/2;
        Sorting(arr,low,mid);
        Sorting(arr,mid+1,high);
        mergesort(arr,low,mid,high);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Sorting(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

