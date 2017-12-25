/**
 * Project Name:dt59homework
 * File Name:FindMax.java
 * Package Name:Hw20171225
 * Date:2017年12月25日下午5:05:46
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package Hw20171225;

import java.util.Scanner;

/**
 * Description:   <br/>
 * Date:     2017年12月25日 下午5:05:46 <br/>
 * @author   YangKui
 * @version
 * @see
 */
public class FindMax {

    public static void main(String[] args) {
        FindMax fi=new FindMax();
        Scanner input=new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int a=input.nextInt();
        System.out.println("请输入第二个数:");
        int b=input.nextInt();
        System.out.println("两个数最大值是:"+fi.Max(a, b));
        input.close();
    }
    int Max(int a,int b){
        if(a>b){
            return a;
        }else if(a<b){
            return b;
        }else{
            System.out.println("两个数相等");
            return a;
        }
       
    }
} 

