public class AverageSubArray {
    static double Avg(int[] nums, int k)
    {
        int n = nums.length;
        int windowSum=0;
        for(int i=0;i<k;i++)
        {
            windowSum+=nums[i];
        }
        int maxSum=0;
        for(int i=k;i<n;i++)
        {
            windowSum+=nums[i];
            windowSum-=nums[i-k];
            maxSum = Math.max(maxSum,windowSum );
        }
        return (double)maxSum/k;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,5,6,3};
        int k=4;
        System.out.println(Avg(nums, k));
    }
}
