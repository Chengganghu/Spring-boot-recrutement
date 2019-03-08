package com.bloom.recrutement.service;



import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class ServiceEmail {
    public static final String Username = "bloom-recrute";
    public static final String Password = "Worldline";

    public void config() throws MessagingException {
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "relay-smtp.priv.atos.fr");
        prop.put("mail.debug", "true");
        prop.put("mail.smtp.port", "25");

        Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(Username,Password);
            }
        });
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress("worldline-hu@gmail.com"));
        message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("chengganghu@outlook.com"));
        message.setSubject("Test mail spring boot");

        String msg = "This is my first email using JavaMailer";

        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        mimeBodyPart.setContent(msg, "text/html");

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(mimeBodyPart);

        message.setContent(multipart);

        Transport.send(message);
    }


}
