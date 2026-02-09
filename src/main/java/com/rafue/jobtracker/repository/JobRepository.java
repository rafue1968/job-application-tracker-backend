package com.rafue.jobtracker.repository;

import com.rafue.jobtracker.model.Job;
import com.rafue.jobtracker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository <Job, Long> {

    List<Job> findByUser(User user);
    
}
