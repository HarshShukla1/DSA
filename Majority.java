public class Majority {
    static int Majority_Element(int arr[])
    {
        int n=arr.length;
        int cnt=0;
        int ele=0;
        for(int i=0;i<n;i++)
        {
            if(cnt==0)
            {
                ele=arr[i];
                cnt=1;
            }else if(arr[i]==ele)
            {
                cnt++;
            }else
            {
                cnt--;
            }
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==ele) c++;

        }
        if(c>n/2)
            return ele;
        return -1;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,2,4,5};
        int x=Majority_Element(arr);
        System.out.println(x);
    }
    
}
