package com.kosarev.goitspring.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.util.Date;

@Data
@Component
public class Event {


    private Long id;

    private String message;
    private Date date;
    private DateFormat dateFormat;

    public Event(Date date, DateFormat dateFormat) {
        this.date = date;
        this.dateFormat = dateFormat;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", date=" + dateFormat.format(date) +
                '}';
    }
}
