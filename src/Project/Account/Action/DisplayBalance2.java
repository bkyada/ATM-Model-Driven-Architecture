package Project.Account.Action;

import Project.Account.DataStore.DataStore1;
import Project.Account.DataStore.DataStore2;
public class DisplayBalance2 extends DisplayBalance{

	DataStore2 ds = new DataStore2();
	@Override
	public void DisplayBalance() {
		// TODO Auto-generated method stub
		int b = ds.getBalance2();
		System.out.println("Your Current Balance is : "+b);
		
	}

}
