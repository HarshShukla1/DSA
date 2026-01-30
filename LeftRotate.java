public class LeftRotate {

    static void reverse(int arr[],int d , int n)
    {
        int left = d;
        int right = n-1;
        while(left<right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            right--;
            left++;

        }
    }
    static void lRotate(int arr[] , int d , int n)
    {
        /* 
        d=d%n;
        int temp[] = new int[d];
        for(int i=0;i<d;i++)
        {
             temp[i] = arr[i];
        }
        for(int i=d;i<n;i++)
        {
            arr[i-d] = arr[i];
        }
        for(int i=n-d;i<n;i++)
        {
            arr[i] = temp[i-(n-d)];
        }*/
       reverse(arr,0,d);
       reverse(arr, d+1, n);
       reverse(arr, 0, n);

        
    }
  
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,6,7,7,10};
        int n = arr.length;
        int d=2;
        lRotate(arr, d, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" , ");
            
        }
    }
}
 