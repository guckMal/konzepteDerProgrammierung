package VorOrtEx4;

public class WrapperTask {

    public static void main(String[] args) {
        char[] values = {'1', 'a', '3', 'z', '9'};
        int[] nums = {10, 0, -4, 20, 5};
        System.out.println(countDigitsPrimitive(values));
        System.out.println(maxWithWrapper(nums));
        /*

         */

    }

    // Task A: Count digits using only primitives (e.g., ASCII comparison)
    public static int countDigitsPrimitive(char[] values) {
        int count=0;
        for (char c: values
             ) {
        if ((int)(c)>47 &&(int)(c)<58)
        count++;}
        return count;
    }

    // Task B: Count digits using Character.isDigit()
    public static int countDigitsWrapper(char[] values) {
        int count=0;
        for (char c:values) {
            if (Character.isDigit(c)){
                count++;
            }
        }
        return count;
    }

    // Task C: Find max using only primitives
    public static int maxPrimitive(int[] nums) {

        return 0;
    }

    // Task D: Find max using Integer.compare()
    public static int maxWithWrapper(int[] nums) {
        int maxInt= Integer.MIN_VALUE;
        for (int i:nums) {
            if(Integer.compare(maxInt,i)<0){
                maxInt=i;
            }
        }
        return maxInt;
    }
}
