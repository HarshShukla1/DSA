public class CountDig {
    static int Count(int n)
    {
        int c=0;
        while(n>0)
        {
            c++;
            n/=10;
        }
        return c;
    }
    static int revNum(int n)
    {
        int rev=0;
        while(n>0)
        {
            rev = rev*10+(n%10);
            n/=10;
            
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(revNum(345));
    }
}
