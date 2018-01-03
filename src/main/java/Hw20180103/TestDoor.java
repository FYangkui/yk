/**
 * Project Name:dt59homework
 * File Name:TestDoor.java
 * Package Name:Hw20180103
 * Date:2018年1月3日下午4:11:21
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package Hw20180103;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午4:11:21 <br/>
 * 
 * @author YangKui
 * @version
 * @see
 */
public class TestDoor {

    public static void main(String[] args) {
        TheftproofDoor door = new TheftproofDoor();

        door.open();
        door.lockUp();
        door.lockOpen();
        door.close();
    }

}
