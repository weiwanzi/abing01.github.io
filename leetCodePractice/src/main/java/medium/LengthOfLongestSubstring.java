package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度*/
//求各类子串、各类相同最多最少，可以用滑动窗口
public class LengthOfLongestSubstring {
    //滑动窗口一般定义四个窗口开始指针，窗口结束指针，存放当前记录，最后结果
    //此处start,end,map,ans
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (end = 0;end < s.length();end++){
            //开始滑动
            //每次都要讲end的元素取出来，之后要放入map里头
            Character element = s.charAt(end);
            //再put到map之前要先确定此轮滑动窗口start的位置，如果put再看，则会变成end跟start相等没意义
            //map.containsKey(key),查看该key再map中是否已存在
            if (map.containsKey(element))
            //存在的话，证明出现重复了，滑动窗口开始位置得移动了
            {
                //map.get(element)+1是指start的位置要中重复元素的下一个开始，为什么要跟start比较
                //因为如果是abaab会出现左滑了，即有可能本次start比上次还小
                start = Math.max(map.get(element) + 1, start);
            }
            map.put(element, end);
            //end-start+1求此时滑动窗口大小，如果比上次大，最大就变成这次
            ans = Math.max(ans,end-start+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        int len = lengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb");
        System.out.println(len);
    }

}
