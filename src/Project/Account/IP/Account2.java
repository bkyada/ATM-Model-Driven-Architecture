package Project.Account.IP;



import Project.Account.DataStore.DataStore2;
import Project.Account.OP.AbstractFactory;
import Project.Account.OP.af_Account2;
import Project.Account.State.MDAEFSM;


public class Account2 {

	MDAEFSM m ;
	private AbstractFactory af;
	DataStore2 ds;
	int temp_id;
	int temp_pin;
	int temp_bal;
	int attempts;
	
	public Account2(MDAEFSM m){
		this.m = m;
		this.ds = new DataStore2();
		af = new af_Account2();
		m.setAbstractClass(af);
	}
	
	public void OPEN(int p, int y, int a){
		temp_bal = a;
		temp_pin = p;
		temp_id = y;
		ds.setPin2(temp_pin);
		ds.setID2(temp_id);
		ds.setBalalance2(temp_bal);
		m.Open();
	}
	
	public void LOGIN(int y){
		if(y==temp_id){
			m.Login();
		}else{
			m.IncorrectLogin();
		}
	}
	
	public void PIN(int x){
		if(x==temp_pin){
			m.CorrectPinAboveMin();
		}
		else{
			m.IncorrectPin(attempts);
		}
	}
	
	public void DEPOSIT(int d){
		ds.setID2(d);
		m.Deposit();
	}
	
	public void WITHDRAW(int w){
		ds.setw2(w);
		if(temp_bal > 0){
			m.Withdraw();
		}else{
			m.NoFunds();
		}
	}
	
	public void BALANCE(){
		m.Balance();
	}
	
	public void LOGOUT(){
		m.Logout();
	}
	
	public void suspend(){
		m.Suspend();
	}
	
	void Activate(){
		m.Activate();
	}
	
	void close(){
		m.Close();
	}
}
