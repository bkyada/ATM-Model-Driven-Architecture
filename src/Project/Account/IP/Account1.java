package Project.Account.IP;

import Project.Account.DataStore.DataStore1;
import Project.Account.OP.AbstractFactory;
import Project.Account.OP.af_Account1;
import Project.Account.State.MDAEFSM;

public class Account1 {
	MDAEFSM m ;
	private AbstractFactory af;
	DataStore1 ds;
	String temp_id;
	String temp_pin;
	float temp_bal;
	float min;
	int attempts;
	
	public Account1(MDAEFSM mObj){
		this.m = mObj;
		ds = new DataStore1();
		af = new af_Account1();
		m.setAbstractClass(af);
	}
	public void open(String p, String y, float a){
		temp_bal = a;
		temp_pin = p;
		temp_id = y;
		ds.setID1(temp_id);
		ds.setPin1(temp_pin);
		ds.setBalalance1(temp_bal);
		m.Open();
	}
	
	public void login(String y){
		if(temp_id.equals(y)){
			m.Login();
			System.out.println("Correct ID");
		}
		else{
			m.IncorrectLogin();
		}
		
	}
	
	public void pin(String x){
		if(temp_pin.equals(x)){
			attempts = 3;
			if(temp_bal > ds.getMin()){
				m.CorrectPinAboveMin();
			}
			else{
				m.CorrectPinBelowMin();
			}
			System.out.println("Correct PIN!!");
			System.out.println("Start Operation Deposit/Withdraw");
		}
		else{
			m.IncorrectPin(attempts--);
		}
	}
	
	public void deposit(float d){
		ds.setd1(d);
		min = ds.getMin();
		m.Deposit();
		if(temp_bal > min){
			m.AboveMinBalance();			
		}
		else{
			m.BelowMinBalance();
		}
	}
	
	public void withdraw(float w){
		ds.setw1(w);
		min = ds.getMin();
		m.Withdraw();
		if(temp_bal > min){
			m.AboveMinBalance();
		}
		else{
			m.WithdrawBelowMinBalance();
		}
	}
	
	public void logout(){
		m.Logout();
	}
	
	public void balance(){
		m.Balance();
	}
	
	public void lock(String x){
		if(temp_pin.equals(x)){
			m.Lock();
		}
		else{
			m.IncorrectLock();
		}
	}
	
	public void unlock(String x){
		if(temp_pin.equals(x)){
			min = ds.getMin();
			m.Unlock();
			if(temp_bal > min){
				m.AboveMinBalance();
			}
			else{
				m.BelowMinBalance();
			}
		}
	}
	
}
