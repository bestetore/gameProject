package myGameProject.kodlamaio.concretes;

import myGameProject.kodlamaio.abstracts.SalesService;
import myGameProject.kodlamaio.entities.Customer;
import myGameProject.kodlamaio.entities.Game;
import myGameProject.kodlamaio.entities.SalesCampaign;

public class SalesManager implements SalesService{
	
	private double discount;
	private double gamePrice;
	
	@Override
	public void sale(Customer customer, Game game) {
		System.out.println(game.getGameName() + " isimli oyun " 
	    + customer.getFirstName() + " tarafından satın alındı "
	    +" oyun fiyatı: " + gamePrice);
	}
	
	
	@Override
	public void saleWithDiscount(Customer customer, Game game, SalesCampaign salesCampaign) {
		gamePrice= game.getGamePrice();
		discount= salesCampaign.getDiscount();
		gamePrice = gamePrice - (gamePrice*(discount/100));
		System.out.println(game.getGameName() + " isimli oyun " 
		+ customer.getFirstName() + " tarafından satın alındı " 
		+ " oyun fiyatı: " + gamePrice);
	}

	
}