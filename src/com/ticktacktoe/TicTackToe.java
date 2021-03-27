package com.ticktacktoe;

public class TicTackToe {

	public static void main(String[] args) {
	
		System.out.println("Tic tac toe");
		char[] gameBoard = new char[10];
		for(int i = 0 ;i < gameBoard.length ; i++)
		{
			gameBoard[i] = ' ';
		}
	}
}