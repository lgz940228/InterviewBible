package com.lgz.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * Created by lgz on 2018/7/14.
 */
public class CoustomRealm extends AuthorizingRealm{
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //第一步 从token中取出身份信息
        String userCode = (String)token.getPrincipal();
        //第二步 根据用户输入的userCode从数据库里查询
        //...
        //模拟从数据库查询的密码
        String password = "111";
        //如果查询不到返回null
        //如果查询刚到返回认证信息AuthorizationInfo
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(userCode,password,"");
        return simpleAuthenticationInfo;
    }
}
