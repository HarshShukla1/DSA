public class Largest {
    static int Max(int arr[])
    {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        return max;
    }
    static int SecondLargest(int arr[])
    {   
        int max=arr[0];
        int sec = Integer.MIN_VALUE;
         for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }  
        } 
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>sec && arr[i]!=max)
            {
                sec=arr[i];
            }
            
        }
        return sec;
    }
    static boolean isSorted(int arr[])
    {
        Boolean isSorted = false;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                isSorted = true;

            }
            else{
                isSorted = false;

            }
            
        }
        return isSorted;
    }
    static void rotate(int arr[])
    {
        int temp=arr[0];
        int n=arr.length;
        for (int i = 1; i < n; i++) {
            arr[i-1]=arr[i];
            
        }
        arr[n-1] = temp;
       for (int i = 0; i < arr.length; i++) {
        System.out.print(","+arr[i]);
        
       }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        rotate(arr);
    }
}
