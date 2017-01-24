package Project.Account.Action;

import Project.Account.DataStore.DataStore2;

public class MakeDesposit2 extends MakeDeposit {
	
	DataStore2 ds = new DataStore2();
	@Override
	public void MakeDeposit() {
		// TODO Auto-generated method stub
		int b = ds.getBalance2();
		int d = ds.getd2();
		b = b+d;
		ds.setBalalance2(b);
		
	}

}
