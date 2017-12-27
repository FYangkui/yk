/**
 * Project Name:dt59homework
 * File Name:test.java
 * Package Name:dt59homework
 * Date:2017年12月24日上午11:12:38
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;
/**
 * Description:   <br/>
 * Date:     2017年12月24日 上午11:12:38 <br/>
 * @author   Administrator
 * @version
 * @see
 */
public class test {

    public static void main(String[] args) {

        //  Auto-generated method stub
        studentinfor studentinfor1;
        studentinfor1=new studentinfor();
        studentinfor1.name="叶新天";
        studentinfor1.sex='女';
        studentinfor1.year=18;
      System.out.println("姓名:"+studentinfor1.name);
      System.out.println("性别:"+studentinfor1.sex);
      System.out.println("年龄:"+studentinfor1.year);
      System.out.println();
      studentinfor studentinfor2;
      studentinfor2=new studentinfor();
      studentinfor1.name="叶新";
      studentinfor1.sex='女';
      studentinfor1.year=59;
    System.out.println("姓名:"+studentinfor1.name);
    System.out.println("性别:"+studentinfor1.sex);
    System.out.println("年龄:"+studentinfor1.year);
    }

}

