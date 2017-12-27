/**
 * Project Name:dt59homework
 * File Name:work.java
 * Package Name:dt59homework
 * Date:2017年12月22日下午7:22:40
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月22日 下午7:22:40 <br/>
 * 
 * @author Administrator
 * @version
 * @see
 */
public class work {

    public static void main(String[] args) {

        // Auto-generated method stub
        
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个数值：");
        int  n=input.nextInt();
        int [][]ary=new int[n][n];
        for (int i = 0; i < ary.length; i++) {
            ary[i][i]=1;
            ary[i][0]=1;
            
        }  
//        for (int q = 1; q < n-1; n++) {
//            System.out.print(" ");
            for (int i = 2; i < ary.length; i++) {
                for (int j = 1; j <=i-1; j++) {
                    ary[i][j]=ary[i-1][j-1]+ary[i-1][j];
                }
            }
  
//        }
//        System.out.println();
               for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(ary[i][j]+"\t");
            }
            System.out.println();
        }
          input.close();     
    }

}
