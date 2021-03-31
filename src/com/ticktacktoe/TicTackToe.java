package com.ticktacktoe;

public class TicTackToe {

	public static char[] board = new char[9];

	//for size of board
		public static void sizeOfBoard()
		{
			for(int i=0; i<board.length;i++)
			{
				board[i] = ' ';
			}
		}
	
	public static void main(String[] args) {
	
		sizeOfBoard();
		
	}
}