package com.xmz.controller;

import com.xmz.pojo.Message;
import com.xmz.utils.SendMail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author liyuefan
 * @Date ${Date}
 * Description
 */
@Controller
public class UsersController {

    @RequestMapping("/sendMail")
    @ResponseBody
    public Message sendMail(String email){
        SendMail operation = new SendMail();
        String user = "liyuefan0214@163.com";
        String password = "aptx4869";
        String host = "smtp.163.com";
        String from = "liyuefan0214@163.com";
        String to = email;// 收件人
        String subject = "邮箱验证码";
        //邮箱内容
        StringBuffer sb = new StringBuffer();
        String code = (int)Math.floor(Math.random() * 999999) + "";
        sb.append("<!DOCTYPE>"+"<div bgcolor='#f1fcfa'   style='border:1px solid #d9f4ee; font-size:14px; line-height:22px; color:#005aa0;padding-left:1px;padding-top:5px;   padding-bottom:5px;'><span style='font-weight:bold;'>温馨提示：</span>"
                + "<div style='width:950px;font-family:arial;'>您的验证码为：<br/><h2 style='color:green'>"+ code +"</h2><br/>本邮件由系统自动发出，请勿回复。<br/>谢谢。<br/>GuitarWeb项目组有限公司</div>"
                +"</div>");
        try {
            String res = operation.sendMail(user, password, host, from, to,
                    subject, sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return Message.fail().add("EmailInfo","发送异常");
        }
        return Message.success().add("EmailInfo","发送成功").add("code",code);
    }

}
