package com.floatme.floatme.repositories;

import com.floatme.floatme.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepo extends JpaRepository<Job, Long> {
}
