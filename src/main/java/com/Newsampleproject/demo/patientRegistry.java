package com.Newsampleproject.demo;

public class patientRegistry {
	private String patient_id;
	private String patient_name;
	private String Age;
	private String Sex;
	private String Problem;
	private String Location;
	public String getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getProblem() {
		return Problem;
	}
	public void setProblem(String problem) {
		Problem = problem;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	@Override
	public String toString() {
		return "patientRegistry [patient_id=" + patient_id + ", patient_name=" + patient_name + ", Age=" + Age
				+ ", Sex=" + Sex + ", Problem=" + Problem + ", Location=" + Location + "]";
	}

	
	

}
