import java.util.Arrays;

public class count {
     public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] counting = new int[n + 1];

        // Count frequency
        for (int num : nums) {
            counting[num]++;
        }


    return counting;
}
public static void main(String[] args) {
    int [] nums={1,2,3,3,4,5,5};
    count ob=new count();
    int res[]=ob.findErrorNums(nums);
    System.out.println(Arrays.toString(res));

}}
