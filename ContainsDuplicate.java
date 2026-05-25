import java.util.HashSet;

public class ContainsDuplicate {
    static boolean giveDuplicate(int arr[])
    {
        HashSet<Integer> hs = new HashSet<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(hs.contains(arr[i]))
                return true;
            else
                hs.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,5};
        System.out.println(giveDuplicate(arr));
    }
}
