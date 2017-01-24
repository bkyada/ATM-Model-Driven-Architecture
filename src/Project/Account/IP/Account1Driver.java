package Project.Account.IP;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import Project.Account.State.MDAEFSM;


public class Account1Driver {
	Account1 a1;
	MDAEFSM m = new MDAEFSM();
	public Account1Driver() throws IOException{
		a1 = new Account1(m);
	}
		
	public void start() throws IOException{
		Scanner in;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Op;

		
	
/*		AbstractFactory af = new acc1_CF();
		AbstractFactory accID = 1;
		DataStore ds = af.getDataStore();
		State.setOperation(new Operations(af,ds));
*/		
		
			
			System.out.println("=============================");
			System.out.println("Account 1");
			System.out.println("MENU :");
			System.out.println("0 : open");
			System.out.println("1 : login");
			System.out.println("2 : pin");
			System.out.println("3 : deposit");
			System.out.println("4 : withdraw");
			System.out.println("5 : balance");
			System.out.println("6 : lock");
			System.out.println("7 : unlock");
			System.out.println("8 : logout");
			System.out.println("10 : Terminate");
			do{
			in = new Scanner(System.in);
			Op = in.nextInt();
			
			switch (Op) {
			case 0:
				System.out.println("Operation : open(String p, String y, float a)");
				System.out.println("Enter value for pin \n");
				String p = br.readLine();
				System.out.println("Enter value for id\n");
				String y = br.readLine();
				System.out.println("Enter value for balance\n");
				try{
				float a = Float.parseFloat(br.readLine());
				
				a1.open(p, y, a);
				
				}catch(NumberFormatException e){
					System.out.println("Enter Float Digits only!!");
				}
				break;
			case 1:
				System.out.println("Operation : login(String y)");
				System.out.println("Enter ID : \n");
				String id = br.readLine();
				a1.login(id);
				break;
				
			case 2:
				System.out.println("Operation : pin(String x)");
				System.out.println("Enter pin : \n");
				String x = br.readLine();
				a1.pin(x);
				break;
				
			case 3:
				System.out.println("Operation : deposit(float d)");
				System.out.println("Enter value to deposit : \n");
				try{
					float d = Float.parseFloat(br.readLine());
					a1.deposit(d);
				}catch(NumberFormatException e){
					System.out.println("Enter Float Digits only!!");
				}
				break;

			case 4:
				System.out.println("Operation : withdraw(float w)");
				System.out.println("Enter value to withdraw : \n");
				try{
					float w = Float.parseFloat(br.readLine());
					a1.withdraw(w);
				}catch(NumberFormatException e){
					System.out.println("Enter Float Digits only!!");
				}
				break;
			
			case 5:
				System.out.println("Operation : balance()");
				a1.balance();
				break;
				
			case 6:
				System.out.println("Operation : lock(String x)");
				System.out.println("Enter pin to lock : \n");
				String pin = br.readLine();
				a1.lock(pin);
				break;	
			
			case 7:
				System.out.println("Operation : unlock(String x)");
				System.out.println("Enter pin to unlock : ");
				String pin1 = br.readLine();
				a1.unlock(pin1);
				break;	
				
			case 8:
				System.out.println("Operation : logout()");
				a1.logout();
				break;
				
			default :
				break;
			}
			System.out.println("Enter 10 to stop!!");
		}while(Op!=10);
		
	}
	}


				
				
				
				

