package Project.Account.State;

import Project.Account.Operations.Operations;

public class Locked extends State {
	public Locked(MDAEFSM m, Operations op){
		super(m,op);
	}

	@Override
	public void Open() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported in this stage.");
		
	}

	@Override
	public void Login() {
		throw new UnsupportedOperationException("Not supported in this stage.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CardIn() {
		throw new UnsupportedOperationException("Not supported in this stage.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void IncorrectLogin() {
		throw new UnsupportedOperationException("Not supported in this stage.");
		// TODO Auto-generated method stub
		
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
		throw new UnsupportedOperationException("Not supported in this stage.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BelowMinBalance() {
		throw new UnsupportedOperationException("Not supported in this stage.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AboveMinBalance() {
		throw new UnsupportedOperationException("Not supported in this stage.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Logout() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported in this stage.");
		
	}

	@Override
	public void Balance() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported in this stage.");
		
	}

	@Override
	public void Withdraw() {
		throw new UnsupportedOperationException("Not supported in this stage.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void WithdrawBelowMinBalance() {
		throw new UnsupportedOperationException("Not supported in this stage.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Lock() {
		throw new UnsupportedOperationException("Not supported in this stage.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void IncorrectLock() {
		throw new UnsupportedOperationException("Not supported in this stage.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Unlock() {
		// TODO Auto-generated method stub
		me.changeState(4);
		
	}

	@Override
	public void IncorrectUnlock() {
		// TODO Auto-generated method stub
		System.out.println("Enter Correct Pin to unlock!!");
		me.changeState(6);
		
	}

	@Override
	public void NoFunds() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported in this stage.");
		
	}

	@Override
	public void Suspend() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported in this stage.");
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
