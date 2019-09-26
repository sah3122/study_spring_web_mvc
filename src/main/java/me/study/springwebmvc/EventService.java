package me.study.springwebmvc;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EventService {

    public List<Event> getEvents() {
        Event event = Event.builder()
                .name("stpring web mvc study")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2019, 1, 10 ,10, 0))
                .startDateTime(LocalDateTime.of(2019, 1, 10 ,12, 0))
                .build();

        Event event2 = Event.builder()
                .name("stpring web mvc study2")
                .limitOfEnrollment(5)
                .startDateTime(LocalDateTime.of(2019, 1, 17 ,10, 0))
                .startDateTime(LocalDateTime.of(2019, 1, 17 ,12, 0))
                .build();

        return List.of(event, event2);
    }
}
