package com.michaelj.crem.job_mon_backend.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class JobMonitor {
    private String jobName;
    private String jobUser;
    private String jobNumber;
    private String jobType;
    private String jobStatus;
    private String jobSystem;
    private Timestamp jobSubmitTime;
    private BigDecimal cpuUsed;
    private Timestamp jobStartTime;

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobUser() {
        return jobUser;
    }

    public void setJobUser(String jobUser) {
        this.jobUser = jobUser;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public String getJobSystem() {
        return jobSystem;
    }

    public void setJobSystem(String jobSystem) {
        this.jobSystem = jobSystem;
    }

    public Timestamp getJobSubmitTime() {
        return jobSubmitTime;
    }

    public void setJobSubmitTime(Timestamp jobSubmitTime) {
        this.jobSubmitTime = jobSubmitTime;
    }

    public BigDecimal getCpuUsed() {
        return cpuUsed;
    }

    public void setCpuUsed(BigDecimal cpuUsed) {
        this.cpuUsed = cpuUsed;
    }

    public Timestamp getJobStartTime() {
        return jobStartTime;
    }

    public void setJobStartTime(Timestamp jobStartTime) {
        this.jobStartTime = jobStartTime;
    }

    @Override
    public String toString() {
        return "JobMonitor{" +
                "jobName='" + jobName + '\'' +
                ", jobUser='" + jobUser + '\'' +
                ", jobNumber='" + jobNumber + '\'' +
                ", jobType='" + jobType + '\'' +
                ", jobStatus='" + jobStatus + '\'' +
                ", jobSystem='" + jobSystem + '\'' +
                ", jobSubmitTime=" + jobSubmitTime +
                ", cpuUsed=" + cpuUsed +
                ", jobStartTime=" + jobStartTime +
                '}';
    }
}
