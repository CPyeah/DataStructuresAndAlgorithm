/**
 * Copyright (C)
 * FileName: DoubleQuotedStringCheck
 * Author:   cp
 * Date:     2020/8/11 10:52
 * Description: A double quoted string
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.util.Scanner;

/**
 * 〈一句话功能简述〉<br> 
 * 〈A double quoted string〉
 * 输出描述:
 * true or false
 *
 * 输入例子1:
 * "abc"
 *
 * 输出例子1:
 * true
 *
 * 输入例子2:
 * "abc
 *
 * 输出例子2:
 * false
 * @author cp
 * @create 2020/8/11
 * @since 1.0.0
 */
public class DoubleQuotedStringCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
//        input = "\"abc\"";
        char[] c = input.toCharArray();
        int qcount = 0;
        for ( char i : c) {
            if ('"'==i) {
                qcount ++;
            }
        }
        if(c.length >1 &&'"'==c[0] && '"'==c[c.length-1] && qcount<3) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
