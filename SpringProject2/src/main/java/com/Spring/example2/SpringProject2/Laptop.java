package com.Spring.example2.SpringProject2;

public class Laptop {
	int serial_no;
	String brand;
	int price;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int serial_no, String brand, int price) {
		super();
		this.serial_no = serial_no;
		this.brand = brand;
		this.price = price;
		}
	
	public int getSerial_no() {
		return serial_no;
	}
	public void setSerial_no(int serial_no) {
		this.serial_no = serial_no;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [serial_no=" + serial_no + ", brand=" + brand + ", price=" + price + "]";
	}
	

}
