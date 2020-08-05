package com.kosarev.goitspring.logger;

import com.kosarev.goitspring.domain.Event;

public interface EventLogger {
    public void logEvent(Event message);
}
