//package com.JavaFinalProject.Feast.Freedom.config;
//
//import java.util.Properties;
//
//import javax.mail.Message;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeMessage;
//
//import org.springframework.stereotype.Service;
//
//@Service
//public class SesConfig {
//	static final String SMTP_USERNAME = "AKIA4D4KAXEKDFOYDKNK";
//    static final String SMTP_PASSWORD = "BFcddLJR4uRVcEm27OKR8mtvolfbNNBmyAwE1RmKBwnV";
//
//    // The name of the Configuration Set to use for this message.
//    // If you comment out or remove this variable, you will also need to
//    // comment out or remove the header below.
//    static final String CONFIGSET = "ConfigSet";
//
//    // Amazon SES SMTP host name. This example uses the US West (Oregon) region.
//    // See https://docs.aws.amazon.com/ses/latest/DeveloperGuide/regions.html#region-endpoints
//    // for more information.
//    static final String HOST = "email-smtp.us-east-1.amazonaws.com";
//
//    private String FROM;
//    private String FROMNAME;
//    private String TO;
//    static final String SUBJECT = "Feast Freedom Confirmation";
//
//    static final String BODY = String.join(
//    	    System.getProperty("line.separator"),
//    	    "<h1>Your order has been placed!</h1>",
//    	    "<p>Thank you for choosing Feast Freedom "
//    	);
//
//    public void setFROM(String from) {
//    	this.FROM = from;
//    }
//
//    public void setFROMNAME(String fromName) {
//    	this.FROMNAME = fromName;
//    }
//
//    public void setTO(String to) {
//    	this.TO = to;
//    }
//
//    public void sendMail() throws Exception{
//    	Properties props = System.getProperties();
//    	 // Create a Session object to represent a mail session with the specified properties.
//    	Session session = Session.getDefaultInstance(props);
//
//        // Create a message with the specified information.
//        MimeMessage msg = new MimeMessage(session);
//        msg.setFrom(new InternetAddress(this.FROM,this.FROMNAME));
//        msg.setRecipient(Message.RecipientType.TO, new InternetAddress(this.TO));
//        msg.setSubject(SUBJECT);
//        msg.setContent(BODY,"text/html");
//
//        // Add a configuration set header. Comment or delete the
//        // next line if you are not using a configuration set
//        msg.setHeader("X-SES-CONFIGURATION-SET", CONFIGSET);
//
//        // Create a transport.
//        Transport transport = session.getTransport();
//
//        // Send the message.
//        try
//        {
//            System.out.println("Sending...");
//
//            // Connect to Amazon SES using the SMTP username and password you specified above.
//            transport.connect(HOST, SMTP_USERNAME, SMTP_PASSWORD);
//
//            // Send the email.
//            transport.sendMessage(msg, msg.getAllRecipients());
//            System.out.println("Email sent!");
//        }
//        catch (Exception ex) {
//            System.out.println("The email was not sent.");
//            System.out.println("Error message: " + ex.getMessage());
//        }
//        finally
//        {
//            // Close and terminate the connection.
//            transport.close();
//        }
//    }
//}
