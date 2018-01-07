/**
 * Project Name:dt59mehomework
 * File Name:Work2.java
 * Package Name:Hw20180106
 * Date:2018年1月6日下午7:17:21
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package Hw20180106;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月6日 下午7:17:21 <br/>
 * 
 * @author YangKui
 * @version
 * @see
 */
public class Work2 {
    private final static Logger LOG = Logger.getLogger(Work2.class);

    public static void main(String[] args) throws IOException {
        String src = "C:\\Users\\Administrator\\Desktop\\2.txt";
        String des = "C:\\Users\\Administrator\\Desktop\\3.txt";

        copyFile(src, des);

        LOG.info("程序运行完成!");
    }

    public static void copyFile(String src, String des) throws IOException {
        BufferedInputStream inBuff = null;
        BufferedOutputStream outBuff = null;

        try {
            // 新建文件输入流并对它进行缓冲
            inBuff = new BufferedInputStream(new FileInputStream(src));

            // 新建文件输出流并对它进行缓冲
            outBuff = new BufferedOutputStream(new FileOutputStream(des));

            // 缓冲数组
            byte[] b = new byte[1024 * 5];
            int len;
            while ((len = inBuff.read(b)) != -1) {
                outBuff.write(b, 0, len);
            }
            // 刷新此缓冲的输出流
            outBuff.flush();
        } finally {
            // 关闭流
            if (inBuff != null)
                inBuff.close();
            if (outBuff != null)
                outBuff.close();
        }

    }
}
