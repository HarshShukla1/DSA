public class MaxSubarray {
    static int max(int arr[])
    {
        int res=arr[0];
        int maxEnding=0;
        for (int i = 0; i < arr.length; i++) {
            maxEnding = Math.max(maxEnding+arr[i], arr[i]);
            res = Math.max(maxEnding, res);
            
        }




        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,32,4};
        int x=max(arr);
        System.out.println(x);
    }
}
