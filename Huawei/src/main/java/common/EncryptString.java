package common; /**
 * Copyright (C)
 * FileName: common.EncryptString
 * Author:   cp
 * Date:     2020/8/11 10:24
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 * 给你一串未加密的字符串str,通过
 * 对字符串的每一个字母进行改变来实现加密,加密方式是在每一个字
 * 母str[i]偏移特定数组元素a[i]的量,
 * 数组a前三位已经赋值a[0]=1,a[1]=2,a[2]=4。
 * 当a>=3时,数组元素a[i]=a[i-1]+a[i-2]+a[i-3]
 * 例如:原文 abcde加密后 bdgkr
 * 其中偏移量分别是1,2,4,7,13。
 * @author cp
 * @create 2020/8/11
 * @since 1.0.0
 */
public class EncryptString {

    public static void main(String[] args) {
        String input = "abcde";
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] + getOffsets(i));
        }
        System.out.println(new String(chars));
    }

    private static int getOffsets(int i) {
        if (i == 0) {
            return 1;
        } else if (i == 1) {
            return 2;
        } else if (i == 2) {
            return 4;
        }
        return getOffsets(i-1)+getOffsets(i-2)+getOffsets(i-3);
    }

}
