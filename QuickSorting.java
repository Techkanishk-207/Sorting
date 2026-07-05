import java.util.*;
public class QuickSorting {
    static int partition(int[] arr,int low,int high){
       int pivot = arr[low];
       int i = low;
       int j = high;
       while(i<j){
        while(arr[i] <= pivot && i<=high-1){
            i++;
        }
        while(arr[j] > pivot && j>= low+1){
            j--;
        }
        if(i<j){
            int tem = arr[i];
            arr[i] = arr[j];
            arr[j] = tem;
        }
       }
       int temp = arr[low];
       arr[low] = arr[j];
       arr[j] = temp;
       return j;
    }   
    static void quicksort(int[] arr,int low,int high){
          if(low < high){
            int pindex = partition(arr,low,high);
            quicksort(arr,low,pindex-1);
            quicksort(arr,pindex+1, high);
          }
    }
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] arr = new int[n];
         for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
         }
         quicksort(arr,0,n-1);
         for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
         }
         sc.close();
    }
}
