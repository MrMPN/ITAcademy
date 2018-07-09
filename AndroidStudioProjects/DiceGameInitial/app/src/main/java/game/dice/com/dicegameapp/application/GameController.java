package game.dice.com.dicegameapp.application;

import java.util.List;
import game.dice.com.dicegameapp.domain.*;


public class GameController {

	//Sole instance of the Singleton
	private static GameController soleInstance;

	private Player player;

	//Private constructor
	private GameController() {}

	public static GameController getInstance(){
		if (soleInstance == null){
			soleInstance = new GameController();
		}
		return soleInstance;
	}

	public void createPlayer(String name) {
		this.player = new Player(name);
	}

	public String getPlayerName() {
		return player.getName();
	}

	public boolean playGame() {
		Game game = new Game();
		boolean hasWon = game.playGame();
		player.addGame(game);
		return hasWon;
	}

	public String getPlayerGamesToString() {
		String text = "";
		List<Game> games = player.getAllGames();

		for (Game game : games) {
			text += "SUMA: " + game.getSumDices() + " RESULTAT: " + game.hasWon();
		}
		return text;
	}

	public double getPlayerRanking() {
		List<Game> games = player.getAllGames();

		double wins = 0.0;
		for (Game game : games) {
			if (game.hasWon())
				wins++;
		}
		return wins / games.size();
	}

}
