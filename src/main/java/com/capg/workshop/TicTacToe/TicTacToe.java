package com.capg.workshop.TicTacToe;

public class TicTacToe {

	public static char[] board() {
		char[] myBoard = new char[10];
		for (int i = 0; i < 10; i++) {
			myBoard[i] = ' ';
		}
		return myBoard;
	}

	public static void main(String[] args) {
		board();
	}
}
