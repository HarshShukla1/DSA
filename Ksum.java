import java.util.Arrays;

public class Ksum {
    static int sum(int[] nums , int k)
    {
        int left = 0;
        int right=nums.length-1;
        int c=0;
        Arrays.sort(nums);
        while(left<right){
            int sum = nums[left]+nums[right];
            if(sum==k){
                c++;
                left++;
                right--;
            }else if(sum<k){
                left++;
            }
            else{
                right--;
            }
        }

        return c;
    }

    public static void main(String[] args) {
        int k=7;
        int num[] = {2,3,5,6,7,8,5,3};
        System.out.println(sum(num, k));
    }
    
}