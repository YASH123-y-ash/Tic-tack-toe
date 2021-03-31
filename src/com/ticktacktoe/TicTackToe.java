package com.ticktacktoe;

public class TicTackToe{

	public static char[] board = new char[9];

	//  Creating an empty Board 
	public static char[] createEmptyBoard() 
	{
		char[] board = new char[10];
		for (int i = 1; i < board.length; i++) 
		{
			board[i] = ' ';
		}
		return board;
	}

	public static void main(String[] args) {

		char[] board = createEmptyBoard(); 

	}
}