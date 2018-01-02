/**
 * Project Name:dt59homework
 * File Name:MathTeacher.java
 * Package Name:Hw20180102
 * Date:2018年1月2日下午4:23:12
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package Hw20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午4:23:12 <br/>
 * @author   YangKui
 * @version
 * @see
 */
public class MathTeacher extends Teacher{
//    public void jiao(String teach){
//        System.out.println(teach+"老师教"+teach+"!");
//    }
    public MathTeacher(String teach){
        setTeach(teach);
    }
    public void jiao() {
        System.out.println(this.getTeach() + "老师教" + this.getTeach() + "!");
    }
}

