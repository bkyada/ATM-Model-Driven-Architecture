package Project.Account.State;

import Project.Account.Operations.Operations;

public class Ready extends State{
	
	public Ready(MDAEFSM m, Operations op){
		super(m,op);
	}

	@Override
	public void Open() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported in this stage.");
		
	}

	@Override
	public void Login() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported in this stage.");
		
	}

	@Override
	public void CardIn() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported in this stage.");
		
	}

	@Override
	public void IncorrectLogin() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported in this stage.");
		
	}

	@Override
	public void IncorrectPin() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported in this stage.");
		
	}

	@Override
	public void TooManyAttemptMsg() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported in this stage.");
		
	}

	@Override
	public void CorrectPinBelowMin() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported in this stage.");
		
	}

	@Override
	public void CorrectPinAboveMin() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported in this stage.");
		
	}

	@Override
	public void Deposit() {
		// TODO Auto-generated method stub
		Operations.MakeDeposit();
		me.changeState(3);
		
	}

	@Override
	public void BelowMinBalance() {
		throw new UnsupportedOperationException("Not supported in this stage.");
		// TODO Auto-generated method stub
	//	setID(3);
		
	}

	@Override
	public void AboveMinBalance() {
		throw new UnsupportedOperationException("Not supported in this stage.");
		// TODO Auto-generated method stub
	//	setID(2);
		
	}

	@Override
	public void Logout() {
		// TODO Auto-generated method stub
		me.changeState(1);
		
	}

	@Override
	public void Balance() {
		// TODO Auto-generated method stub
		Operations.DisplayBalance();
		me.changeState(3);
		
	}

	@Override
	public void Withdraw() {
		// TODO Auto-generated method stub
		Operations.MakeWithdraw();
		me.changeState(4);
		
	}

	@Override
	public void WithdrawBelowMinBalance() {
		throw new UnsupportedOperationException("Not supported in this stage.");
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void Lock() {
		// TODO Auto-generated method stub
		me.changeState(6);
		
	}

	@Override
	public void IncorrectLock() {
		// TODO Auto-generated method stub
		System.out.println("Pin entered is wrong to Lock !!");
		me.changeState(3);
		
	}

	@Override
	public void Unlock() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported in this stage.");
		
	}

	@Override
	public void IncorrectUnlock() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported in this stage.");
		
	}

	@Override
	public void NoFunds() {
		// TODO Auto-generated method stub
		System.out.println("No Funds Remaining!!");
		me.changeState(1);
		
	}

	@Override
	public void Suspend() {
		// TODO Auto-generated method stub
		me.changeState(7);
		
	}

	@Override
	public void Activate() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported in this stage.");
		
	}

	@Override
	public void Close() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported in this stage.");
		
	}

}
