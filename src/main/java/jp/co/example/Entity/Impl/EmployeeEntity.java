package jp.co.example.Entity.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.co.example.DbMapper.Employee;
import jp.co.example.DbMapper.EmployeeMapper;
import jp.co.example.Entity.OutputToDB;

@Repository
public class EmployeeEntity extends Employee implements OutputToDB {
	@Autowired
	private EmployeeMapper employeeMapper;

	public void insertThisRecord() {
		employeeMapper.insertSelective(this);
		
	}
}
