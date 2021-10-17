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

	public void SetAcctInfo(String name, String pw, int PinInput, int acctNum, double startBal){
		acctHolder=name;
		password=pw;
		pin=PinInput;
		accountNum=acctNum;
		bal=startBal;
	}

	public void DepositMoney(double paycheck){
		bal= bal + paycheck;
	}

	public void WithdrawMoney(double moneySpent){
		bal= bal - moneySpent;
	}

	public static void PrintInfo(String accttholder, String password, int pin, int accountNum, int bal, double paycheck, double moneySpent){
				BankAccount myDuck = new BankAccount();

				myDuck.SetAcctInfo("Von Geburt","nunyazbizniz",3217,448921,1);
				myDuck.DepositMoney(.05);
				myDuck.WithdrawMoney(.5);

				System.out.println("account holder: "+myDuck.acctHolder);
				System.out.println("password: "+myDuck.password);
				System.out.println("pin: "+myDuck.pin);
				System.out.println("account number: " +myDuck.accountNum);
				if (myDuck.bal==1) {
					System.out.println("balance: "+myDuck.bal+" dollar");
				} else {
					System.out.println("balance: "+myDuck.bal+ " dollars");
				}
	}
	public static void main(String[] args){
		PrintInfo("Von Geburt", "nunyazbizniz", 3217, 448921, 1, .05, .5);
	}
}
