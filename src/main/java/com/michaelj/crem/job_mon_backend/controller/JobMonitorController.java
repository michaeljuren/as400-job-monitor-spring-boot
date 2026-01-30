package com.michaelj.crem.job_mon_backend.controller;

import com.michaelj.crem.job_mon_backend.dao.JobMonitorDAO;
import com.michaelj.crem.job_mon_backend.model.JobMonitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/job-monitor")
public class JobMonitorController {
    private static final Logger logger = LoggerFactory.getLogger(JobMonitorController.class);

    private final JobMonitorDAO jobMonitorDAO;

    public JobMonitorController(JobMonitorDAO jobMonitorDAO) {
        this.jobMonitorDAO = jobMonitorDAO;
    }

    @GetMapping
    public List<JobMonitor> findAll() {
        logger.debug("Find all active jobs");
        System.out.println("Find all active jobs");

        List<JobMonitor> jobMonitorsList = jobMonitorDAO.findAll();
        logger.debug("Found {} person", jobMonitorsList.size());
        System.out.println("Found " + jobMonitorsList.size() + " jobs");

        return jobMonitorsList;
    }
}
