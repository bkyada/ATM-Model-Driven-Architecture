package Project.Account.State;

import Project.Account.OP.AbstractFactory;
import Project.Account.Operations.Operations;

public class MDAEFSM {
	    private State[] objState = new State[8];
	    private State currentState;
	    private Operations op;
	    public MDAEFSM() {
	        op = new Operations();
	        
	        State objState[] = {
					new Start(this,op),
					new Idle(this,op),
					new CheckPin(this,op),
					new Ready(this,op),
					new S1(this,op),
					new Overdrawn(this,op),
					new Locked(this,op),
					new Suspended(this,op),
					new close(this ,op)
			};
	        currentState=objState[0]; 
	    }
	    
	    
	    public void setAbstractClass(AbstractFactory af){
	        op.setAFObject(af);
	    }
	    
	    
	    void changeState(int i){
	        currentState = objState[i];
	    }
	    
	    public void Open(){
			currentState.Open();
		}
		
		public void Login(){
			currentState.Login();
		}
		
		public void close(){
			currentState.Close();
		}
		
		public void CardIn(){
			currentState.CardIn();
		}
		
		public void IncorrectLogin(){
			currentState.IncorrectLogin();
		}
		
		public void IncorrectPin(int attempts){
			currentState.IncorrectPin();
		}
		
		public void TooManyAttemptMsg(){
			currentState.TooManyAttemptMsg();
		}

		public void CorrectPinBelowMin(){
			currentState.CorrectPinBelowMin();;
		}
		
		public void CorrectPinAboveMin(){
			currentState.CorrectPinAboveMin();
		}
		
		public void Deposit(){
			currentState.Deposit();
		}
		
		public void BelowMinBalance(){
			currentState.BelowMinBalance();
		}
		
		public void AboveMinBalance(){
			currentState.AboveMinBalance();
		}
		
		public void Logout(){
			currentState.Logout();
		}
		
		public void Balance(){
			currentState.Balance();
		}
		
		public void Withdraw(){
			currentState.Withdraw();
		}
		
		public void WithdrawBelowMinBalance(){
			currentState.WithdrawBelowMinBalance();
		}
		
		public void Lock(){
			currentState.Lock();
		}
		
		public void IncorrectLock(){
			currentState.IncorrectLock();
		}
		
		public void Unlock(){
			currentState.Unlock();
		}
		
		public void IncorrectUnlock(){
			currentState.IncorrectUnlock();
		}
		
		public void NoFunds(){
			currentState.NoFunds();
		}
		
		public void Suspend(){
			currentState.Suspend();
		}
		
		public void Activate(){
			currentState.Activate();
		}
		
		public void Close(){
			currentState.Close();
		}
		
	
	}

