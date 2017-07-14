import java.util.Random;


public class AccountCreator {
	
	private int choice;
	private Account acc = null;
	
	public void setTypeOfAccount(int choice) {
		
		this.choice = choice;
		
		if (this.choice == 0) {
			acc = new Player();
			
		} 
		else if (this.choice == 1) {
			acc = new Captain();
			
		}
		else if (this.choice == 2) {
			acc = new Chairperson();

		}
		
	}
	
	public Account getTypeOfAccount() {
		//System.out.println("I am a " + acc.getType());
		return acc;
	}

	public static void main(String[] args) {
		AccountCreator accCr8 = new AccountCreator();
		Team station = new Team();
		Random rand = new Random();
		int j = 5;
		
		for (int i=0; i < j; i++) {
			int choice = rand.nextInt(3);
			accCr8.setTypeOfAccount(choice);
			station.addPlayerToTeam(accCr8.getTypeOfAccount());
		}
		
		station.getListOfTeam();
		station.getNameOfPlayersInList();
//		accCr8.setTypeOfAccount(2);
//		station.addPlayerToTeam(accCr8.getTypeOfAccount());
//		
//		accCr8.setTypeOfAccount(2);
//		station.addPlayerToTeam(accCr8.getTypeOfAccount());
//		
//		accCr8.setTypeOfAccount(0);
//		station.addPlayerToTeam(accCr8.getTypeOfAccount());
//		
//		accCr8.setTypeOfAccount(1);
//		station.addPlayerToTeam(accCr8.getTypeOfAccount());
//	
//		station.getListOfTeam();
		
//		station.addPlayerToTeam(p1);
//		station.addPlayerToTeam(ch1);
//		station.addPlayerToTeam(c1);
//		station.getListOfTeam();
		
		
		
		
//		p1.displayDetails();
//		c1.displayDetails();
//		ch1.displayDetails();
//		c1.setEmail(null);
//		c1.setPassword(null);
//		c1.setType(c1);
//		
//		ch1.setEmail(null);
//		ch1.setPassword(null);
//		ch1.setType(ch1);
//		
//		p1.getEmail();			
//		p1.getPassword();	
//		p1.getType();
//		
//		c1.getEmail();
//		c1.getPassword();
//		c1.getType();
//		
//		ch1.getEmail();
//		ch1.getPassword();
//		ch1.getType();
		
		

	}

}
