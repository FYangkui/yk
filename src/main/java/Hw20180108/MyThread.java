/**
 * Project Name:dt59mehomework
 * File Name:MyThread.java
 * Package Name:Hw20180108
 * Date:2018年1月8日下午2:20:03
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package Hw20180108;

import org.apache.log4j.Logger;

import Hw20180106.Work1;

/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午2:20:03 <br/>
 * @author   YangKui
 * @version
 * @see
 */
public class MyThread extends Thread {
    private final static Logger LOG = Logger.getLogger(MyThread.class);
    @Override
    public void run() {
     for (int i = 0; i < 5; i++) {
            LOG.info("你好，来自线程"+Thread.currentThread().getName()+":"+i);
           
            }
        }
    }
    


