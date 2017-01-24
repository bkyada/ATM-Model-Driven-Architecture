package Project.Account.State;

import Project.Account.Operations.Operations;
public class Start extends State{
	
	public Start(MDAEFSM m, Operations op){
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
		throw new UnsupportedOperationException("Not supported in this stage.");
		
	}

	@Override
	public void BelowMinBalance() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported in this stage.");
		
	}

	@Override
	public void AboveMinBalance() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported in this stage.");
		
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
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported in this stage.");
		
	}

	@Override
	public void WithdrawBelowMinBalance() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported in this stage.");
		
	}

	@Override
	public void Lock() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported in this stage.");
		
	}

	@Override
	public void IncorrectLock() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Not supported in this stage.");
		
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
