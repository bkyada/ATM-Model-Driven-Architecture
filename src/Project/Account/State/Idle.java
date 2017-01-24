package Project.Account.State;
import Project.Account.Operations.Operations;

public class Idle extends State{
	
	public Idle(MDAEFSM m, Operations op){
		super(m,op);
	}

	@Override
	public void Open() {
		// TODO Auto-generated method stub
		Operations.DisplayMenu();
		me.changeState(2);
	}

	@Override
	public void Login() {
		// TODO Auto-generated method stub
		System.out.println("Enter Card ");
		me.changeState(2);
		
	}

	@Override
	public void CardIn() {
		// TODO Auto-generated method stub
		Operations.PromptForPin();
		me.changeState(2);
		
	}

	@Override
	public void IncorrectLogin() {
		// TODO Auto-generated method stub
		System.out.println("Incorrect ID!!");
		me.changeState(0);
		
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
		throw new UnsupportedOperationException("Not supported in this stage.");
		// TODO Auto-generated method stub
		
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
		throw new UnsupportedOperationException("Not supported in this stage.");
		// TODO Auto-generated method stub
		
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
		throw new UnsupportedOperationException("Not supported in this stage.");
		// TODO Auto-generated method stub
		
	}

}
