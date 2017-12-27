/**
 * Project Name:dt59homework
 * File Name:Person.java
 * Package Name:Hw20171227
 * Date:2017年12月27日下午4:03:25
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package Hw20171227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午4:03:25 <br/>
 * @author   YangKui
 * @version
 * @see
 */
public class Person {
    private String name;
    private int age;
    private char sex;
   public String getName(){
       return name;
   }
   public void steName(String name){
       this.name=name;
   }
   public int getAge(){
       return age;
   }    
   public void steAge(int age){
       this.age=age;
   }
   public char getSex(){
       return sex;
   }
   public void setSex(char sex){
       this.sex=sex;
   }
    }



