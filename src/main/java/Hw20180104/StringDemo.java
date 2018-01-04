/**
 * Project Name:dt59homework
 * File Name:String.java
 * Package Name:Hw20180104
 * Date:2018年1月4日下午2:04:27
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package Hw20180104;

import javax.print.DocFlavor.STRING;

import org.apache.log4j.Logger;

import Hw20180103.TheftproofDoor;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午2:04:27 <br/>
 * 
 * @author YangKui
 * @version
 * @see
 */
public class StringDemo {
    private final static Logger LOG = Logger.getLogger(StringDemo.class);

    public static void main(String[] args) {
        // 1)返回指定索引处的 char 值。索引范围为从 0 到 length() - 1。
        // 序列的第一个 char 值位于索引 0 处，第二个位于索引 1 处，依此类推，这类似于数组索引。
        String str = "abcd";
        LOG.info(str.charAt(2));// 所以char值得索引2处为c;
        // 2)返回此字符串的长度。
        String str1 = "advnsdlvnw";
        LOG.info(str1.length()); // 10
        // 3)告知此字符串是否匹配给定的正则表达式。
        String str2 = "aconwoopnc";
        LOG.info(str2.matches(str));// false
        // 4)当且仅当 length() 为 0 时返回 true。
        String str3 = "";
        LOG.info(str3.isEmpty());// true
        // 5)返回字符串对象的规范化表示形式。
        String str4 = "张三是学生！";
        LOG.info(str4.intern());
        // 6)返回此字符串的哈希码。
        String str5 = "李四成绩没考好！";
        LOG.info(str5.hashCode());
        // 7) 返回指定字符在此字符串中第一次出现处的索引。
        String str6 = "45151651";
        LOG.info(str6.indexOf('5'));
    }

}
