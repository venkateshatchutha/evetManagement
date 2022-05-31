package com.eventmgt.evetManagement.repositories;

import com.eventmgt.evetManagement.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface EventRepository extends CrudRepository<Event, Long> {
    Optional<Event> findById(int id);
}
