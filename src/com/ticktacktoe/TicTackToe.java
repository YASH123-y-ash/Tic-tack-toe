package com.ticktacktoe;
import java.util.*;
public class TicTackToe {

	static String[] board;
	static void printBoard()
    {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | "
                           + board[1] + " | " + board[2]
                           + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | "
                           + board[4] + " | " + board[5]
                           + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | "
                           + board[7] + " | " + board[8]
                           + " |");
        System.out.println("|---|---|---|");
    }

	static char chooseXorO()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("select X or o");
		char ch1 = sc.next().charAt(0);
		
		while(ch1 != 'x' && ch1 != 'o')
		{
			System.out.println("select X or o");
			ch1 = sc.next().charAt(0);
		}
		return ch1;
	}
	
	public static void main(String[] args) {
		System.out.println("welcome to Tic tac toe game");
				char input = chooseXorO();
				 board = new String[9];
			  
			        String winner = null;
				for (int a = 0; a < 9; a++) {
		            board[a] = String.valueOf(a + 1);
		        }
		  
			        System.out.println("Welcome to 3x3 Tic Tac Toe.");
			        printBoard();
			  
	}
	
	  
}

