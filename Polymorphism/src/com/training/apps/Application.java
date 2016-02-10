package com.training.apps;

import java.util.Scanner;

import com.training.domains.NewShowRoom;
import com.training.domains.ShowRoom;
import com.training.ifaces.Automobile;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowRoom showRoom = new ShowRoom();
		NewShowRoom newShowRoom = new NewShowRoom();
		Automobile polyAuto = null;
		int key=0;
		Scanner sin = new Scanner(System.in);
		
		do{
			System.out.println("Select the type of car:");
			System.out.println("1. Passenger Car");
			System.out.println("2. Luxury Car");
			System.out.println("3. Sports Car");
			System.out.println("4. Sports Bike");
			System.out.println("5. Exit");
			key = sin.nextInt();
			
			if(key == 1 || key == 2 || key == 3) {
				polyAuto = showRoom.getItem(key);
				showRoom.printQuote(polyAuto);
			}
			if (key == 4) {
				polyAuto = newShowRoom.getItem(key);
				newShowRoom.printQuote(polyAuto);
			}
			if(key >= 5) {
				System.out.println("You have Exited.");
			}
		}while(key < 5);
	}

}
