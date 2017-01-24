package Project.Account.IP;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import Project.Account.State.MDAEFSM;


public class Account2Driver {
	
	Account2 a2;
	MDAEFSM m = new MDAEFSM();
	
	public Account2Driver() throws IOException{
		a2 = new Account2(m);
	}
	
	public void start() throws NumberFormatException, IOException{
		Scanner in;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Op;
		//MDAEFSM m = new MDAEFSM();
		//AbstractFactory accID = 2;
		//DataStore ds = af.getDataStore();
		//State.setOperation(new Operation(af,ds));
		
		
			System.out.println("=============================");
			System.out.println("Account 2");
			System.out.println("MENU :");
			System.out.println("0 : OPEN");
			System.out.println("1 : LOGIN");
			System.out.println("2 : PIN");
			System.out.println("3 : DEPOSIT");
			System.out.println("4 : WITHDRAW");
			System.out.println("5 : BALANCE");
			System.out.println("6 : LOGOUT");
			System.out.println("7 : suspend");
			System.out.println("8 : active");
			System.out.println("9 : close");
			do{
				
				in = new Scanner(System.in);
				Op = in.nextInt();
				switch (Op) {
				case 0:
					try{
					System.out.println("Operation : OPEN(int p, int y, int a)");
					System.out.println("Enter value for pin ");
					int p = Integer.parseInt(br.readLine());
					
					System.out.println("Enter value for id");
					int y = Integer.parseInt(br.readLine());
					
					System.out.println("Enter value for balance");
					int a = Integer.parseInt(br.readLine());
					
					a2.OPEN(p, y, a);
					
					}catch(NumberFormatException e){
						System.out.println("Enter Float Digits only!!");
					}
					break;
				case 1:
					System.out.println("Operation : LOGIN(int id)");
					System.out.println("Enter ID : ");
					try{
						int id = Integer.parseInt(br.readLine());
						
						a2.LOGIN(id);
					}catch(NumberFormatException e){
						System.out.println("Enter Float Digits only!!");
					}
					break;
				case 2:
					System.out.println("Operation : PIN(int x)");
					System.out.println("Enter pin : ");
					try{
						int x = Integer.parseInt(br.readLine());;
						a2.PIN(x);
					}catch(NumberFormatException e){
						System.out.println("Enter Float Digits only!!");
					}
					break;
					
				case 3:
					System.out.println("Operation : DEPOSITt(int d)");
					System.out.println("Enter value to deposit : ");
					try{
						int d = Integer.parseInt(br.readLine());
						a2.DEPOSIT(d);
					}catch(NumberFormatException e){
						System.out.println("Enter Float Digits only!!");
					}
	
				case 4:
					System.out.println("Operation : WITHDRAW(int w)");
					System.out.println("Enter value to withdraw : ");
					try{
						int w = Integer.parseInt(br.readLine());
						a2.WITHDRAW(w);
					}catch(NumberFormatException e){
						System.out.println("Enter Float Digits only!!");
					}
					break;
				
				case 5:
					System.out.println("Operation : BALANCE()");
					a2.BALANCE();
					break;
				
				case 6:
					System.out.println("Operation : LOGOUT()");
					a2.LOGOUT();
					break;
					
				case 7:
					System.out.println("Operation : suspend()");
					a2.suspend();
					break;	
				
				case 8:
					System.out.println("Operation : activate()");
					a2.Activate();
					break;
					
				case 9:
					System.out.println("Operation : close()");
					a2.close();
					break;
			}System.out.println("Enter 10 to stop!!");
		}while( Op != 10);
		
	}
}
				
				
				
				

