/**
 * Project Name:dt59homework
 * File Name:Autotruck.java
 * Package Name:Hw20171228
 * Date:2017年12月29日下午2:46:12
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package Hw20171228;
/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午2:46:12 <br/>
 * @author   YangKui
 * @version
 * @see           
 */
//            大卡车
public class Autotruck extends Car {
    private String load;//载重
    private int tire;//轮胎
    public String getLoad() {
        return load;
    }
    public void setLoad(String load) {
        this.load = load;
    }
    public int getTire() {
        return tire;
    }
    public void setTire(int tire) {
        this.tire = tire;
    }
    public String Load(){
        return  "15吨" ;
    }
     public void  show(){
         System.out.println("我有很多轮胎");
     }   
    }



