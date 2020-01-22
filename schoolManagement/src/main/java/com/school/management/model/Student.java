package com.school.management.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "student")
public class Student implements Serializable{
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int sId;
	@Column(name = "student_name")
	protected String name;
	protected int age;
	protected String gender;
	protected int standard;
	@Column(name = "contact_no")
	protected String contactNo;
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	@OneToMany
	@JoinColumn(name = "sId")
	protected List<Address> address;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", name=" + name + ", age=" + age + ", gender=" + gender + ", standard="
				+ standard + ", contactNo=" + contactNo + ", address=" + address + "]";
	}
}
