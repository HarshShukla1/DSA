import java.util.Map;
import java.util.HashMap;

public class CountFreq {
    public static Map<Integer, Integer> freq(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int nums : arr) {
            freq.put(nums, freq.getOrDefault(nums, 0) + 1);
        }

        return freq;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,4,4,1,5,6};
        Map<Integer,Integer> res = freq(null);
        for (Map.Entry<Integer, Integer> entry : res.entrySet())
        {
             System.out.println(entry.getKey() + " -> " + entry.getValue());

        }
        
    }

}
