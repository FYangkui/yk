/**
 * Project Name:dt59homework
 * File Name:Liontest.java
 * Package Name:Hw20171227
 * Date:2017年12月27日下午4:46:18
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package Hw20171227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午4:46:18 <br/>
 * @author   YangKui
 * @version
 * @see
 */
public class LionTest {

    public static void main(String[] args) {
        Lion lion=new Lion();
       System.out.println(lion.name);
       System.out.println(Lion.sex);
       Lion.eat();//静态方法能通过类名和对象名来调用；
       lion.love();//普通方法只能用对象名来调用；
    }

}

