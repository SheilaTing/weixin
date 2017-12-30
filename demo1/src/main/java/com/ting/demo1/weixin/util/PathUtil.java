package com.ting.demo1.weixin.util;


public class PathUtil {
    public static final String FILE_SEPARATOR = System.getProperty("file.separator");

    //public static final String FILE_SEPARATOR = File.separator;
    public static String getRealFilePath(String path) {
        return path.replace("/", FILE_SEPARATOR).replace("\\", FILE_SEPARATOR);
    }
}
