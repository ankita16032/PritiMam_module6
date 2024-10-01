package module6;

public class AccountTest {

	public static void main(String[] args) {
		System.out.println("Default constructor");
		Account account = new Account();
		account.setAccNo(2);
		account.setAccName("ank");
		account.setAccBalance(100000);
		System.out.println(account);
		System.out.println("-----------------------------");
		System.out.println("Parameterized constructor");
		Account account1 = new Account(1, "Ankita", 90000);
		System.out.println(account1);
	}

}
