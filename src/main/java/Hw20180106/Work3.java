/**
 * Project Name:dt59mehomework
 * File Name:Work3.java
 * Package Name:Hw20180106
 * Date:2018年1月6日下午7:17:42
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package Hw20180106;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月6日 下午7:17:42 <br/>
 * @author   YangKui
 * @version
 * @see
 */
public class Work3 {
    private final static Logger LOG = Logger.getLogger(Work3.class);

    public static void main(String[] args) {
        Date date=new Date(2018-1900,1-1,7);
        LOG.info("今天的日期是:"+date);
        //测试此日期是否在指定日期之后。
        Date date1=new Date(2018-1900,1-1,1);
        date.after(date1);
      //当且仅当此 Date 对象表示的瞬间比 when 表示的瞬间晚，才返回 true；否则返回 false。
        LOG.info("测试今天是不是在1月1号之后:"+date.after(date1));
        //测试此日期是否在指定日期之前。
        date1.before(date);
        //当且仅当此 Date 对象表示的瞬间比 when 表示的瞬间早，才返回 true；否则返回 false。 
        LOG.info("测试今天是不是在1月1号之前:"+date1.after(date));
        //返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
        LOG.info("1970 年 1 月 1 日 00:00:00 GMT 距今天有:"+date.getTime()/1000/60/60/24+"天");
        // 把此 Date 对象转换为以下形式的 String： dow mon dd hh:mm:ss zzz yyyy
        // 其中：dow 是一周中的某一天 (Sun, Mon, Tue, Wed, Thu, Fri, Sat)。
        LOG.info(date.toGMTString());
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日        HH:mm:ss.SSSZ");
        String strDate=sdf.format(date);
        LOG.info(strDate);
        //从计算机内获取时间
         long cur  =System.currentTimeMillis();
         Date date3=new Date(cur);
         LOG.info(sdf.format(date3));
         //1970 1 1 
         Date date4=new Date(0);
         LOG.info(sdf.format(date4));
    }

}

