/**
 * Project Name:dt59mehomework
 * File Name:Thread.java
 * Package Name:Hw20180108
 * Date:2018年1月8日下午3:20:50
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package Hw20180108;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午3:20:50 <br/>
 * 
 * @author YangKui
 * @version
 * @see
 */
public class MyThread2 implements Runnable {
    private final static Logger LOG = Logger.getLogger(MyThread2.class);

    String num;

    public MyThread2(String num) {
        this.num = num;
    }
    @Override
    public void run() {
        LOG.info("正在运行程序MyThread2" + "   " + num);
    }
}
