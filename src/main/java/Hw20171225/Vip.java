/**
 * Project Name:dt59homework
 * File Name:Vip.java
 * Package Name:Hw20171225
 * Date:2017年12月25日下午5:29:59
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package Hw20171225;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午5:29:59 <br/>
 * 
 * @author YangKui
 * @version
 * @see
 */
public class Vip {

    public static void main(String[] args) {
        System.out.println("\t\t"+"结算系统");
        System.out.println("***************************************");
        Scanner input=new Scanner(System.in);
        Vip vi=new Vip();
        System.out.print("请选择会员等级:"+"\t");
        
        int a=input.nextInt();
        if(a<=5){
        String b=vi.grade(a);
        System.out.print("请输入消费金额:"+"\t");
        double money=input.nextDouble();
        double sum=vi.sum(b, money);
        System.out.print("您的消费金额为:"+"\t"+sum);
        input.close();
    }
    }
    String grade(int a) {
        if (a == 1) {
            System.out.println("欢迎尊贵的至尊级会员莅临!!!");
            return "至尊级";
        } else if (a == 2) {
            System.out.println("欢迎尊贵的钻石级会员光临!!");
            return "钻石级";
        } else if (a == 3) {
            System.out.println("欢迎尊贵的铂金会员光临!");
            return "铂金级";
        } else if (a == 4) {
            System.out.println("欢迎华贵的黄金会员光临!");
            return "黄金级";
        } else if (a == 5) {
            System.out.println("欢迎华贵的白银会员光临!");
            return "白银级";
        } else {
            System.out.println("您的会员卡不能被识别！！！");
            return null;
        }
    }

    double sum(String card, double money) {
        double balance = 0;
        if (card.equals("至尊级")) {
            balance = 0.75 * money;
        } else if (card.equals("钻石级")) {
            balance = 0.8 * money;
        } else if (card.equals("铂金级")) {
            balance = 0.85 * money;
        } else if (card.equals("黄金级")) {
            balance = 0.9 * money;
        } else if (card.equals("白银级")) {
            balance = 0.95 * money;
        }
        return balance;
    }

}
