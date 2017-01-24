package Project.Account.Action;

import Project.Account.DataStore.DataStore1;

public class MakeDeposit1 extends MakeDeposit {

	DataStore1 ds = new DataStore1();
	@Override
	public void MakeDeposit() {
		// TODO Auto-generated method stub
		float b = ds.getBalance1();
		float d = ds.getd1();
		b = b + d;
		ds.setBalalance1(b);
		
	}

}
