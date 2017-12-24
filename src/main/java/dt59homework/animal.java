/**
 * Project Name:dt59homework
 * File Name:animal.java
 * Package Name:dt59homework
 * Date:2017年12月24日下午2:19:29
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;
/**
 * Description:   <br/>
 * Date:     2017年12月24日 下午2:19:29 <br/>
 * @author   Administrator
 * @version
 * @see
 */
public class animal {

    public static void main(String[] args) {

        //  Auto-generated method stub
        dog Dog;
        Dog=new dog();
        Dog.name="小黑";
        Dog.color="黑色";
        Dog.sex='公';
        Dog.year=2;
        System.out.println("\t\t动物");
        System.out.println("小狗的名字是:"+Dog.name);
        System.out.println("小狗的颜色是:"+Dog.color);
        System.out.println("小狗的性别是:"+Dog.sex);
        System.out.println("小狗的年龄是:"+Dog.year);
        System.out.println();
        System.out.println("小狗的名字是:");
        Dog.name();        
        System.out.println("小狗的颜色是:"+Dog.color());
        System.out.println("小狗的性别是:");
        Dog.sex();
        System.out.println("小狗的年龄是:"+Dog.year());
    }

}

