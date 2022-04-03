package Week3Day1;

public class AxisBank extends BankInfo{
	
	public void Deposit()
	{
	float d=500000f;
	System.out.println("Saving amount is "+d);
}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		AxisBank ab=new AxisBank();
		ab.Saving();
		ab.Fixed();
		ab.Deposit();

	}

}
