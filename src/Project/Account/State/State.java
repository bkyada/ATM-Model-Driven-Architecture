package Project.Account.State;

import Project.Account.Operations.Operations;

public abstract class State {
		protected int id;
		protected static Operations op;
		protected MDAEFSM me;
		int attempts = 0;
		//
		//protected MDAEFSM me;
		//private static int id=0;
		
		protected static Operations Operations;
		public static void setOperation(Operations op){
			Operations = op;
	 	}
		
		public State(MDAEFSM m, Operations op){
			this.me =m;
			this.op = op;
		}
		public void setID(int i){
			id = i;
		}
		
		public int getID(){
			return id;
		}
		
		
		public abstract void Open();
		public abstract void Login();
		public abstract void CardIn();
		public abstract void IncorrectLogin();
		public abstract void IncorrectPin();
		public abstract void TooManyAttemptMsg();
		public abstract void CorrectPinBelowMin();
		public abstract void CorrectPinAboveMin();
		public abstract void Deposit();
		public abstract void BelowMinBalance();
		public abstract void AboveMinBalance();
		public abstract void Logout();
		public abstract void Balance();
		public abstract void Withdraw();
		public abstract void WithdrawBelowMinBalance();
		public abstract void Lock();
		public abstract void IncorrectLock();
		public abstract void Unlock();
		public abstract void IncorrectUnlock();
		public abstract void NoFunds();
		public abstract void Suspend();
		public abstract void Activate();
		public abstract void Close();



}
