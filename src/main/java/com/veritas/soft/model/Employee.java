package com.veritas.soft.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer eno;
	private String ename;
	private Double salary;
	private Double taxamount;
	private Double netsalary;

}
