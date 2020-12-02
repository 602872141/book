package com.course.testng.group;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @author С����
 * @create 2020-11-25 23:53
 */
public class GroupOnMethod {

    @Test(groups = "server")
    public void test1() {
        System.out.println("����server����1");
    }

    @Test(groups = "server")
    public void test2() {
        System.out.println("����server����2");
    }

    @Test(groups = "client")
    public void test3() {
        System.out.println("����client����1");
    }

    @BeforeGroups()
    public void beforeGroupsOnServer() {
        System.out.println("���Ƿ����������֮ǰ���еķ���");
    }
}
