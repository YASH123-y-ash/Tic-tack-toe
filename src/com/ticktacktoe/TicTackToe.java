package com.ticktacktoe;
import java.util.*;
public class TicTackToe {

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
	
		System.out.println("Tic tac toe");
		char[] gameBoard = new char[10];
		for(int i = 0 ;i < gameBoard.length ; i++)
		{
			gameBoard[i] = ' ';
		}
		char input = chooseXorO();
	}
}

