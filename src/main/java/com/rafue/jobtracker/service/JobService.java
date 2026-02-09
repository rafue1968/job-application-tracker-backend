package com.rafue.jobtracker.service;

import com.rafue.jobtracker.model.Job;
import com.rafue.jobtracker.model.User;
import com.rafue.jobtracker.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository){
        this.jobRepository = jobRepository;
    }

    public Job saveJob(Job job){
        return jobRepository.save(job);
    }

    public List<Job> getAllJobs(){
        return jobRepository.findAll();
    }

    public Optional<Job> getJobById(Long id) {
        return jobRepository.findById(id);
    }

    public void deleteJob(Long id){
        jobRepository.deleteById(id);
    }

    // public List<Job> getJobByStatus(String status){
    //     return jobRepository.findByStatus(status);
    // }
}