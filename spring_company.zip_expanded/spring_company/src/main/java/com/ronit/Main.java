package com.ronit;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ronit.beans.Employee;
import com.ronit.beans.Job;
import com.ronit.repositories.EmployeeRepository;
import com.ronit.repositories.JobRepository;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Main.class);
		EmployeeRepository employeerepository = context.getBean(EmployeeRepository.class);
		JobRepository jobrepository = context.getBean(JobRepository.class);

//  add new employees + jobs
//		List<Job> jobs = new ArrayList<Job>();
//		Date JobDate = java.sql.Date.valueOf("2021-11-11");
//		jobs.add(new Job("do something1", JobDate));
//		jobs.add(new Job("do something2", JobDate));
//		jobrepository.save(new Job("do something...", JobDate));	
//		Employee Will = new Employee(3.2, "Will", jobs);
//		Will.setJobs(jobs);
//		employeerepository.save(Will);
//		
//		List<Job> jobs2 = new ArrayList<Job>();
//		Date JobDate2 = java.sql.Date.valueOf("2021-9-11");
//		jobs2.add(new Job("do something1", JobDate2));
//		jobs2.add(new Job("do something2", JobDate2));
//		jobrepository.save(new Job("do something...", JobDate2));	
//		Employee Jane = new Employee(3.2, "Jane", jobs2);
//		Jane.setJobs(jobs2);
//		employeerepository.save(Jane);

		{
//  add jobs to existing employees
//			Company company = context.getBean(Company.class);
//			Job job1 = new Job("do something3", Date.valueOf(LocalDate.of(2021, 10, 20)));
//			Job job2 = new Job("do something4", Date.valueOf(LocalDate.of(2021, 10, 15)));
//			List<Job> list = new ArrayList<Job>();
//			list.add(job1);
//			list.add(job2);
//			company.addJobsToEmployee(1, list);

		}
		
//  add job to existing employees
		Company company = context.getBean(Company.class);
//		Job job3 = new Job("do something5", Date.valueOf(LocalDate.of(2021, 10, 20)));
//		Job Job4 = new Job("do something6", Date.valueOf(LocalDate.of(2021, 10, 15)));
//		Job job5 = new Job("do something7", Date.valueOf(LocalDate.of(2021, 10, 15)));
//
//		company.addOneJobToEmployee(1,job3);
//		company.addOneJobToEmployee(1,Job4);
//		company.addOneJobToEmployee(1,job5);
		
//  getJobsBetween2Dates
//		Date JobDate1 = java.sql.Date.valueOf("2021-9-11");
//		Date JobDate2 = java.sql.Date.valueOf("2021-11-11");
//		List<Job> jobs = company.getJobsBetween2Dates(JobDate2, JobDate1);
		
// getAllEmployees
//		List<Employee> Employees = company.getAllEmployees();
//		System.out.println(Employees);
//		
// getEmployeeByName
//		Employee e = company.getEmployeeByName("Jane");
//		System.out.println(e);	
		
// getEmployeeById
//		Employee Employees = company.getEmployeeById(1);
//		System.out.println(Employees);
		
// getAllJobs
//		List<Job> jobs = company.getAllJobs();
//		System.out.println(jobs);


	}

}
