/**
 * Project Name:dt59homework
 * File Name:Luxury.java
 * Package Name:Hw20171228.luxury
 * Date:2017年12月29日下午5:55:31
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package Hw20171228.luxury;

import Hw20171228.Car;

/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午5:55:31 <br/>
 * @author   YangKui
 * @version
 * @see
 */
public class LuxuryCar extends Car {
    private double price;
    private String speed;
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getSpeed() {
        return speed;
    }
    public void setSpeed(String speed) {
        this.speed = speed;
    }
    public  void  Summary(){
        System.out.println("我是豪车我的起步速度快到不行！！！");
        
    }
}

