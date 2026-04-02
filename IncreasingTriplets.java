public class IncreasingTriplets {
    static boolean Triplets(int[] nums)
    {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int num:nums){
            if (num<=first) {
                first=num;
            }else if (num<=second) {
                second = num;
                
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        System.out.println(Triplets(nums));
    }
}
