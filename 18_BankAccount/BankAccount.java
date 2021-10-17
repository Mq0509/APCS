/*
Trio number int x (Orion Roven, May Qiu, Lawrence Joa)
APCS
HW18_BankAccount (use UML diagram)
10/14/21
DISCO:
main must be static
in order to maintain proper pluraity of the word dollar, we can use an if else statement that checks if bal==1
if we say if (bal==1){//do stuff} then we get an error saying nonstatic variable bal cannot be referenced in a static context
we can fix this by saying if (myDuck.bal==1){//do stuff}, because myDuck.bal is static
QCC:
if main has to reference SetAcct, and SetAcct has to reference acctHolder, than wouldn't acctHolder have to be a static instance variable (it works if it is)
*/

public class BankAccount {
	private String acctHolder;
	private String password;
	private int pin;
	private int accountNum;
	private double bal;

	public void SetAcctHolder(String name){
		acctHolder=name;
	}

	public void SetPassword(String pw){
		password=pw;
	}

	public void SetPin(int PinInput){
		pin=PinInput;
	}

	public void SetAcctNum(int acctNum){
		accountNum=acctNum;
	}

	public void SetBal(double startBal){
		bal=startBal;
	}

	public static void main(String[] args){
		BankAccount myDuck = new BankAccount();

		myDuck.SetAcctHolder("Von Geburt");
		myDuck.SetPassword("nunyazbizniz");
		myDuck.SetPin(3217);
		myDuck.SetAcctNum(448921);
		myDuck.SetBal(1);

		System.out.println("account holder: "+myDuck.acctHolder);
		System.out.println("password: "+myDuck.password);
		System.out.println("pin: "+myDuck.pin);
		System.out.println("account number: "+myDuck.accountNum);
		if (myDuck.bal==1) {
			System.out.println("balance: "+myDuck.bal+" dollar");
		} else {
			System.out.println("balance: "+myDuck.bal+" dollars");
		}
	}
	public double DepositMoney(double bal, double paycheck){
		return (bal + paycheck);
	}
	public static double WithdrawMoney(double bal, double moneySpent){
		return (myDuck.bal - moneySpent);
	}
}
