public class gcdString
{
    static String gcdOfString(String s1,String s2)
    {
        if(!(s1+s2).equals(s2+s1))
            return "";

        int gcdLength = gcd(s1.length(),s2.length());

        return s1.substring(0, gcdLength);
    }

    private static int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }


        return a;
    }

    public static void main(String[] args) {
        String s1="ABCABC";
        String s2= "ABC";

        System.out.println(gcdOfString(s1, s2));
    }
}