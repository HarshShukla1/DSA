public class Secondlargest {
    static int secondlargest(int arr[])
    {
        int secondlargest= Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest){

                secondlargest=largest;
                largest = arr[i];
            }else if(arr[i]<largest && arr[i]>secondlargest)
            {
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,5,4,55};
        System.out.println(secondlargest(arr));
    }
}
