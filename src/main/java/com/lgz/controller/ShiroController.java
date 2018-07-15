package com.lgz.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

/**
 * 1、通过ini配置文件创建securityManager
 * 2、调用subject.login方法主体提交认证
 * 3、securityManager进行认证，securytiManager最终由ModularRealmAuthenticatar进行认证
 * 4、ModularRealmAuthenticator调用iniRealm去ini配置文件中查询用户信息
 * 5、iniRealm根据输入的token（usernamePasswordToken）从shiro-first.ini查询用户信息，根据账号查询
 * 用户信息（账号和密码）
 * 如果查询到用户信息，就给ModularRealmAuthenticator返回用户信息（用户名和密码）
 * 如果查不到就给ModularRealmAuthenticator返回null
 * 6、ModularRealmAuthenticator接受iniReaml返回Authenticator信息
 * 如果返回的认证信息是null，ModularRealmAuthenticator抛出异常 UnknownAcccountException
 * 如果返回的认证信息不是null(说明iniRealm找到了用户),对iniRealm返回的用户密码（在ini文件汇总存在的）
 * 和token中的密码进行对比，如果不一致抛出异常
 * 小结：
 * ModularRealmAuthenticator作用进行认证，需要调用realm查询用户信息（在数据库中查询用户信息）
 * ModularReamlAuthenticator进行秘密对比（认证过程）
 *
 *
 *
 * Created by lgz on 2018/7/13.
 */

public class ShiroController {
    //用户登录退出

    /*public static void main(String args[]) {
        //创建securityManager工厂，通过ini配置文件创建securityManager工厂
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-first.ini");
        //创建securityManager
        SecurityManager securityManager = factory.getInstance();
        //将securityManager设置到环境中
        SecurityUtils.setSecurityManager(securityManager);
        //从securiytUtils里创建一个subject
        Subject subject = SecurityUtils.getSubject();
        //在认证提交前准备token（令牌）
        UsernamePasswordToken token = new UsernamePasswordToken("zs","1111");


        //执行认证提交
        try {
            subject.login(token);
        }catch (Exception e){
            e.printStackTrace();
        }
        boolean authenticated = subject.isAuthenticated();
        System.out.println("是否认证通过："+authenticated);


    }*/

    public static void main(String args[]) {
        //创建securityManager工厂，通过ini配置文件创建securityManager工厂
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:fist-realm.ini");
        //创建securityManager
        SecurityManager securityManager = factory.getInstance();
        //将securityManager设置到环境中
        SecurityUtils.setSecurityManager(securityManager);
        //从securiytUtils里创建一个subject
        Subject subject = SecurityUtils.getSubject();
        //在认证提交前准备token（令牌）
        UsernamePasswordToken token = new UsernamePasswordToken("zs","1171");


        //执行认证提交
        try {
            subject.login(token);
        }catch (Exception e){
            e.printStackTrace();
        }
        boolean authenticated = subject.isAuthenticated();
        System.out.println("是否认证通过："+authenticated);


    }
}
