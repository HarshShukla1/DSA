public class AppearTwice {
    static int twice(int arr[])
    {
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            ans = ans^arr[i];
        }



        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,4,4,5,5,7};
        System.out.println(twice(arr));
    }
}
