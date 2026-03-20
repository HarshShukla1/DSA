class paranthesis
{
    static String removeParanthesis(String s)
    {
        StringBuilder result = new StringBuilder();
        int level = 0;
        for (char ch : s.toCharArray()) {
            if(ch=='(')
                if(level>0){
                    level++;
                }
            else if(ch==')')
                if(level>0){
                    level++;
                }
            
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "(()())(())";
        paranthesis sol = new paranthesis();
        String ans = sol.removeParanthesis(s);
        System.out.println(ans);
    }
}