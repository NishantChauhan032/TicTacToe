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
	public static void displayBoard(char[] myBoard) {
		System.out.println(" "+ myBoard[1] +" | "+ myBoard[2] +" | "+ myBoard[3]);
		System.out.println("------------");
		System.out.println(" "+ myBoard[4] +" | "+ myBoard[5] +" | "+ myBoard[6]);
		System.out.println("------------");
		System.out.println(" "+ myBoard[7] +" | "+ myBoard[8] +" | "+ myBoard[9]);
	}

	public static void main(String[] args) {
		char[] myBoard=board();
		letter();
		displayBoard(myBoard);	  
	}
}
