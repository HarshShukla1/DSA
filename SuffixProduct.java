import java.util.Arrays;

public class SuffixProduct {
    static int[] Product(int[] arr)
    {
        int n=arr.length;
        int[] ans = new int[n];
        ans[0] = 1;
        for(int i=1;i<n;i++)
        {
            ans[i] = ans[i-1]*arr[i-1];
        }
        int suffix=1;
        for(int i=n-1;i>=0;i--)
        {
            ans[i] = ans[i]*suffix;
            suffix = suffix*arr[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6};
        SuffixProduct ob = new SuffixProduct();
        int[] result = ob.Product(arr);
        System.out.println(Arrays.toString(result));
    }
}
