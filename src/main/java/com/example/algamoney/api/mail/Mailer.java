package com.example.algamoney.api.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.Arrays;
import java.util.List;

@Component
public class Mailer {

    @Autowired
    private JavaMailSender mailSender;

//    @EventListener
//    public void  teste(ApplicationReadyEvent event) {
//        this.enviarEmail("testes.algaworks@gmail.com",
//                Arrays.asList("alves.joceano@gmail.com"), "Testando", "Olá!<br/>Teste ok.");
//        System.out.println("Terminado o envio .......");
//    }

    public void enviarEmail(String remetente, List<String> destinatarios, String assunto, String mensagem) {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "UTF-8");
        try {
            helper.setFrom(remetente);
            helper.setTo(destinatarios.toArray(new String[destinatarios.size()]));
            helper.setSubject(assunto);
            helper.setText(mensagem, true);
            mailSender.send(mimeMessage);
        } catch (MessagingException e) {
            throw new RuntimeException("Problemas com o envio de e-mail", e);
        }

    }
}
