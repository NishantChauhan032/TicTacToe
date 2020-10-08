package com.capg.workshop.TicTacToe;

import java.util.Scanner;

public class TicTacToe {
   /**
    * UC1
    * @return
    */
	public static char[] board() {
		char[] myBoard = new char[10];
		for (int i = 0; i < 10; i++) {
			myBoard[i] = ' ';
		}
		return myBoard;
	}
   /**
    * UC2
    */
	public static char letter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player1,Please enter your choice(X/O):");
		char choice = sc.next().charAt(0);
		if (choice == 'X') 
			choice = 'X';
		else 
			choice = 'O';
		return choice;
	} 

	public static void main(String[] args) {
		board();
		letter();
	}
}
