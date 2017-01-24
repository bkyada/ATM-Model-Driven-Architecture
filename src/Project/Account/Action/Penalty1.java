package Project.Account.Action;

import Project.Account.DataStore.DataStore1;

public class Penalty1 extends Penalty {
	DataStore1 ds = new DataStore1(); 

	public void Penalty(){
		float p = ds.getPenalty();
		System.out.println("Penalty can be charged is :" +p);
	}

}
