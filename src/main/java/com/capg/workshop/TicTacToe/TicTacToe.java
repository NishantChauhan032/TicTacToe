package com.capg.workshop.TicTacToe;

import java.util.Scanner;

public class TicTacToe {
	static char[] myBoard;
    static Scanner sc = new Scanner(System.in);
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
	public static int indexSelect() {
		Scanner a = new Scanner(System.in);
		System.out.println("Please select your position to move(1 to 9): ");
		int i=a.nextInt();
		while(true) {
			if(myBoard[i]!=' ') {
				System.out.println("Position already filled.Please choose another position");
			}else {
				break;
			}
		}
			return i;
		
	}
	public static boolean freeSpace(char[] myBoard,int i) {
		if( myBoard[i] == ' ') 
			return true;
		else 
			return false;
	}

	public static void main(String[] args) {
		char[] myBoard=board();
		letter();
		displayBoard(myBoard);	
		indexSelect();
		
		
	}
}
