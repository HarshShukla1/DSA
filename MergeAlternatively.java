public class MergeAlternatively
{
    static String merged(String w1,String w2)
    {
        int n1= w1.length();
        int n2= w2.length();
        int i=0;
        StringBuilder result = new StringBuilder();
        while(i<n1 && i<n2)
        {
            result.append(w1.charAt(i));
            result.append(w2.charAt(i));
            i++;
        }
        while(i<n1){
            result.append(w1.charAt(i));
            i++;
        }
        while(i<n2){
            result.append(w2.charAt(i));
            i++;
        }



        return result.toString();
    }

    public static void main(String[] args) {
        String w1 = "abc";
        String w2 ="pqr";
        System.out.println(merged(w1, w2));
    }
}