package classesAndObjects;

public class AccountHolder {
	
	String firstname;
	String lastname;
	int age;
	float accountBalance;
	boolean eligibleforCreditCard;
	
	public void testEligibilityForCC() {
	
		if (age>25 && accountBalance>=20000) {
			eligibleforCreditCard=true;
		}
	}
}
