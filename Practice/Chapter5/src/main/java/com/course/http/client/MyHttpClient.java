package com.course.http.client;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author С����
 * @create 2020-11-26 0:03
 */
public class MyHttpClient {

    @Test
    public void test1() throws IOException {
        //������Ž��
        String result;
        //���󷽷�
        HttpGet get = new HttpGet("http://www.baidu.com");
        //ִ��
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(result);
    }

}
