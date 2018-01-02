/**
 * Project Name:dt59homework
 * File Name:ChineseTeacher.java
 * Package Name:Hw20180102
 * Date:2018年1月2日下午4:25:25
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package Hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午4:25:25 <br/>
 * 
 * @author YangKui
 * @version
 * @see
 */
public class ChineseTeacher extends Teacher {
    public ChineseTeacher(String teach){
        setTeach(teach);
    }
 
    public void jiao() {
        System.out.println(this.getTeach() + "老师教" + this.getTeach() + "!");
    } 
//    public void jiao(String teach) {
//        System.out.println(teach + "老师教" + teach + "!");
//    }   
}
