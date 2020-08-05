package com.kosarev.goitspring.config;

import com.kosarev.goitspring.domain.EventType;
import com.kosarev.goitspring.logger.CombinedEventLogger;
import com.kosarev.goitspring.logger.ConsoleEventLogger;
import com.kosarev.goitspring.logger.EventLogger;
import com.kosarev.goitspring.logger.FileEventLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
@ComponentScan("com.kosarev.goitspring")
public class CollectionConfig {

    @Autowired
    private ConsoleEventLogger consoleEventLogger;

    @Autowired
    private FileEventLogger fileEventLogger;

    @Autowired
    private CombinedEventLogger combinedEventLogger;

    @Bean
    public Map<EventType, EventLogger> loggerMap() {
        return Map.of(EventType.INFO, consoleEventLogger, EventType.ERROR, combinedEventLogger);
    }


}
