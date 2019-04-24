package com.leroy.wxmin.controller;


import com.leroy.wxmin.Util.HttpUtil;
import com.leroy.wxmin.acceptvo.LoginAcceptVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wx")
public class WxLoginController {

    //登陆接口

    private static String  url = "https://api.weixin.qq.com/sns/jscode2session?";

    private static String appId = "appid=wxd3fffcf72959056e";
    private static String serect = "secret=9318790099bfb3d9d44a3db2b510426a";
    private static String grant_type = "grant_type=authorization_code";

    @PostMapping("/login")
    public String login(@RequestBody  LoginAcceptVO loginAcceptVO){
        String js_code = loginAcceptVO.getCode();
        url = url+appId+"&"+serect+"&"+"js_code="+js_code+"&"+grant_type;
        String res = HttpUtil.doGet(url);

        return res;
    }
}
