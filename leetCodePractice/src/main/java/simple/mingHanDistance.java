package simple;

import static java.lang.Math.abs;

public class mingHanDistance {
    /*两个整数之间的 汉明距离 指的是这两个数字对应二进制位不同的位置的数目。
     给你两个整数 x 和 y，计算并返回它们之间的汉明距离。*/
    /*此题目的意思是讲两个数转换成二进制，然后看对应位置是否相同（实际上是做异或）
    * 可使用Integer中的bitCount()方法*/
    /*再力扣上自己写的解释
    * 此题实际上是要我们计算两个int类型转成二进制后，对他们进行异或计算，
      即主要看对应位置是否相同。异或即不同为1。
      x^y得出来的值就是异或完的值，然后看一下它转二进制后的1的个数，既可得对应位置不同得个数。
      Integer.bitCount(int i);(对应也有Long.bitCount)此函数是用来计算一个数中，转二进制后1的个数*/
    public int hammingDistance(int x, int y){
        //Integer.bitCount是用来将一个二进制中1的个数
        //将x与y做异或运算，得到一个值，再看这个值1的个数，1即为就是他们对应位置不同
        int i = Integer.bitCount(y^x);
        return i;
    }

    public static void main(String[] args) {
        mingHanDistance mingHanDistance = new mingHanDistance();
        int h = mingHanDistance.hammingDistance(4,1);
        System.out.println(h);
    }

}
