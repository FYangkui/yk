/**
 * Project Name:dt59homework
 * File Name:Birdtest.java
 * Package Name:Hw20171227
 * Date:2017年12月27日下午3:15:11
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package Hw20171227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午3:15:11 <br/>
 * @author   YangKui
 * @version
 * @see
 */
public class BirdTest {

    public static void main(String[] args) {
        Bird bird=new Bird("布谷鸟", 1, '雄');
       
        System.out.println("鸟的名字: "+bird.name);
        System.out.println("鸟的年龄: "+bird.age+"岁");
        System.out.println("鸟的性别: "+bird.sex+"性");
        
    }

}

