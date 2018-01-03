/**
 * Project Name:dt59homework
 * File Name:Try.java
 * Package Name:Hw20180103
 * Date:2018年1月3日下午4:21:45
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package Hw20180103;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午4:21:45 <br/>
 * 
 * @author YangKui
 * @version
 * @see
 */
public class Try {
    private final static Logger LOG = Logger.getLogger(Try.class);

    public static void main(String[] args) {
        //定义一个空的字符串
        String str = null;
//        LOG.info(str.charAt(1));
        // 尝试对空字符串进行操作，并捕获异常，输出异常
        try {
            LOG.info(str.charAt(0));
        } catch (Exception e) {
            LOG.info(e);
            e.printStackTrace();

        }

    }
}
