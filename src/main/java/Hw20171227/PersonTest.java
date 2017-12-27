/**
 * Project Name:dt59homework
 * File Name:Persontest.java
 * Package Name:Hw20171227
 * Date:2017年12月27日下午4:29:30
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package Hw20171227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午4:29:30 <br/>
 * @author   YangKui
 * @version
 * @see
 */
public class PersonTest {

    public static void main(String[] args) {
        Person per = new Person();
        per.steName("杨奎");
        per.steAge(21);
        per.setSex('男');
        System.out.println("姓名: "+per.getName());
        System.out.println("年龄: "+per.getAge());
        System.out.println("性别: "+per.getSex());
    }

}

