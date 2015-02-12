package se.eneroth.springdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Rickard on 2015-02-12.
 */
@Component
public class MyApplication {
    private MessageService service;

    @Autowired
    public void setService(MessageService service) {
        this.service = service;
    }

    public void processMessage(String msg, String rec) {
        this.service.sendMessage(msg, rec);
    }
}
