/**
 * Project Name:dt59homework
 * File Name:SedanCar.java
 * Package Name:Hw20171228
 * Date:2017年12月29日下午2:45:15
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package Hw20171228;
/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午2:45:15 <br/>
 * @author   YangKui
 * @version
 * @see
 */
//           小汽车
public class SedanCar extends  Car{
    private String color;//颜色
    private String site;//座位
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getSite() {
        return site;
    }
    public void setSite(String site) {
        this.site = site;
    }
    public SedanCar(){
        
    }
      public  SedanCar(String color){
          this.color=color;
      }
      public SedanCar(String color,String kind){
          this(color);
          this.kind=kind;
      }
    }
    


