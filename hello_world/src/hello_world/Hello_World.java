//In this code the user can enter his name and based on the time of day it
//is the user will get a different greeting
//The code was wrote by Domantas Gricius

package hello_world;

import java.time.LocalTime;
import java.util.Scanner;

public class Hello_World {

	public static void main(String[] args) {
		Scanner NameEnter = new Scanner(System.in);
		System.out.println("Can you tell me your name?");
		
		String Name = NameEnter.nextLine();
		
		
		LocalTime valanda = LocalTime.now();
		int hour = valanda.getHour();
		if (hour > 5  && hour <= 12) {
			System.out.println("good morning " + Name);
		}else if(hour > 12 && hour <= 18) {
			System.out.println("Good afternoon " + Name);
		}else if(hour > 18 && hour >= 5) {
			System.out.println("Good evening " + Name);
		}
		
	}
	
}

