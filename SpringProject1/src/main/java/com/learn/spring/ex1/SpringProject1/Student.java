package com.learn.spring.ex1.SpringProject1;

public class Student {
	int roll_no;
	String name;
	int yop;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll_no, String name, int yop) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.yop = yop;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", yop=" + yop + "]";
	}
	

}
