package com.ticktacktoe;

/*
@description: created a class to play tic tack toe game

@parametrs: taken a method chooseLocation() to choose desire location

 */

import java.util.Scanner;

public class TicTackToe {

	public static char[] board = new char[9];

	public static char playerSymbol;
	public static char computerSymbol;
	public static int turn;

	private static Object elseif;

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
	
	//to choose desired location in a board
	public static void chooseLocatin()
	{	
		System.out.println("check the index you want to play");
		Scanner sc1 = new Scanner(System.in);
		int location = sc1.nextInt();
		while(location > 8 || location < 0)
		{
			System.out.println("enter the valid index to make move");
			location = sc1.nextInt();
		}
		if(location >= 0 && location <= 8) {
			switch(location)
			{
			case 0:
				if(board[location] == ' ')
					System.out.println("index is free you can make your move");
				else
					System.out.println("index is not free try another location");
				break;
			case 1:
				if(board[location] == ' ')
					System.out.println("index is free you can make your move");
				else
					System.out.println("index is not free try another location");
				break;
			case 2:
				if(board[location] == ' ')
					System.out.println("index is free you can make your move");
				else
					System.out.println("index is not free try another location");
				break;
			case 3:
				if(board[location] == ' ')
					System.out.println("index is free you can make your move");
				else
					System.out.println("index is not free try another location");
				break;
			case 4:
				if(board[location] == ' ')
					System.out.println("index is free you can make your move");
				else
					System.out.println("index is not free try another location");
				break;
			case 5:
				if(board[location] == ' ')
					System.out.println("index is free you can make your move");
				else
					System.out.println("index is not free try another location");
				break;
			case 6:
				if(board[location] == ' ')
					System.out.println("index is free you can make your move");
				else
					System.out.println("index is not free try another location");
				break;
			case 7:
				if(board[location] == ' ')
					System.out.println("index is free you can make your move");
				else
					System.out.println("index is not free try another location");
				break;
			case 8:
				if(board[location] == ' ')
					System.out.println("index is free you can make your move");
				else
					System.out.println("index is not free try another location");
				break;
			}
		}
		else
			System.out.println("invalid index try again");

	}

	// to show borad
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
		chooseLocatin();
	}
}

