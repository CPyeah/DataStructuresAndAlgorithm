/**
 * Copyright (C)
 * FileName: LastWordLength
 * Author:   cp
 * Date:     2020/8/15 10:17
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
 * 〈计算字符串最后一个单词的长度，单词以空格隔开。〉
 * 输入描述:
 * 一行字符串，非空，长度小于5000。
 *
 * 输出描述:
 * 整数N，最后一个单词的长度。
 *
 * 示例1
 * 输入
 * hello world
 *
 * 输出
 * 5
 *
 * @author cp
 * @create 2020/8/15
 * @since 1.0.0
 */
public class LastWordLength {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line=bufferedReader.readLine())!=null) {
            int i = line.lastIndexOf(" ");
            int len = line.length() - i -1;
            System.out.println(len);
        }

    }


}
