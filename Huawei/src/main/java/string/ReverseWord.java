/**
 * Copyright (C)
 * FileName: ReverseWord
 * Author:   cp
 * Date:     2020/8/15 12:19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 题目描述
 * 对字符串中的所有单词进行倒排。
 *
 * 说明：
 *
 * 1、构成单词的字符只有26个大写或小写英文字母；
 *
 * 2、非构成单词的字符均视为单词间隔符；
 *
 * 3、要求倒排后的单词间隔符以一个空格表示；如果原字符串中相邻单词间有多个间隔符时，倒排转换后也只允许出现一个空格间隔符；
 *
 * 4、每个单词最长20个字母；
 *
 * 输入描述:
 * 输入一行以空格来分隔的句子
 *
 * 输出描述:
 * 输出句子的逆序
 *
 * 示例1
 * 输入
 * I am a student
 * 输出
 * student a am I
 *
 * @author cp
 * @create 2020/8/15
 * @since 1.0.0
 */
public class ReverseWord {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while((line=reader.readLine()) != null) {
            reverse(line);
        }
    }
    private static void reverse(String line) {
        StringBuilder sb = new StringBuilder();
        boolean f = false;//是否是字符标记
        int start=0, end=0; //单词两端位置
        char[] chars = line.toCharArray();
        for (int i = chars.length-1; i > -1; i--) {
            char c = chars[i];
            if (isChar(c) && !f) {//第一个字符
                end = i+1;
                f = true;
            } else if(!isChar(c) && f) {
                start = i+1;
                f = false;
                sb.append(line.substring(start, end)+" ");
            }
        }
        if (f) {
            sb.append(line.substring(0, end));
        }
        System.out.println(sb.toString().trim());
    }

    private static boolean isChar(char c) {
        return c>='A' && c<='z';
    }

}
