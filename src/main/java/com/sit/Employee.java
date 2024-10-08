package com.sit;

public class Employee {
	private int id;
	private String name;
	private Address addr;

	// def con
	public Employee() {
		System.out.println("def con");
	}

	// toString

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", addr=" + addr + "]";
	}

}
