package Project.Account.OP;

import Project.Account.Action.*;
public class af_Account2 extends AbstractFactory{

	@Override
	public DisplayBalance getBalance() {
		// TODO Auto-generated method stub
		return new DisplayBalance2();
	}

	@Override
	public DisplayMenu getMenu() {
		// TODO Auto-generated method stub
		return new DisplayMenu2();
	}

	@Override
	public storeData sData() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public MakeDeposit doDeposit() {
		// TODO Auto-generated method stub
		return new MakeDesposit2();
	}

	@Override
	public MakeWithdraw doWithdraw() {
		// TODO Auto-generated method stub
		return new MakeWithdraw2();
	}

	@Override
	public PromptForPin getprompt() {
		// TODO Auto-generated method stub
		return new PromptForPin();
	}

	@Override
	public Penalty getPenalty() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TooManyAttemptsMsg aMsg() {
		// TODO Auto-generated method stub
		return new TooManyAttemptsMsg();
	}

	
	

}
