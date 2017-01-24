package Project.Account.OP;

import Project.Account.Action.*;
import Project.Account.DataStore.DataStore1;
public class af_Account1 extends AbstractFactory{
	
	public af_Account1(){
		ds = new DataStore1();
	}

	@Override
	public DisplayBalance getBalance() {
		// TODO Auto-generated method stub
		return new DisplayBalance1();
	}

	@Override
	public DisplayMenu getMenu() {
		// TODO Auto-generated method stub
		return new DisplayMenu2();
	}

	@Override
	public MakeDeposit doDeposit() {
		// TODO Auto-generated method stub
		return new MakeDeposit1();
	}

	@Override
	public MakeWithdraw doWithdraw() {
		// TODO Auto-generated method stub
		return new MakeWithdraw1();
	}
	
	@Override
	public storeData sData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PromptForPin getprompt() {
		// TODO Auto-generated method stub
		return new PromptForPin();
	}

	@Override
	public Penalty getPenalty() {
		// TODO Auto-generated method stub
		return new Penalty1();
	}

	@Override
	public TooManyAttemptsMsg aMsg() {
		// TODO Auto-generated method stub
		return new TooManyAttemptsMsg();
	}

	

}
