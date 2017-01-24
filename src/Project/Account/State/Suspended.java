package Project.Account.State;

import Project.Account.Operations.Operations;

public class Suspended extends State{
	public Suspended(MDAEFSM m, Operations op){
		super(m,op);
	}

	@Override
	public void Open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CardIn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void IncorrectLogin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void IncorrectPin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TooManyAttemptMsg() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CorrectPinBelowMin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CorrectPinAboveMin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Deposit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BelowMinBalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AboveMinBalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Logout() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void Balance() {
		// TODO Auto-generated method stub
		Operations.DisplayBalance();
		me.changeState(7);
		
	}

	@Override
	public void Withdraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void WithdrawBelowMinBalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Lock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void IncorrectLock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Unlock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void IncorrectUnlock() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void NoFunds() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Suspend() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Activate() {
		// TODO Auto-generated method stub
		me.changeState(3);
		
	}

	@Override
	public void Close() {
		// TODO Auto-generated method stub
		me.changeState(0);
		
	}

}
