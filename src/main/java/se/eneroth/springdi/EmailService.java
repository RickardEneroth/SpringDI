package se.eneroth.springdi;

/**
 * Created by Rickard on 2015-02-12.
 */
public class EmailService implements MessageService {

    public void sendMessage(String msg, String rec) {
        System.out.println("Email Sent to " + rec +  " with Message=" + msg);
    }
}
