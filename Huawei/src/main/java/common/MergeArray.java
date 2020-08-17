package common; /**
 * Copyright (C)
 * FileName: common.MergeArray
 * Author:   cp
 * Date:     2020/8/11 10:33
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import com.sun.deploy.util.StringUtils;

import java.util.*;



/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 * 现在有多组整数数组,需要将它们合并成一个新的数组。
 * 合并规则,从每个数组里按顺序取出固定长度的内容合并到新的数组中,
 * 取完的内容会删除掉,如果该行不足固定长度或者已经为空,
 * 则直接取出剩余部分的内容放到新的数组中,继续下一行。
 * 输入：
 * 3
 * 2,5,6,7,9,5,7
 * 1,7,4,3,4
 * 4,5,7,1,3,8
 *
 * 输出：
 * 2,5,6,1,7,4,4,5,7,7,9,5,3,4,1,3,8,7
 * @author cp
 * @create 2020/8/11
 * @since 1.0.0
 */
public class MergeArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        int capacity = 0;
        List<String[]> list = new ArrayList<String[]>();
        s.nextLine();
        String line = null;
        while ((line = s.nextLine()) != null) {
            if ("".equals(line)) {
                break;
            }
            String[] split = line.split(",");
            capacity += split.length;
            list.add(split);
        }
//        subArrayAndPrint(list, new String[capacity], count);
        subArrayAndPrint(list, new ArrayList<String>(), count);
    }

    /**
     * 截取方法 （有问题）
     * @param list
     * @param strings
     * @param count
     */
    private static void subArrayAndPrint(List<String[]> list, ArrayList strings, int count) {
        int time = 0;
        while (list.size() >0 ) {
            time++;
            for (int j = 0; j < list.size(); j++) {
                String[] s = list.get(j);
                int i = (time-1) * count;
                do {
                    if (i >= s.length) {
                        list.remove(j);
                        break;
                    }
    //                strings[strings.length] = s[i];
                    strings.add(s[i]);
                    i ++;
                }while (i % count != 0);
            }
        }
        printArray(strings);
    }

    public static void printArray(List strings) {
        System.out.println(StringUtils.join(strings, ","));
    }

}
