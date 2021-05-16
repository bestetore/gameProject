package myGameProject.kodlamaio.entities;

import myGameProject.kodlamaio.abstracts.Entity;

public class Sales implements Entity{
	
	private Customer customer;
	private Game game;
	int id;
	

	public Sales() {}


	public Sales(Customer customer, Game game, int id) {
		super();
		this.customer = customer;
		this.game = game;
		this.id = id;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public Game getGame() {
		return game;
	}


	public void setGame(Game game) {
		this.game = game;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
}

