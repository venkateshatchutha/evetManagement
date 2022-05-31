package com.eventmgt.evetManagement.repositories;

import com.eventmgt.evetManagement.Participant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ParticipantRepo extends CrudRepository<Participant,Long> {
}
