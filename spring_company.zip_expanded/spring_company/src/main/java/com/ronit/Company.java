package com.ronit;

import java.sql.Date;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ronit.repositories.JobRepository;
import com.ronit.beans.Employee;
import com.ronit.beans.Job;
import com.ronit.repositories.EmployeeRepository;



@Service
@Transactional
public class Company {
		
	private JobRepository jobrepository;
	private EmployeeRepository employeerepository;

	@Autowired
	public Company(EmployeeRepository employeerepository, JobRepository jobrepository) {
		this.employeerepository = employeerepository;
		this.jobrepository = jobrepository;
	}

	public void addEmployee(Employee employee) {
		employeerepository.save(employee);
	}

	public Employee getEmployeeById(long id) {
		return employeerepository.findById(id);
		
	}
	public Employee getEmployeeByName(String name) {
		return employeerepository.findByName(name);
		
	}
	public List<Employee> getAllEmployees() {
		return employeerepository.findAll();
		
	}
	public List<Job> getAllJobs() {
		return jobrepository.findAll();
		
	}

	public List<Job> getJobsBetween2Dates(Date jobDate1, Date jobDate2) {
		return jobrepository.findByEndDateBetween(jobDate1, jobDate2);

	}
	
	public List<Job> getJobsByEndDate(Date end_date) {
		return jobrepository.findByEndDate(end_date);


	}
	
	// add jobs to existing employees
	public void addJobsToEmployee(long employeeId, List<Job> jobs) {
		Employee employee = employeerepository.findById(employeeId);
		jobs.addAll(employee.getJobs());
		employee.setJobs(jobs);
	}
	
	// add one job to existing employees
	public void addOneJobToEmployee(long employeeId, Job job) {
		Employee employee = employeerepository.findById(employeeId); 
		employee.addJob(job);
	}
}



