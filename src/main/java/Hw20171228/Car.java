/**
 * Project Name:dt59homework
 * File Name:Car.java
 * Package Name:Hw20171228
 * Date:2017年12月29日下午2:26:42
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package Hw20171228;
/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午2:26:42 <br/>
 * @author   YangKui
 * @version
 * @see
 */
 //       车
public abstract class  Car {
    String color;
    String kind;
  public  void  Summary(){
        System.out.println("车能够方便出行");
    }
    public Car(){
        
    }
    public Car(String color){
        this.color=color;
    }
    public Car(String color,String kind){
        this(color);
        this.kind=kind;
    }
}

