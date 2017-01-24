package Project.Account.Action;

import Project.Account.DataStore.DataStore1;

public class storeData1 extends storeData {

	@Override
	public void storeData() {
		DataStore1 ds = new DataStore1(); 
		// TODO Auto-generated method stub
		String p = ds.getPin1();
		ds.setPin1(p);
		
		String id = ds.getID1();
		ds.setID1(id);
		
		float bal= ds.getBalance1();
		ds.setBalalance1(bal);
		
	}

}
