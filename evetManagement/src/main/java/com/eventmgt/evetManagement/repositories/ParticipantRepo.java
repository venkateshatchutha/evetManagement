package com.eventmgt.evetManagement.repositories;

import com.eventmgt.evetManagement.Participant;
import org.springframework.data.repository.CrudRepository;

public interface ParticipantRepo extends CrudRepository<Participant,Long> {
}
