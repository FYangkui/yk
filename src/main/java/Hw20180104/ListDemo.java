/**
 * Project Name:dt59homework
 * File Name:ListDemo.java
 * Package Name:Hw20180104
 * Date:2018年1月4日下午2:50:41
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package Hw20180104;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午2:50:41 <br/>
 * 
 * @author YangKui
 * @version
 * @see
 */
public class ListDemo {
    private final static Logger LOG = Logger.getLogger(ListDemo.class);

    public static void main(String[] args) {
        List list = new ArrayList();
        // 添加
        LOG.info(list.size());// 没有添加之前
        LOG.info("添加");
        list.add(121);
        list.add(22);
        list.add("abc");
        LOG.info(list.size());// 添加之后
        LOG.info(list);// 显示结果121, 22, abc

        // 修改
        LOG.info("修改脚标为2的元素为23");
        list.set(2, 23);
        LOG.info(list);// 显示结果121, 22, 23

        // 删除
        LOG.info("删除脚标为2的元素");
        list.remove(2);// 删除脚标为2的元素，脚标从0开始，所以是第三个
        LOG.info(list);// 显示结果为 121, 22

        // 查询
        LOG.info("查询脚标为1的元素");
        LOG.info(list.get(1));

        // 插入
        LOG.info("插入脚标为1的元素ASD");
        list.add(1, "ASD");
        LOG.info(list);// 显示121, ASD, 22

        // 遍历
        LOG.info("遍历");
        for (int i = 0; i < list.size(); i++) {
            LOG.info(list.get(i));
        }

        Iterator it = list.iterator();
        while (it.hasNext()) {
            LOG.info(it.next());
        }
    }

}
