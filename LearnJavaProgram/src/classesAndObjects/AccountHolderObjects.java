package classesAndObjects;

public class AccountHolderObjects {

	public static void main(String[] args) {
		AccountHolder Tom = new AccountHolder();
		AccountHolder Henry = new AccountHolder();
		AccountHolder Sarah = new AccountHolder();
		
		Tom.firstname="Tom";
		Tom.lastname="Smith";
		Tom.age=21;
		Tom.accountBalance=10000;
		Tom.testEligibilityForCC();
		System.out.println(Tom.eligibleforCreditCard);	
		
		
		Henry.firstname="Henry";
		Henry.lastname="Smith";
		Henry.age=29;
		Henry.accountBalance=100000;
		Henry.testEligibilityForCC();
		System.out.println(Henry.eligibleforCreditCard);
	}
}
