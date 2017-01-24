package Project.Account.Action;

import Project.Account.DataStore.DataStore2;

public class MakeWithdraw2 extends MakeWithdraw{

	DataStore2 ds = new DataStore2();
	@Override
	public void MakeWithdraw() {
		// TODO Auto-generated method stub
		int b = ds.getBalance2();
		int w = ds.getw2();
		if(b>0){
			b=b-w;
			ds.setBalalance2(b);
		
	}

}
}