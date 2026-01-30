public class Pattern {
    static void pat1()
    {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
     static void pat2()
    {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat3()
    {
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<5-i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat4()
    {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4-i-1;j++)
            {
                System.out.print(" ");
            }
             for(int j=0;j<i*2+1;j++)
            {
                System.out.print("*");
            }
             for(int j=0;j<4-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
            
        }
    }

     static void pat5(int n)
    {
        for(int i=0;i<=2*n-1;i++)
        {
            int star = i;
            if(i>n) star = 2*n-i;
            
            for(int j=0;j<star;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
   public static void main(String args[])
    {
        pat5(5);

    }
    
}
