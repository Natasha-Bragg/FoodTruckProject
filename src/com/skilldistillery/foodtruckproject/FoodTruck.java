package com.skilldistillery.foodtruckproject;

public class FoodTruck {
	private String truckName;
	private String truckType;
	private double truckRating;
	private double nextTruckId;
	private static int truckCounter = 0;

	public FoodTruck(String truckName, String truckType, double truckRating) {
		this.truckName = truckName;
		this.truckType = truckType;
		this.truckRating = truckRating;
		this.nextTruckId = truckCounter;
		truckCounter++;
	}

	public FoodTruck() {

	}

	public int getTruckCounter() {
		return truckCounter;
	}

	public void setTruckCounter(int truckCounter) {
		FoodTruck.truckCounter = truckCounter;
	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String foodType) {
		this.truckType = foodType;
	}

	public double getTruckRating() {
		return truckRating;
	}

	public void setTruckRating(double rating) {
		this.truckRating = rating;
	}

	public double getNextTruckId() {
		return nextTruckId;
	}

	public void setNextTruckId(double nextTruckId) {
		this.nextTruckId = nextTruckId;
	}

	public String toString() {
		String output = "Name: " + truckName + ", Type of Food: " + truckType + ", Rating: " + truckRating;

		return output;
	}

}
