class Stock
{
    static int profit(int arr[])
    {
        int res = 0;
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);

             res = Math.max(res, arr[i]-min);
            
        }



        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,2,3,7,4};
        int x=profit(arr);
        System.out.println(x);
    }
}