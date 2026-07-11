//LC-3754

class ConcationationNonZero
{
    public static long numberFormation(int num)
    {
        int sum = 0;
        int dig = 0;
        for(int i=num;i!=0;i/=10)
        {
            if (i%10 !=0) {
                sum+=i%10;
                
            }
        }
        return num * sum;
    }
    public static void main(String[] args) {
        int num = 120003;
        System.out.println(numberFormation(num));
    }
}