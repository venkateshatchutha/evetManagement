package com.eventmgt.evetManagement.repositories;

import com.eventmgt.evetManagement.Venue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VenueRepositry extends PagingAndSortingRepository<Venue, Long> {

}
