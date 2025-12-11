import java.util.Scanner;
public class BankAccount{
	int balance =1500;
	
 void  deposit(int n){
		balance+=n;
		System.out.println("Amount deposited successfully ");
		}
		 void withdraw(int n){
			if(n>balance){
				System.out.println("Insufficient balance:");
			
				}
				else {
					balance-=n;
	System.out.println("Amount withdraw successfully ")	;
		}	
}		
		int  checkBalance(){
		return balance;
		}	
		
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankAccount ac=new BankAccount();
		
		System.out.println("1.Deposit:");
		System.out.println("2.withDraw:");
		System.out.println("3.checkBalance:");
		System.out.println("Choose your transaction:");
		try{
		int choice =sc.nextInt();
		
		if (choice==1){
			System.out.println("Enter your Deposit Amount:");
			int amt=sc.nextInt();
			ac.deposit(amt);
		System.out.println("current balance "+ac.checkBalance());
			}
			
			else if (choice ==2){
				System.out.println("Enter your withdraw Amount:");
			int amt=sc.nextInt();
			ac.withdraw(amt);
		System.out.println("current balance "+ac.checkBalance());
				}
				
			else if (choice ==3){
				System.out.println(ac.checkBalance());
				}
				
				else {
				System.out.println("Enter the correct choice:");
				
				}
		}
		catch(Exception e){
			System.out.println("Enter numbers only..");
			}
	}
}