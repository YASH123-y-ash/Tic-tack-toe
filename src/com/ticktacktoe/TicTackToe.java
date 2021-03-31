package com.ticktacktoe;

import java.util.*;
public class TicTackToe {
	
	public static char[] board = new char[9];

	public static char playerSymbol;
	public static char computerSymbol;


	//for size of board
	public static void sizeOfBoard()
	{
		for(int i=0; i<board.length;i++)
		{
			board[i] = ' ';
		}
	}

	//choose between x or o
	public static void chooseXorO()
	{
		System.out.println("Choose x or o");
		Scanner sc = new Scanner(System.in);
		char chooseLetter = sc.next().charAt(0);
		while(chooseLetter != 'x' && chooseLetter != 'o')
		{
			System.out.println("select X or o");
			chooseLetter = sc.next().charAt(0);
		}
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
	
	public static void main(String[] args) {
	
		sizeOfBoard();
		chooseXorO();
	}
	
	  
}

