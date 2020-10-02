package com.springboot.common.validateUtil;


import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * @author: Weibin Ma
 * @create: 2020-07-16 15:12:09
 * @description: mailSender Demo
 */
public class sendToMail{

    public static void sendSimpleMail(JavaMailSender javaMailSender, String email,String username, String message){

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        //mail sender
        simpleMailMessage.setFrom("mwb702"+"<"+"mwb201712228@outlook.com"+">");
        //Recipient mailbox
        simpleMailMessage.setTo(email);
        //title of mail
        simpleMailMessage.setSubject("new message");
        //mail content
        simpleMailMessage.setText(username+" : "+message);
		//sending
        javaMailSender.send(simpleMailMessage);
    }
}
