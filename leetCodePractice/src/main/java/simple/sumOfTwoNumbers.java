package simple;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*求两数之和，本题由于已确定是两个数，因此只需要写两个for语句，第一次for从num[i=0]开始，
第二次从num[i-1]开始。
get新知识：int[]再创建后不可改，所以可以直接再return的时候创建直接赋值再做回返回值。*/
public class sumOfTwoNumbers {
    public int[] twoSum(int[] nums, int target) {
        int i = nums.length;
        for (int j = 0; j < i; j++) {
            for (int k = j+1; k < i; k++) {
                if (nums[j] + nums[k] == target) {
                    return new int[]{j,k};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        sumOfTwoNumbers sumOfTwoNumbers = new sumOfTwoNumbers();
        int[] lis  = {3,3};
        int[] ints = sumOfTwoNumbers.twoSum(lis, 6);
        System.out.println(Arrays.toString(ints));
    }
}
