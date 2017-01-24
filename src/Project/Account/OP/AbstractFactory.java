package Project.Account.OP;

import Project.Account.Action.*;
import Project.Account.DataStore.DataStore;
public abstract class AbstractFactory {
	public static int aID;
	public static DataStore ds;
	public abstract DisplayBalance getBalance();
	public abstract DisplayMenu getMenu();
	public abstract MakeDeposit doDeposit();
	public abstract MakeWithdraw doWithdraw();
	public abstract PromptForPin getprompt();
	public abstract Penalty getPenalty();
	public abstract TooManyAttemptsMsg aMsg();
	
	public abstract storeData sData(); 
	

}
