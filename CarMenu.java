//new class
package com.jspider.CarMenu;

import java.util.Scanner;

import com.jspider.CarOperation.CarOperation;


public class CarMenu {
private static CarOperation carOperation=new CarOperation();
public static void main(String[] args) {
	boolean flag=true;
	while(flag) {
	System.out.println("Enter 1:Add car details\n"
	                      +"Enter 2:search car details\n"
			             +"Enter 3:fetch all car details\n"
			             +"Enter 4:delete car details\n"
			             +"Enter 5:update car details\n"
			             +"Enter 6:Exit");
	
	Scanner scanner=new Scanner(System.in);
	int choice=scanner.nextInt();
	switch(choice) {
	
	case 1:
		 carOperation.addcar(scanner);
		break;
	case 2:
		carOperation.searchCarById(scanner);
		break;
	case 3:
		carOperation.fetchAllcars();
		break;
	case 4:
		carOperation.deleteCar(scanner);
		break;
	case 5:
		carOperation.updateCar(scanner);
		break;
	case 6:
		flag=false;
		System.out.println("Thank you");
	}
	}
}
}
