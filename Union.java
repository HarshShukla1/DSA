import java.util.ArrayList;
import java.util.List;

public class Union {
     static List<Integer> UnionList(int a[] , int b[]){
        List<Integer> res = new ArrayList<>();
        int i=0,j=0;
        while(i<a.length && j<b.length)
        {
            if(i>0 && a[i]==a[i-1])
            {
                i++;
                continue;
            }
             if(j>0 && b[j]==b[j-1])
            {
                j++;
                continue;
            }
            if(a[i]<b[j])
                {
                    res.add(a[i++]);
                }
            else if (a[i]>b[j]) {
                res.add(b[j++]);
                
            }else{ res.add(a[i]);
                i++;
                j++;
            }
            
            
        }
        while(i<a.length)
        {
            if (i==0 ||a[i]!=a[i-1]) {
                res.add(a[i]);}
                i++;}
         while(j<b.length)
        {
            if (j==0 ||b[j]!=b[j-1]) {
                res.add(b[j]);
                j++;
            }
            
        }



        return res;
     }

     static List<Integer> Intersection(int a[] ,int b[])
     {
        List<Integer> res = new ArrayList<>();

        int i=0,j=0;

        while(i<a.length && j<b.length)
        {
            if(a[i]==b[j])
            {
                res.add(a[i]);
                i++;
                j++;
            }else if (a[i]<b[i]) {
                i++;
                
            }else{
                j++;
            }
          }
            return res;
        }
    
     public static void main(String[] args) {
        int a[] = {1,3,5,7,9};
        int b[] = {2,4,6,8,10};
        System.out.println(Intersection(a, b));
     }
     
}
