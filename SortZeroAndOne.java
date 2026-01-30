public class SortZeroAndOne {   //Dutch national flag algo
    /*
    low , mid ,high
    0..low-1 -> 0
    low...mid-1 = 1
    high+1 ...n-1 = 2
    need to sort and focus on array part mid to high

    a[mid] ==0 -> swap(a[low], a[mid])->low++ , mid++
    a[mid] ==1 -> swap mid++
    a[mid] ==2 -> swap(a[mid], a[high]) high--
    */

    static int[] ZeroAndOne(int arr[] , int n)
    {
        int low=0,mid=0,high=n-1;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                swap(arr,low,mid);
                low++;
                mid++;

            }else if(arr[mid]==1)
            {
                mid++;

            }else{
                swap(arr,mid,high);
                high--;
                
            }
        }
        return arr;
    }
    static void swap(int arr[] , int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,1,0,0,2,1};
        int n=arr.length;
        ZeroAndOne(arr, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
   

}
