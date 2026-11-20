public class ThreeSum {
    static boolean triplet(int arr[],int target)
    {
        int n = arr.length;
        for(int i=0;i<n-2;i++)
        {
            int l=i+1,r = n-1;
            int reqSum = target-arr[i];

            while(l<r)
            {
                if(arr[l]+arr[r]==reqSum)
                {
                    return true;
                }
                else if (arr[i]+arr[r]<reqSum) {
                    l++;
                }
                else{
                    r--;
                }
            }
            
        }
        return false;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,5,4};
        int target = 6;
        System.out.println(triplet(arr, target));
    }
}
