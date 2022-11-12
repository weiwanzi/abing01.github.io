package simple;

import java.util.Arrays;

public class qidong {

    public static void main(String[] args) {
        mingHanDistance mingHanDistance = new mingHanDistance();
        int h = mingHanDistance.hammingDistance(4,1);
        System.out.println(h);
        sumOfTwoNumbers sumOfTwoNumbers = new sumOfTwoNumbers();
        int[] lis  = {3,3};
        int[] ints = sumOfTwoNumbers.twoSum(lis, 6);
        System.out.println(Arrays.toString(ints));
    }

}
