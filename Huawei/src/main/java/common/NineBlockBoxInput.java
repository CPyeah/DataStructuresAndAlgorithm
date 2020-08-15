package common; /**
 * Copyright (C)
 * FileName: common.NineBlockBoxInput
 * Author:   cp
 * Date:     2020/8/11 10:27
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 * 九宫格按键输入,有英文和数字两个模式,默认是数字模式,
 * 数字模式直接输岀数字,英文模式连续按同一个按键会依次出现这个按键上的字母,
 * 如果输入"/"或者其他字符,则循环中断,输出此时停留的字母。
 * 数字和字母的对应关系如下,注意0只对应空格
 * 1(,.)2(abc)3(def)4(ghi)5 (jkl)6(mno)7(pgrs)8(tuv)9(wxyz)
 * #0(空格)/
 * 输入一串按键,要求输出屏幕显示
 * 1、#用于切换模式,默认是数字模式,执行#后切换为英文模式
 * 2、/表示延迟,例如在英文模式下,
 * 输入22/222,显示为bc,数字模式下/没有效果;
 * 3、英文模式下,多次按同一键,例
 * 如输入22222,显示为b;
 * @author cp
 * @create 2020/8/11
 * @since 1.0.0
 */
public class NineBlockBoxInput {


}
