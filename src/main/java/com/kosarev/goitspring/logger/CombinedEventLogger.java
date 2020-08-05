package com.kosarev.goitspring.logger;

import com.kosarev.goitspring.domain.Event;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CombinedEventLogger extends FileEventLogger implements EventLogger{

    private List<EventLogger> loggers;

    public CombinedEventLogger(String fileName, List<EventLogger> loggers) {
        super(fileName);
        this.loggers = loggers;
    }

    public List<EventLogger> getLoggers() {
        return loggers;
    }

    public void setLoggers(List<EventLogger> loggers) {
        this.loggers = loggers;
    }

    @Override
    public void logEvent(Event event) {
        System.out.println(event.toString());
        super.logEvent(event);

    }
}
