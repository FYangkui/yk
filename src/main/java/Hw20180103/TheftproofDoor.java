/**
 * Project Name:dt59homework
 * File Name:TheftproofDoor.java
 * Package Name:Hw20180103
 * Date:2018年1月3日下午4:06:31
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package Hw20180103;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月3日 下午4:06:31 <br/>
 * @author   YangKui
 * @version
 * @see
 */
public class TheftproofDoor extends Door implements Lock{
    private final static Logger LOG=Logger.getLogger(TheftproofDoor.class);
   
    public void open() {
          LOG.info("门打开！");

    }

    public void close() {
        LOG.info("门关闭！");

    }

    public void lockUp() {
        LOG.info("用钥匙向左转关闭门！");
        
    }

    public void lockOpen() {
        LOG.info("用钥匙向右转打开门！");
        
    }

}

