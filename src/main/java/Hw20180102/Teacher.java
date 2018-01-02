/**
 * Project Name:dt59homework
 * File Name:Teacher.java
 * Package Name:Hw20180102
 * Date:2018年1月2日下午4:19:25
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package Hw20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午4:19:25 <br/>
 * @author   YangKui
 * @version
 * @see
 */
public abstract class Teacher {
    private String teach;


    public String getTeach() {
        return teach;
    }
    public void setTeach(String teach) {
        this.teach = teach;
    }
    
    public abstract void jiao();
//    public void jiao(String teach){
//        System.out.println(teach+"老师教"+teach+"!");
//    }
}

