public class SubarrayOne {
    static int subArray(int[] nums)
    {
        int left=0,zeroCount=0,maxLen=0;
        for(int right = 0;right<nums.length;right++)
        {
            if(nums[right]==0)
            {
                zeroCount++;
            }

            while(zeroCount>1)
            {
                if(nums[left]==0){
                    left++;
                }
                zeroCount--;
            }
            maxLen = Math.max(maxLen, right-left);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int nums[] = {1,0,0,0,1,1,0};
        System.out.println(subArray(nums));
    }
}
