public class ReverseVowel {
    static String reverse(String s)
    {
        char arr[] = s.toCharArray();
        int left = 0;
        int right = arr.length -1;

        while(left<right)
        {
            if(!isVowel(arr[left]))
                left++;
            else if(!isVowel(arr[right]))
                right--;
            else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        return new String(arr);
    }
    private static boolean isVowel(char c){
        return "AEIOUaeiou".indexOf(c)!=-1;
    }

    public static void main(String[] args) {
        String s = "icecream";

        System.out.println(reverse(s));
    }
}
