package com.ticktacktoe;
import java.util.*;

/*
@description: created a class to play tic tac toe game
@parameter: taken method showBoard() to show the game board  
 */

public class TicTackToe {


	static char playerSymbol;
	static char computerSymbol;
	static Scanner sc = new Scanner(System.in);

	//  Creating an empty Board 
	public static char[] createEmptyBoard() 
	{
		char[] board = new char[9];
		for (int i = 1; i < board.length; i++) 
		{
			board[i] = ' ';
		}
		return board;
	}

	// Taking Input from player to choose between X or O 
	public static char chooseXorO() {
		System.out.println("Enter the symbol:'X' or 'O' ");
		char symbol = Character.toUpperCase(sc.next().charAt(0));
		if (symbol == 'X' || symbol == 'O') {
			playerSymbol(symbol);
			return symbol;
		} else {
			System.out.println("Invalid Character. Try Again.");
			return chooseXorO();
		}
	}

	// Determine letter for player and computer 
	public static void playerSymbol(char playerSymbols) {

		if(playerSymbols == 'X')
		{
			playerSymbol = 'X';
			computerSymbol = 'O';
		}
		else if(playerSymbols == 'O')
		{
			playerSymbol = 'O';
			computerSymbol = 'X';
		}
		System.out.println("player letter to play is "+playerSymbol);
		System.out.println("computer letter to play is "+computerSymbol);

	}

	//showing empty Board 
	public static void showBoard(char[] board)
	{
		System.out.println("--------------");
		System.out.println("|  " +board[0]+ " | "+board[1] + " | "+board[2]+ " | ");
		System.out.println("--------------");
		System.out.println("|  " +board[3]+ " | "+board[4] + " | "+board[5]+ " | ");
		System.out.println("--------------");
		System.out.println("|  " +board[6]+ " | "+board[7] + " | "+board[8]+ " | ");
		System.out.println("--------------");
	}

	public static void main(String[] args) {

		char[] board = createEmptyBoard();
		playerSymbol = chooseXorO();
		showBoard(board);
	}

}

