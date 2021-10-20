/**
   Trio Number Int X (Orion Roven, Lawrence Joa, May Qiu) / Swag Trio
   APCS pd7
   HW20 -- being whiteHat hackers
   2021-10-18
DISCO:
We can create an object whiteHat in class BankAccount from class Teller;
if we don't setPasswd, but still try to authenticate, then authenticate() returns false
QCC:
We couldn't access the instance variable balance (in BankAccount.java) from Teller.java because it was private
balance, pin, and acctNum default to 0 if we do not assign values to them in Teller
passwd and name default to null if we do not assign values to them in Teller
**/
  //main method for testing
public class Teller {
  public static void main( String[] args ) {
    BankAccount whiteHat = new BankAccount();

    whiteHat.setBalance(100);
    whiteHat.deposit(400);
    whiteHat.deposit(-100);
    whiteHat.withdraw(200);
    System.out.println(whiteHat.balance);

    whiteHat.setPin((short)0000);
    System.out.println(whiteHat.pin);

    whiteHat.setAcctNum(123456789);
    System.out.println(whiteHat.acctNum);

    whiteHat.setPasswd("Strong Password");
    System.out.println(whiteHat.passwd);

    whiteHat.setName("Von Geburt");
    System.out.println(whiteHat.name);

    System.out.println(whiteHat.authenticate(123456789,"Strong Password"));//correct info.
    System.out.println(whiteHat.authenticate(12345678,"Strong Password"));//incorrect acctNum
    System.out.println(whiteHat.toString());
  }//end main()
}//end class Teller
