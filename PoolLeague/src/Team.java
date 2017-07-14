import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Team {
	private String teamname;
	private ArrayList players = new ArrayList();
	private int won;
	private int drawn;
	private int lost;
	private int points;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}
	
	public void setTeamName(String teamname) {
		teamname = JOptionPane.showInputDialog("Enter team name: ");
		this.teamname = teamname;
	}
	
	public String getTeamName() {
		return this.teamname;
	}
	
	public void setWon(int won) {
		this.won = won;
	}
	
	public int getWon() {
		return this.won;
	}
	
	public void setDrawn(int drawn) {
		this.drawn = drawn;
	}
	
	public int getDrawn() {
		return this.drawn;
	}
	
	public void setLost(int lost) {
		this.lost = lost;
	}
	
	public int getLost() {
		return this.lost;
	}
	
	public void setPoints(int points) {
		this.points = points;
	}
	
	public int getPoints() {
		return this.points;
	}
	
	public void addPlayerToTeam(Account player) {
		this.players.add(player);
	}
	
	public ArrayList getListOfTeam() {
		System.out.println("This is the list of players in the team: " + this.players);
		return this.players;
	}
	
	public void getNameOfPlayersInList() {
		String temp = null;
		
		System.out.println("The names of the players on your team are: ");
		for (int i = 0;i<this.players.size(); i++) {
			temp = ((Account)players.get(i)).getFName();
			System.out.println(temp);
		}
	}
	
	

}
