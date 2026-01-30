package com.michaelj.crem.job_mon_backend.dao.implementation;

import com.michaelj.crem.job_mon_backend.dao.JobMonitorDAO;
import com.michaelj.crem.job_mon_backend.model.JobMonitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JobMonitorDAOImpl implements JobMonitorDAO {
    private static final Logger log = LoggerFactory.getLogger(JobMonitorDAOImpl.class);

    private final JdbcTemplate jdbcTemplate;

    public JobMonitorDAOImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<JobMonitor> findAll() {
        System.out.println("current active jobs");
        String sql = "Select JOBNAME, JOBUSER, JOBNUMBER, JOBTYPE, JOBSTATUS, SUBSYSTEM, " +
                     "JOBSTRTIM, CPUUSED, LASTUPDATE From MULIB/ACTJOBPF";
        return jdbcTemplate.query(sql, rowMapper);
    }

    @Override
    public JobMonitor findByJobNumber(String jobNumber) {
        return null;
    }

    RowMapper<JobMonitor> rowMapper = (rs, rowNum) -> {
        JobMonitor jobInfo = new JobMonitor();
        jobInfo.setJobName(rs.getString("JOBNAME").trim());
        jobInfo.setJobUser(rs.getString("JOBUSER").trim());
        jobInfo.setJobNumber(rs.getString("JOBNUMBER").trim());
        jobInfo.setJobType(rs.getString("JOBTYPE").trim());
        jobInfo.setJobStatus(rs.getString("JOBSTATUS").trim());
        jobInfo.setJobSystem(rs.getString("SUBSYSTEM").trim());
        jobInfo.setJobSubmitTime(rs.getTimestamp("JOBSTRTIM"));
        jobInfo.setCpuUsed(rs.getBigDecimal("CPUUSED"));
        jobInfo.setJobStartTime(rs.getTimestamp("LASTUPDATE"));

        return jobInfo;
    };
}
