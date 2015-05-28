package fr.iutvalence.farisbhectorb.java.model;

import java.util.Scanner;

public class User {
	
	public void currentPlayer(Player currentPlayer){
		System.out.format("%s's round ! ", currentPlayer);
	}
	
	public void displayGrid(Grid grid){
		System.out.println(grid);
	}
	
	public void columnProblem(){
		System.err.println("Insert an other column, the selected column is out of range !");
	}
	
	public void fullColumn(){
		System.err.println("Insert an other column, the selected column is full !");
	}
	
	public void inputColumn(){
		System.out.println("Insert a column ranged between 0 and 6 !");
	}
	
	public Scanner scanner(){
		Scanner scanner = new Scanner(System.in);
		return scanner;

	}
	
	public int nextInt(Scanner scanner){
		return scanner.nextInt();
	}
	
}
