import java.util.HashSet;

public class TwoSum {
    static boolean TSum(int arr[] , int target)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            int complement = target-arr[i];

            if(set.contains(complement))
            {
                return true;
            }
            else{
                set.add(arr[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,3,5,5,1};
        int target = 5;
        System.out.println(TSum(arr, target));
    }
}
