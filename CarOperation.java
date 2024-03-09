//new class
package com.jspider.CarOperation;

import java.util.ArrayList;
import java.util.Scanner;

import com.jspider.CarDekho.Car;

public class CarOperation {
ArrayList <Car> cars=new ArrayList<>();
	
	public void addcar(Scanner scanner)
	{

		Car car =new Car();
		System.out.println("Enter car id");
		int id=scanner.nextInt();
		car.setId(id);
		System.out.println("Enter car name");
		String name=scanner.next();
		car.setName(name);
		System.out.println("Enter car fuleType");
		String fuleType=scanner.next();
		car.setFuelType(fuleType);
		System.out.println("Enter car brande");
		String brande=scanner.next();
		car.setBrand(brande);
		System.out.println("Enter car model");
		String model=scanner.next();
		car.setModel(model);
		System.out.println("Enter car color");
		String color=scanner.next();
		car.setColour(color);
		System.out.println("Enter car price");
	    Double price=scanner.nextDouble();	
		car.setPrice(price);
	}
	public void searchCarById(Scanner scanner) {
		
		boolean flag=false;
		System.out.println("Enter id number");
		int id=scanner.nextInt();
		for(Car car:cars) {
		if(car.getId()==id) {
			System.out.println(car);
			flag=true;
			break;
			}
		if(!flag){
			System.out.println("Car not found");
			
		}
		}
	}
	public void fetchAllcars() {
		if(cars.size()>0) {
			for(Car car:cars) {
				System.out.println(car);
			}
		}
		else {
			System.out.println("Cars not found");
		}
	}
	public void deleteCar(Scanner scanner) {
		boolean flag =false;
		System.out.println("Enter id ");
		int id=scanner.nextInt();
		for(Car car:cars) {
			if(car.getId()==id) {
				flag=true;
				cars.remove(car);
				System.out.println("car details deleted");
				break;
			}
		}
		if(!flag) {
			System.out.println("car not found");
		}
		
	}
	public void updateCar(Scanner scanner) {
		boolean flag=false;
		System.out.println("enter car id");
		int id=scanner.nextInt();
		for(Car car:cars) {
			if(car.getId()==id) {
				flag=true;
				System.out.println("enter new price");
				double price=scanner.nextDouble();
				car.setPrice(price);
				
				
			}
		}
		if(!flag) {
			System.out.println("car not found");
		}
	}
}
