/**
 * Copyright (C)
 * FileName: FileContextGet
 * Author:   cp
 * Date:     2020/8/9 18:50
 * Description: 1
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

import java.io.File;
import java.util.ArrayList;

/**
 * 获取根目录下的所有文件，打印每个文件里的字母个数，数字个数，空格个数，行数
 * @author cp
 * @create 2020/8/9
 * @since 1.0.0
 */
public class FileContextGet {

    public static void main(String[] args) {
        String root = "";
        ArrayList files = new ArrayList();
        getFileList(new File("root"), files);
    }

    private static void getFileList(File root, ArrayList files) {
        File[] list = root.listFiles();
        for (int i = 0; i < list.length; i++) {
            File f = list[i];
            if (f.isDirectory()) {
                getFileList(f, files);
            } else {
                files.add(f);
            }
        }
    }

}
