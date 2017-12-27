/**
 * Project Name:dt59homework
 * File Name:cat.java
 * Package Name:Hw20171227
 * Date:2017年12月27日下午3:38:53
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package Hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午3:38:53 <br/>
 * 
 * @author YangKui
 * @version
 * @see
 */
public class Cat {
    String name;

    int age;

    char sex;

    String color;

    public Cat(String name, char sex) {
        this.name = name;
        this.sex = sex;

    }
    public Cat(char sex, String color){
        this.sex=sex;
        this.color=color;
        
    }
    public Cat(String name, String color){
        this.name=name;
        this.color=color;
    }
}
