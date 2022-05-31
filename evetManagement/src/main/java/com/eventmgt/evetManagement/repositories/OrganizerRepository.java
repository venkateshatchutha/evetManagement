package com.eventmgt.evetManagement.repositories;

import com.eventmgt.evetManagement.Organizer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer,Long> {
    public List<Organizer> findByName(@Param("name") String name); //http://localhost:8080/event-api/organizers/search/findByName?name=gfd
    public List<Organizer> findByNameLike(@Param("name") String name);
    //public List<Organizer> findByNameContains(@Param("name") String name);
    public Page<Organizer> findByNameContains(@Param("name") String name, Pageable pageable);
    public Page<Organizer> findByNameAndId(@Param("name") String name,@Param("resourceId") int id, Pageable pageable);
}
