package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class crudEntity {
	@Id
	private long studentId;
	@Column
	private String sName;

	@Column
	private int sMarks;

	@Column
	private String sCityName;

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsMarks() {
		return sMarks;
	}

	public void setsMarks(int sMarks) {
		this.sMarks = sMarks;
	}

	public String getsCityName() {
		return sCityName;
	}

	public void setsCityName(String sCityName) {
		this.sCityName = sCityName;
	}
	
	

}
