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
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;

@Configuration
@ComponentScan("com.kosarev.goitspring")
@PropertySource("classpath:client.properties")
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

    @Bean
    public List<EventLogger> loggers() {
        return List.of(consoleEventLogger, consoleEventLogger);
    }

}
