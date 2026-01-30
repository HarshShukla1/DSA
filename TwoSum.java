import java.util.Arrays;

public class TwoSum {
    static boolean TSum(int arr[] , int target)
    {
        Arrays.sort(arr);
        int left = 0,right=arr.length-1;
        while(left<right)
        {
            int sum = arr[left]+arr[right];
            if(sum==target) return true;
            else if(sum<target)
            {
                left++;
            }else{
                right--;
            }
        }
        return false;

        /*HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            // Calculate the complement that added to
            // arr[i], equals the target
            int complement = target - arr[i];

            // Check if the complement exists in the set
            if (set.contains(complement)) {
                return true;
            }

            // Add the current element to the set
            set.add(arr[i]);
        }
        // If no pair is found
        return false; */
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,3,5,5,1};
        int target = 5;
        System.out.println(TSum(arr, target));
    }
}
