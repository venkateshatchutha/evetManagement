package com.eventmgt.evetManagement.repositories;

import com.eventmgt.evetManagement.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {
}
