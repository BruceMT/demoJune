package com.springboot.service;
import com.springboot.common.validateUtil.sendToMail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * @author: Weibin Ma
 * @create: 2020-07-16 15:12:09
 * @description: mailSender Demo
 */
@Service
public class sendMessageService {

    @Autowired
    private JavaMailSender javaMailSender;

    /**
     * 
     * @Param: [email, username, message]
     * @return: boolean
     */
    public boolean sendMessageForMe(String email, String username, String message) {
        //send message mail
        sendToMail.sendSimpleMail(javaMailSender,email,username,message);
        return true;
    }
}

