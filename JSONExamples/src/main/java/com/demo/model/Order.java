package com.demo.model;

public class Order {
	
	private int oid;
	private String name; 
	private boolean isDelivered; 
	private String description;
	
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isDelivered() {
		return isDelivered;
	}
	public void setDelivered(boolean isDelivered) {
		this.isDelivered = isDelivered;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Customer [oid=" + oid + ", name=" + name + ", isDelivered=" + isDelivered + ", description="
				+ description + "]";
	}
}
