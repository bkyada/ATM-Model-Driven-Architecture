package Project.Account.Operations;

import Project.Account.Action.*;
import Project.Account.DataStore.DataStore;
import Project.Account.OP.AbstractFactory;
public class Operations {
	
	AbstractFactory af;
	DataStore ds;
	
	public void Operations (AbstractFactory af,DataStore ds){
		setAFObject(af);
		setDataStore(ds);
	}
	
	public void setAFObject(AbstractFactory af){
		this.af = af;
	}
	
	public void setDataStore (DataStore ds){
		this.ds = ds;
	}
	
	public void DisplayBalance(){
		DisplayBalance db = af.getBalance();
		db.DisplayBalance();
	}

	public void DisplayMenu(){
		DisplayMenu dm = af.getMenu();
		dm.DisplayMenu();
	}
	
	public void MakeWithdraw(){
		MakeWithdraw w = af.doWithdraw();
		w.MakeWithdraw();
		
	}
	
	public void MakeDeposit(){
		MakeDeposit de = af.doDeposit();
		de.MakeDeposit();
	}
	
	public void storeData(){
		storeData sd = af.sData();
		sd.storeData();
	}
	
	public void Penalty(){
		Penalty pm = af.getPenalty();
		pm.Penalty();
	}
	
	public void PromptForPin(){
		PromptForPin pp = af.getprompt();
		pp.msg();
	}
	
	public void TooManyAttemptsMsg(){
		TooManyAttemptsMsg tm = af.aMsg();
		tm.msg();
	}

}
