
public class Sorting {
    static void selectionsort(int a[] )
    {
        for(int i=0;i<=a.length-2;i++)
        {
            int min = i;
            for(int j=i;j<=a.length-1;j++)
            {
                if(a[j]<a[min])
                {
                    min =j;
                }
            }
            int temp = a[min];
            a[min]= a[i];
            a[i] = temp;

        }

    }
    static void bubblesort(int a[],int n)
    {
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<=i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp= a[j];
                    a[j] = a[j+1];
                    a[j+1]= temp;
                }
            }
        }
    }
    static void insertion(int a[] , int n)
    {
        for(int i=0;i<n;i++)
        {
            int j=i;
            while(j>0 && a[j-1]>a[j])
            {
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {2,1,4,3,8,6,7};
        int n=a.length;
        insertion(a, n);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" , ");
            
        }
    }
}
