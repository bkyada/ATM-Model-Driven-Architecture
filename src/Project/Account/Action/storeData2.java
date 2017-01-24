package Project.Account.Action;

import Project.Account.DataStore.DataStore2;

public class storeData2 extends storeData {

	@Override
	public void storeData() {
		DataStore2 ds = new DataStore2(); 
		// TODO Auto-generated method stub
		int p = ds.getPin2();
		ds.setPin2(p);
		
		int id = ds.getID2();
		ds.setID2(id);
		
		int bal= ds.getBalance2();
		ds.setBalalance2(bal);
		
	}

}
