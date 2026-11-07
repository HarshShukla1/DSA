public class ElementMajority
{
    static int Majority(int arr[])
    {
        int candidate = -1;
        int count = 0;
        int n = arr.length;
        for(int num:arr)  //identify candidate
        {
            if(count==0)
            {
                candidate = num;
                count = 1;
            }
            else if(candidate==num)
            {
                count++;
            }
            else{
                count--;
            }
        }

        count=0;
        for(int num: arr)   //Validate candidate
        {
            if(num==candidate){
                count++;
            }
        }


        return count > (n/2)? candidate: -1;   // give candidate
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,2,3,4,1};
        System.out.println(Majority(arr));
    }
}