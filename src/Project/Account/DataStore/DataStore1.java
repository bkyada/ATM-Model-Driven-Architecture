package Project.Account.DataStore;

public class DataStore1 extends DataStore{

	public static String p;
	public static String y;
	public static float a;
	public static float d;
	public static float w;
	
	
	public float getMin(){
		return 300;
	}
	
	public float getPenalty(){
		return 20;
	}
	@Override
	public void setPin1(String temp_p) {
		p = temp_p;
		
	}

	@Override
	public String getPin1() {
		return p;
	}

	@Override
	public void setID1(String temp_y) {
		y = temp_y;
		
	}

	@Override
	public String getID1() {
		return y;
	}

	@Override
	public void setBalalance1(float temp_a) {
		a = temp_a;
		
	}

	@Override
	public float getBalance1() {
		return a;
	}

	@Override
	public void setd1(float temp_d) {
		d = temp_d;
		
	}

	@Override
	public float getd1() {
		return d;
	}

	@Override
	public void setw1(float temp_w) {
		w = temp_w;
		
	}

	@Override
	public float getw1() {
		return w;
	}

	@Override
	public void setPin2(int temp_p) {
		throw new UnsupportedOperationException("Not Supported !!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPin2() {
		throw new UnsupportedOperationException("Not Supported !!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setID2(int temp_y) {
		throw new UnsupportedOperationException("Not Supported !!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getID2() {
		throw new UnsupportedOperationException("Not Supported !!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBalalance2(int temp_a) {
		throw new UnsupportedOperationException("Not Supported !!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getBalance2() {
		throw new UnsupportedOperationException("Not Supported !!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setd2(int temp_d) {
		throw new UnsupportedOperationException("Not Supported !!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getd2() {
		throw new UnsupportedOperationException("Not Supported !!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setw2(int temp_w) {
		throw new UnsupportedOperationException("Not Supported !!");
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getw2() {
		throw new UnsupportedOperationException("Not Supported !!");
		// TODO Auto-generated method stub
		
	}

	
}
