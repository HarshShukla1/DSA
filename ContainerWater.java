public class ContainerWater {
    static int Water(int[] hiegth)
    {
        int maxArea = 0;
        int left = 0;
        int right = hiegth.length-1;
        while (left<right) {
            int h = Math.min(hiegth[left], hiegth[right]);
            int width = right-left;
            int area = width*h;
            maxArea = Math.max(maxArea, area);
            if (left<right) {
                left++;  
            }else{
                right--;
            }
        }

        return maxArea;
    }

   public static void main(String[] args) {
    int hiegth[] = {1,8,6,2,5,4,8,3,7};
    System.out.println(Water(hiegth));
   } 
}