public class MoveZero {
    static int[] Zero(int[] arr, int n)
    {
    int j=-1;
    for(int i=0;i<n;i++)
    {                               /*int j = 0; // position for next non-zero element

        // Move all non-zero elements forward
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Fill remaining positions with zero
        while (j < nums.length) {
            nums[j] = 0;
            j++; */
        if(arr[i]==0)
        {
            j=i;
            break;
        }
    }
     if (j == -1) return arr;
    for(int i=j+1;i<n;i++)
    {
        if(arr[i]!=0)
        {
            swap(arr,i,j);
            j++;
        }

    }
    return arr;
    }
    static void swap(int[]arr,int i,int j)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,0,0,3,0};
        int n= arr.length;
        int a[] = Zero(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(","+a[i]);
            
        }
    }

}
