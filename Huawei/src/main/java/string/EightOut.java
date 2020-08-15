/**
 * Copyright (C)
 * FileName: EightOut
 * Author:   cp
 * Date:     2020/8/15 11:17
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author cp
 * @create 2020/8/15
 * @since 1.0.0
 */
public class EightOut {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line1 = null;
        String line2 = null;
        char[] eight = {'0', '0', '0', '0', '0', '0', '0', '0'};
        while((line1 = reader.readLine()) != null
                && (line2 = reader.readLine()) != null ) {
            char[] l1 = line1.toCharArray();
            char[] l2 = line2.toCharArray();
            eightInit(eight);
            output(l1, eight);
            eightInit(eight);
            output(l2, eight);
        }
    }
    public static void output(char[] l, char[] eight) {
        int ei = 0;
        for(int i=0;i<l.length;i++) {
            if(i!=0&&i%8==0) {
                System.out.println(new String(eight));
                eightInit(eight);
                ei = 0;
            }
            char c = l[i];
            eight[ei] = l[i];
            ei ++;

        }
        System.out.println(new String(eight));
    }

    private static void eightInit(char[] eight) {
        for (int i = 0; i < 8; i++) {
            eight[i] = '0';
        }
    }


}
