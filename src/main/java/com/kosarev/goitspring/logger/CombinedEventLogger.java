package com.kosarev.goitspring.logger;

import com.kosarev.goitspring.domain.Event;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class CombinedEventLogger extends FileEventLogger implements EventLogger{

    @Autowired
    private List<EventLogger> loggers;

    @Override
    public void logEvent(Event event) {
        System.out.println(event.toString());
        super.logEvent(event);

    }
}
