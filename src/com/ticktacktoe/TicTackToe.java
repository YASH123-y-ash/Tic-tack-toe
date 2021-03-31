package com.ticktacktoe;
import java.util.*;

/*
@description: created a class to play tic toe game
@parameter: taken method showBoard to show the game board  
 */

public class TicTackToe {


	public static char[] board = new char[9];

	public static char playerSymbol;
	public static char computerSymbol;
	public static int turn;

	private static Object elseif;

	//to initialize empty space to game board
	public static void sizeOfBoard()
	{
		for(int i=0; i<board.length;i++)
		{
			board[i] = ' ';
		}
	}

	//to choose between x and o
	public static void chooseXorO()
	{
		System.out.println("Choose x or o");
		Scanner sc = new Scanner(System.in);
		char chooseLetter = sc.next().charAt(0);
		if(chooseLetter == 'x')
		{
			System.out.println("player symbol to play the game is : "+chooseLetter);
			System.out.println("computer symbol to play the game is : "+ "o");

			playerSymbol = 'x';

		}
		else if(chooseLetter == 'o')
		{
			System.out.println("computer symbol to play the game is : "+chooseLetter);
			System.out.println("player symbol to play the game is : "+"x");

			computerSymbol = 'o';

		}
		else
			System.out.println("invalid input choose between x or o");
	}


	//to show game board
	public static void showBoard()
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

		sizeOfBoard();
		chooseXorO();
		showBoard();
	}
}
