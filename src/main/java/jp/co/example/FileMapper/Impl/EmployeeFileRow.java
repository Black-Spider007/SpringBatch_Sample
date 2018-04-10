package jp.co.example.FileMapper.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jp.co.example.Entity.OutputToDB;
import jp.co.example.Entity.Impl.EmployeeEntity;
import jp.co.example.FileMapper.InputFileRow;

@Component("employeeFileRow")
public class EmployeeFileRow implements InputFileRow {
	private String number;
	private String name;
	private String note;
	
	@Autowired
	EmployeeEntity employeeEntity;
	
	public OutputToDB convertToDB() {
		employeeEntity.setEmployeeNumber(Integer.parseInt(this.getNumber()));
		employeeEntity.setName(this.getName());
		employeeEntity.setNote(this.getNote());
		return employeeEntity;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id = ").append(this.number).append(", name = ").append(this.name).append(", note = ").append(this.note);
		return sb.toString();

	}

}
