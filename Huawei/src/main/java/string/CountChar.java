/**
 * Copyright (C)
 * FileName: CountChar
 * Author:   cp
 * Date:     2020/8/15 10:33
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *题目描述
 * 写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 *
 * 输入描述:
 * 第一行输入一个有字母和数字以及空格组成的字符串，第二行输入一个字符。
 *
 * 输出描述:
 * 输出输入字符串中含有该字符的个数。
 *
 * 示例1
 * 输入
 * ABCDEF
 * A
 * 输出
 * 1
 * @author cp
 * @create 2020/8/15
 * @since 1.0.0
 */
public class CountChar {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = bufferedReader.readLine()) != null) {
            char c = bufferedReader.readLine().toCharArray()[0];//读第二行
            int count = 0;
            char[] chars = line.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char ch = chars[i];
                if (c == ch
                    || c == ch-32 || c == ch+32) {//不区分大小写
                    count++;
                }
            }
            System.out.println(count);
        }
    }


}
