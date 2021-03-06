package common; /**
 * Copyright (C)
 * FileName: common.NumInStack
 * Author:   cp
 * Date:     2020/8/11 10:38
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈计算堆栈中的剩余数字〉
 * 向一个空栈中依次存入正整数,假
 * 设入栈元素n(1<=n<=2^31-1)按顺序依次为nx、n4、n3、n2、n1,
 * 每当元素入栈时,如果n1=n2+…+ny(y的范围[2,x],1<=X<=1000),则n1~ny全部元素出栈,
 * 重新入栈新元素 m(m=2*n1)。
 * 如:依次向栈存入6、1、2、3,当存入6、1、2时,
 * 栈底至栈顶依次为[6、1、2];
 * 当存入3时,3=2+1，3、2、1全部出栈,
 * 重新入栈元素6(6=2*3),此时栈中有元素6;因为6=6,所以两个6全部出栈,
 * 存入12.最终栈中只剩一个元素12
 * @author cp
 * @create 2020/8/11
 * @since 1.0.0
 */
public class NumInStack {


}
