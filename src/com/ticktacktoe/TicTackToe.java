package com.ticktacktoe;

/*
@description: created a class to play tic tack toe game

@parametrs: taken a method whoPlaysFirst() to choose who plays first

 */

import java.util.Scanner;

public class TicTackToe {

	static final int HEAD = 1, TAIL = 0;
	static String lastPlayed; 
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

	// Determine letter for player and computer to play game 
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

	//to choose desired location in a board
	public static void chooseLocatin(char [] board)
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
	}

	//to take player move
	public static void movePlayer(char[] board) {
		System.out.print("Enter the index you want to move to: ");
		int index = sc.nextInt();
		while (index < 0 || index > 8) {
			System.out.print("Wrong Input. Try Again : ");
			index = sc.nextInt();
		}
		if (board[index] == ' ') {
			board[index] = playerSymbol;
			showBoard(board);
		} else {
			System.out.println("Index not available. Choose another");
			movePlayer(board);
		}	
	}

	// toss to who plays first
	public static void toss(char[] board) {
		int toss = (int) (Math.random() * 2 % 2);
		if (toss == HEAD) {
			System.out.println("Player Wins the Toss.");
			lastPlayed = "Player";
			movePlayer(board);						
		}else {
			System.out.println("Computer Wins the Toss.");
			lastPlayed = "Computer";
			
		}
	}


	public static void main(String[] args) {

		char[] board = createEmptyBoard();
		playerSymbol = chooseXorO();
		showBoard(board);
		chooseLocatin(board);
		toss(board);
	}
}




