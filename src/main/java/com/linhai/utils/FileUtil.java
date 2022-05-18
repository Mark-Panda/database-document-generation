package com.linhai.utils;

import org.springframework.boot.system.ApplicationHome;

import java.io.File;

/**
 * @ClassName FileUtil
 * @Description 文件工具类
 * @Author ZhengLinhai
 * @Date 2021/5/17
 * @Version 1.0
 **/
public class FileUtil {
    /**
     * 获取jar包所在路径
     *
     * @return jar包所在路径
     */
    public static String getRootPath() {
        try {
            ApplicationHome home = new ApplicationHome(FileUtil.class);
            File jarFile = home.getSource();
            if (jarFile != null) {
                return jarFile.getParentFile().toString() + File.separator;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
