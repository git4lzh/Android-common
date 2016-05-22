package com.lzh.demo.androidcommon.file;

import android.text.TextUtils;

import java.io.File;

/**
 * Created by 李振华 on 2016/5/22.
 */
public class FileUtils {

    public static boolean isExisted(String path) {
        if (TextUtils.isEmpty(path)) {
            return false;
        }

        File file = new File(path);
        return file.exists();
    }


    public static boolean isFile(String path) {
        if (TextUtils.isEmpty(path)) {
            return false;
        }

        File file = new File(path);
        return file.exists() && file.isFile();
    }


    public static boolean isDirectory(String path) {
        if (TextUtils.isEmpty(path)) {
            return false;
        }

        File file = new File(path);
        return file.exists() && file.isDirectory();
    }
}
