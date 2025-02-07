package org.comit.course._06_practice;

public class TrafficLight {
	private String color;
	private int duration;

	// Parameterized Constructor
	public TrafficLight(String color, int duration) {
		this.color = color;
		this.duration = duration;
	}

	// Method to change color automatically
	public void changeColor() {
		if (color.equalsIgnoreCase("Red")) {
			color = "Green";
		} else if (color.equalsIgnoreCase("Green")) {
			color = "Red";
		}
	}

	// Method to check if the light is red
	public boolean isRed() {
		return color.equalsIgnoreCase("Red");
	}

	// Method to check if the light is green
	public boolean isGreen() {
		return color.equalsIgnoreCase("Green");
	}

	// Method to display the traffic light status
	public void displayStatus() {
		System.out.println("Traffic Light is " + color + " for " + duration + " seconds.");
	}
}
