package com.sping.domain4.repository;

import com.sping.domain4.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends
        JpaRepository<Event, Long>{

}
