class ASCI
{
    public static void give(String s)
    {
        int arr[] = new int[128];
        for(char ch: s.toCharArray())
        {
            arr[ch]++;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        String s = "harsh";
        give(s);
    }
}