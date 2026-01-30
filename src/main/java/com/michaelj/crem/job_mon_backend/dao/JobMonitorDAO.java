package com.michaelj.crem.job_mon_backend.dao;

import com.michaelj.crem.job_mon_backend.model.JobMonitor;

import java.util.List;

public interface JobMonitorDAO {
    List<JobMonitor> findAll();

    JobMonitor findByJobNumber(String jobNumber);
}
