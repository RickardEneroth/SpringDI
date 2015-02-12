package se.eneroth.springdi;

/**
 * Created by Rickard on 2015-02-12.
 */
public class TwitterService implements MessageService {

    public void sendMessage(String msg, String rec) {
        System.out.println("Twitter Sent to " + rec +  " with Message=" + msg);
    }
}
