package com.course.testng;

import org.testng.annotations.*;

/**
 * @author С����
 * @create 2020-11-25 21:57
 */
public class BeasicAnnotation {

    //�������ע�⣬�����ѷ������λ���Ե�һ����
    @Test
    public void testCase1() {
        System.out.println("���ǲ�������1");
    }

    @Test(enabled = false)
    public void testCase2() {
        System.out.println("���ǲ�������2");
    }

    @Ignore
    public void ignore(){
        System.out.println("��ִ��");
    }
    @BeforeMethod
    public void berforeMethod() {
        System.out.println("berforeMethod�����ڲ��Է���֮ǰ���е�");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("afterMethod�����ڲ��Է���֮�����е�");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("beforeClass�����ڲ�����֮ǰ���е�");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("beforeClass�����ڲ�����֮�����е�");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite�����׼�");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite�����׼�");
    }

}
