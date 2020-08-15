/**
 * Copyright (C)
 * FileName: NumberConvert
 * Author:   cp
 * Date:     2020/8/15 11:54
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
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。（多组同时输入 ）
 *
 * 输入描述:
 * 输入一个十六进制的数值字符串。
 *
 * 输出描述:
 * 输出该数值的十进制字符串。
 *
 * 示例1
 * 输入
 * 0xA
 * 输出
 * 10
 *
 * @author cp
 * @create 2020/8/15
 * @since 1.0.0
 */
public class NumberConvert {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while((line = reader.readLine())!=null) {
            String n = line.substring(2);
            Long l = Long.parseLong(n ,16);
            System.out.println(l);
        }
    }

}
