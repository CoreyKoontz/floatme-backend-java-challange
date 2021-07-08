package com.floatme.floatme.repositories;

import com.floatme.floatme.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepo extends JpaRepository<Person, Long> {
}
