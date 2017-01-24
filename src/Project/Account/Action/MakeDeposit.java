package Project.Account.Action;

import Project.Account.DataStore.DataStore;

public abstract class MakeDeposit {
	private static DataStore ds;
	public abstract void MakeDeposit();
	public void setDSObject(DataStore ds) {
		MakeDeposit.ds=ds; 
	}
		

}
