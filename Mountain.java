public class Mountain {
    public static boolean validMountain(int arr[])
    {

        if(arr.length<3)
        {
            return false;
        }
        int i=0;

        for(i=1;i<arr.length;i++)
        {
            if(arr[i]<=arr[i-1])
                break;
        }

        for(;i<arr.length;i++)
        {
            if(arr[i]>=arr[i-1])
                break;
        }

        return i==arr.length;



    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,3,2,1};
        System.out.println(validMountain(arr));
    }
}
