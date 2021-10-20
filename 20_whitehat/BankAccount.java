/**
   Swag trio: Max Schneider, Jason Yang, Michael Kamela
   APCS pd7
   HW18 -- building a more meaningful class
   2021-10-18
Disco:
I discovered the importance of syntax in conditionals. Struggled mightily before realizing that and was not valid but && is. Additionally, I discovered how useful it is to label outputs with print statements to clarify the info.
QCC:
It is possible to only allow edits after authenticate has been ran?
Why do you need to (short) when you assign a pin?
**/

public class BankAccount {

  //instance variables
  public String name;
  public String passwd;
  public short pin;
  public int acctNum;
  public double balance;
  //---------------------------------------------


  //mutators
  public String setName( String newName ) {
    String oldName = name;
    name = newName;
    return oldName;
  }

  public String setPasswd( String newPasswd ) {
    String oldPasswd = passwd;
    passwd = newPasswd;
    return oldPasswd;
  }

  public short setPin( short newPin ) {
    short oldPin = pin;
    if ((newPin >= 1000) && (newPin <= 9998)) {
	    pin =newPin;
	 } else {
	    pin = 9999;
	    System.out.println("Invalid Pin: Pin must be between 1000 and 9998");
    }
    return oldPin;
  }

  public int setAcctNum( int newAcctNum ) {
    int oldAcctNum = acctNum;
    if ((newAcctNum >= 100000000) && (newAcctNum <= 999999998)) {
	  acctNum = newAcctNum;
	} else {
	    acctNum=999999999;
	    System.out.println("Invalid Account Number - Account Number must be between 100000000 and 999999998");
    }
    return oldAcctNum;
  }

  public double setBalance( double newBalance ) {
    double oldBalance = balance;
    balance = newBalance;
    return oldBalance;
  }
  //---------------------------------------------


  public void deposit( double depositAmount ) {
    balance = balance + depositAmount;
  }

  public void withdraw( double withdrawAmount ) {
    if (balance - withdrawAmount >= 0) {
	    balance = balance - withdrawAmount;
    }
    else {
	    System.out.println("You do not have enough money to make this withdrawal");
    }
  }

  public boolean authenticate(int number, String pass){
	if ((passwd == pass) && (acctNum==number)) {
		return true;
	}
	else {
		return false;
	}
}
  //overwritten toString()
  public String toString() {
    String retStr = "\nAccount info:\n=======================";
    retStr = retStr + "\nName: " + name;
    retStr = retStr + "\nPassword: " + passwd;
    retStr = retStr + "\nPIN: " + pin;
    retStr = retStr + "\nAccount Number: " + acctNum;
    retStr = retStr + "\nBalance: " + balance;
    retStr = retStr + "\n=======================";
    return retStr;
  }


  //main method for testing
  public static void main( String[] args ) {
    BankAccount ba = new BankAccount();

	ba.setName("Test Account");

	ba.setPasswd("StrongPassword");

	ba.setPin((short)0000);

	ba.setAcctNum(123456789);

	ba.setBalance(1000);

	ba.withdraw(100);

	ba.deposit(200);

	System.out.println("Functional Responses: ");

	System.out.println(ba.toString());

	System.out.println("Should say: 'Account Name:  Test Account, Password: StrongPassword, Pin: 0000, Account Number: 123456789, Balance: 1100.0'");

	System.out.println("Error Messages:");

	ba.setAcctNum(4);
	ba.setPin((short)4);
	ba.withdraw(1000000);
	System.out.println(ba.authenticate(123456789, "WeakPassword"));
	System.out.println(ba.authenticate(4, "StrongPassword"));
	System.out.println("Should give 3 unique error messages and then two false values");
  }//end main()

}//end class BankAccount
