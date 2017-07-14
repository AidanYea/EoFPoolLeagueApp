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

		

	}

}
