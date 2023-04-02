package com.sping.domain4.repository;

import com.sping.domain4.domain.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface PlaceRepository extends
        JpaRepository<Place, Long>,
        QuerydslPredicateExecutor<Place>{

}
