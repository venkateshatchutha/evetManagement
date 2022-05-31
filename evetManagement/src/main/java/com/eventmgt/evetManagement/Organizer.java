package com.eventmgt.evetManagement;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@JsonPropertyOrder({"resourceId"})  // changes the json output attributes ordering
public class Organizer extends AbstractEntity{
    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public boolean equals(Object obj){
        return Objects.equals(this.id,((Organizer) obj).id);
    }

    public int hashCode (){
        return Objects.hash(this.id);
    }

    public Long getResourceId() {
        return this.id;
    }

    private String name;
    @OneToMany(mappedBy = "organizer")
    private Set<Event> events;

}
