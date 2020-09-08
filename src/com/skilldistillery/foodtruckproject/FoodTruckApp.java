package com.skilldistillery.foodtruckproject;

import java.util.Scanner;

public class FoodTruckApp {

	FoodTruck[] truckArray = new FoodTruck[5];

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		FoodTruckApp foodTruck = new FoodTruckApp();

		foodTruck.trucksInput(keyboard);

		foodTruck.callMenu(keyboard);

	}

	public void callMenu(Scanner keyboard) {
		System.out.println();
		System.out.println("--------------------MENU--------------------");
		System.out.println();
		System.out.println("Please choose one of the following options:");
		System.out.println("1 . List all food trucks.");
		System.out.println("2 . See the average rating of the food trucks.");
		System.out.println("3 . Display the highest-rated food truck.");
		System.out.println("4 . Quit the program.");
		int userInput = keyboard.nextInt();
		switch (userInput) {
		case 1:
			this.countTrucks(this.truckArray);
			System.out.println();
			callMenu(keyboard);
			System.out.println();
			break;
		case 2:
			this.averageRating(this.truckArray);
			System.out.println();
			callMenu(keyboard);
			System.out.println();
			break;
		case 3:
			this.highestRated(this.truckArray);
			System.out.println();
			callMenu(keyboard);
			System.out.println();
			break;
		case 4:
			System.out.println("Goodbye");
			break;
		}

	}

	public void trucksInput(Scanner keyboard) {

		for (int i = 0; i < this.truckArray.length; i++) {
			System.out.println(
					"Please enter the name of a Food Truck you would like to review. Or enter 'quit' to see the menu.");
			String truckName1 = keyboard.next();
			if (!truckName1.equals("quit")) {
				System.out.println("Please enter the type of food " + truckName1 + " serves.");
				String truckType1 = keyboard.next();
				System.out
						.println("Please enter the rating on a scale of 1-5 stars 1 star = Poor, 5 stars = Excellent");
				double truckRating1 = keyboard.nextDouble();
				FoodTruck truckOne = new FoodTruck(truckName1, truckType1, truckRating1);
				this.truckArray[i] = truckOne;
			}

			else {
				break;
			}
		}
	}

	public void countTrucks(FoodTruck[] trucks) {
		for (int i = 0; i < trucks.length; i++) {
			if (trucks[i] == null) {
				continue;
			}
			System.out.println(trucks[i]);
		}
	}

	public void averageRating(FoodTruck[] truckRating) {
		double sum = 0;
		double ave = 0;
		int counter = 0;

		for (int i = 0; i < truckRating.length; i++) {
			if (truckRating[i] != null) {
				double aveRating = truckRating[i].getTruckRating();
				sum += aveRating;
				counter = i + 1;
			}
		}

		ave = sum / counter;
		System.out.println("The average rating of all food trucks combined is: " + ave);

	}

	public void highestRated(FoodTruck[] truckRating) {

		double topRating = 0;
		int index = 0;
		for (int i = 0; i < truckRating.length; i++) {

			if (truckRating[i] != null) {
				if (truckRating[i].getTruckRating() > topRating) {
					topRating = truckRating[i].getTruckRating();
					index = i;
				}

			}
		}
		System.out.println(truckRating[index]);

	}

}
