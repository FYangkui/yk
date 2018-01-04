/**
 * Project Name:dt59homework
 * File Name:MapDemo.java
 * Package Name:Hw20180104
 * Date:2018年1月4日下午3:48:02
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package Hw20180104;

import java.text.Collator;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午3:48:02 <br/>
 * 
 * @author YangKui
 * @version
 * @see
 */
public class MapDemo {
    private final static Logger LOG = Logger.getLogger(ListDemo.class);

    public static void main(String[] args) {
        Map map = new HashMap();
        // 添加 在此映射中关联指定值与指定键。
        LOG.info("没有添加之前");
        LOG.info(map.size());
        map.put(1, "AS");
        map.put(2, "abc");
        map.put(3, "456");
        LOG.info("添加之后");
        LOG.info(map.size());
        LOG.info(map);

        // 修改
        LOG.info("修改3键里的值");
        map.put(3, "124");
        LOG.info(map);

        // 删除
        LOG.info("删除1键和值得内容");
        map.remove(1);
        LOG.info(map);
        // 查询
        LOG.info("查询3键");
        LOG.info(map.get(3));

        // 遍历
        LOG.info("遍历");
        Set set = map.keySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            LOG.info(it.next());
        }
        LOG.info("");
        Collection co = map.values();
        Iterator it1 = co.iterator();
        while (it1.hasNext()) {
            LOG.info(it1.next());
        }
        LOG.info("");
        Set set1 = map.entrySet();
        Iterator it2 = set1.iterator();
        while (it2.hasNext()) {
            LOG.info(it2.next());
        }

    }

}
