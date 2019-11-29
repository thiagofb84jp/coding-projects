package br.com.blockone;

public class TestAccount {

	public static void main(String[] args) {
		Account acc1 = new Account("1", "Basic Account", 100);
		Account acc2 = new Account("2", "Basic Account", 100);
		
		System.out.println("/************************* Account Operations *************************/");
		System.out.println("Verify account balance: " + acc1.getBalance());
		System.out.println("Put on some credit in account: " + acc1.credit(50));
		System.out.println("Total balance (after put on some credit): " + acc1.getBalance());
		System.out.println("Making some debit: " + acc1.debit(100));
		System.out.println("New account balance: " + acc1.getBalance());
		System.out.println("Making some transference: " + acc2.transferTo(acc1, 10));
		System.out.println("New account balance: " + acc1.getBalance());
		System.out.println("/**********************************************************************/");
	}
}