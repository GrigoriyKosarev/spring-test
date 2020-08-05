package com.kosarev.goitspring.logger;

import com.kosarev.goitspring.domain.Event;
import org.springframework.stereotype.Component;

@Component
public class ConsoleEventLogger implements EventLogger{

    public void logEvent(Event event) {
        System.out.println(event.toString());
    }
}
