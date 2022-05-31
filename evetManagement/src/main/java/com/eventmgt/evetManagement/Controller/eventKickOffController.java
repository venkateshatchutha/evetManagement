package com.eventmgt.evetManagement.Controller;

import com.eventmgt.evetManagement.Event;
import com.eventmgt.evetManagement.Organizer;
import com.eventmgt.evetManagement.repositories.EventRepository;
import com.eventmgt.evetManagement.repositories.OrganizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.server.PathParam;
import java.util.Optional;
import java.lang.*;


@RepositoryRestController

public class eventKickOffController {
    @Autowired
    EventRepository eventRepository;
    @Autowired
    OrganizerRepository organizerRepository;
    @GetMapping("/organizers/{id}")
    public ResponseEntity getorg(@PathVariable Long id, PersistentEntityResourceAssembler assembler){
        Optional<Organizer> Oevent= organizerRepository.findById(id);
        Organizer organizer =Oevent.get();
        organizer.setName("updated");
        organizerRepository.save(organizer);
        Oevent= organizerRepository.findById(id);
        organizer =Oevent.get();
        return ResponseEntity.ok(assembler.toFullResource(organizer));
    }

    @GetMapping("/events")
    public ResponseEntity getevents(){
        Optional<Event> Oevent= eventRepository.findById(new Long(1));
       return ResponseEntity.ok("saf");
    }
    @GetMapping("/events/{id}")
    public ResponseEntity getEvents(@PathVariable long id){
        Optional<Event> Oevent= eventRepository.findById(id);
        return ResponseEntity.ok(Oevent);
//        if(Oevent != null){
//            Event event = (Event) Oevent.get();
//            return ResponseEntity.ok(Oevent);
//        }
//        return null;
    }
}
