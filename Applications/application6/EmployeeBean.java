package com.evergent.corejava.divya.application6;

public class EmployeeBean {
    private int Id;
    private String Name;
    private double Number;
    private boolean isAvailable;

    public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getNumber() {
		return Number;
	}

	public void setNumber(double number) {
		Number = number;
	}

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
