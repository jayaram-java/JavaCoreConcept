package com.program.java.others;

class Player {

	int number;

	public void guess() {

		number = (int) (Math.random() * 10);

		System.out.println("Player guessed: " + number);

	}

	public int getGuess() {
		return number;
	}

}

class GuessGame {

	int targetNumber;

	Player player1;
	Player player2;
	Player player3;

	public GuessGame() {
		this.player1 = new Player();
		this.player2 = new Player();
		this.player3 = new Player();
	}

	public void startGame() {

		targetNumber = (int) (Math.random() * 10);

		System.out.println("Game generated number: " + targetNumber);

		player1.guess();
		player2.guess();
		player3.guess();

		boolean checkPlayer1 = player1.getGuess() == targetNumber;
		boolean checkPlayer2 = player2.getGuess() == targetNumber;
		boolean checkPlayer3 = player3.getGuess() == targetNumber;

		if (checkPlayer1 || checkPlayer2 || checkPlayer3) {

			System.out.println("Winner is");

			if (checkPlayer1) {

				System.out.println("Player 1 guessed correctly");

			} else if (checkPlayer2) {

				System.out.println("Player 2 guessed correctly");

			} else if (checkPlayer3) {

				System.out.println("Player 3 guessed correctly");

			}

		} else {
			System.out.println("No players guessed correctly. Try again!");
		}

	}

}

public class GameLauncher {

	public static void main(String[] args) {

		/*
		 * Player player1 = new Player();
		 * 
		 * Player player2 = new Player();
		 * 
		 * Player player3 = new Player();
		 * 
		 * GuessGame ob = new GuessGame(player1, player2, player3);
		 */
		
		GuessGame ob = new GuessGame();
		
		ob.startGame();
	
	}

}
