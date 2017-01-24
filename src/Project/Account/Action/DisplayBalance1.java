package Project.Account.Action;

import Project.Account.DataStore.DataStore1;

public class DisplayBalance1 extends DisplayBalance{
	
	
	DataStore1 ds = new DataStore1();
	@Override
	public void DisplayBalance() {
		// TODO Auto-generated method stub
		float b = ds.getBalance1();
		System.out.println("Your Current Balance is : "+b);
		
	}

}
