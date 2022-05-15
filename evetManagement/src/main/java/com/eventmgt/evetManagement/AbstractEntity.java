package com.eventmgt.evetManagement;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.Instant;

@MappedSuperclass
public abstract class AbstractEntity {


    @Id
    @Column(nullable = false,updatable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @CreationTimestamp
    @Column(updatable = false)
    protected Instant created;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getCreated() {
        return created;
    }

    public void setCreated(Instant created) {
        this.created = created;
    }
}
