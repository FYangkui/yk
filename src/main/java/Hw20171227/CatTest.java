/**
 * Project Name:dt59homework
 * File Name:Cattest.java
 * Package Name:Hw20171227
 * Date:2017年12月27日下午3:45:37
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package Hw20171227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午3:45:37 <br/>
 * @author   YangKui
 * @version
 * @see
 */
public class CatTest {

    public static void main(String[] args) {

        Cat cat=new Cat("小花",'母');
        System.out.println("猫的名字是: "+cat.name+"   "+" 猫的性别是: "+cat.sex);
        Cat cat1=new Cat('雄',"黄色");
        System.out.println("猫的性别是: "+cat1.sex+"    "+"猫的颜色是: "+cat1.color);
        Cat cat2=new Cat("小红","红色");
        System.out.println("猫的名字是:"+cat2.name+"    "+"猫的颜色是: "+cat2.color);

               

    }

}

