package Project.Account.Action;

import Project.Account.DataStore.DataStore1;

public class MakeWithdraw1 extends MakeWithdraw {

	DataStore1 ds = new DataStore1();
	@Override
	public void MakeWithdraw() {
		// TODO Auto-generated method stub
		float b = ds.getBalance1();
		float w = ds.getw1();
		float min = ds.getMin();
		if((b - w) < min){
			float p = ds.getPenalty();
			b = b-w-p;
		}
		else{
			b = b-w;
		}
		ds.setBalalance1(b);
		
	}

}
