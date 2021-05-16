package myGameProject.kodlamaio.concretes;

import myGameProject.kodlamaio.abstracts.GameService;
import myGameProject.kodlamaio.entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi: " + game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi: " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi: " + game.getGameName());
		
	}

}
