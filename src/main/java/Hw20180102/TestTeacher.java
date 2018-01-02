/**
 * Project Name:dt59homework
 * File Name:TestTeacher.java
 * Package Name:Hw20180102
 * Date:2018年1月2日下午4:38:21
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package Hw20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午4:38:21 <br/>
 * @author   YangKui
 * @version
 * @see
 */
public class TestTeacher {
   
    public static void main(String[] args) {       
        Teacher tea=new MathTeacher("数学");
       
        Teacher te=new ChineseTeacher("语文");
        
        if(tea instanceof MathTeacher){
        MathTeacher math=(MathTeacher)tea;
        math.jiao();
        }
        if(te instanceof ChineseTeacher){
            ChineseTeacher language=(ChineseTeacher)te;
            language.jiao();
            }
    }

}

