package com.lgz.controller;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * Created by lgz on 2018/7/14.
 */
public class MD5test {
    public static void main(String[] args) {
        //构造方法中
        //第一个参数：明文、原始密码
        //第二个参数：盐、通过使用随机数
        //第三个参数：散列的次数，比如散列两次，相当于md5(md5())
        Md5Hash md5Hash = new Md5Hash("111","adf",1);
        System.out.println(md5Hash.toString());
    }
}
