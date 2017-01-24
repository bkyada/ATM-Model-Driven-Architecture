package Project.Account.IP;

import java.io.IOException;
import java.util.Scanner;

public class AccountDriver {
	private static Scanner in;
	public static void main(String[] args) throws IOException{
		
		System.out.println("================================");
		System.out.println("Author: Bharatiben Kyada.");
		System.out.println("CWID - A20353636");
		System.out.println("================================");
		System.out.println("Welcome!!");
		System.out.println("Please Choose Account type from below : ");
		System.out.println("1. Account");
		System.out.println("2. Account");
		in = new Scanner(System.in);
		int i = in.nextInt();
		switch (i) {
		case 1 : 
			Account1Driver a1 = new Account1Driver();
			a1.start();
			break;
	
		case 2 :
			Account2Driver a2 = new Account2Driver();
			a2.start();
			break;
			
		default :
			System.out.println("Please input number:1 or 2 ");
			break;
		}

	}
}
