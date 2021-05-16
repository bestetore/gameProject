package myGameProject.kodlamaio;

import myGameProject.kodlamaio.adapters.MernisServiceAdapter;
import myGameProject.kodlamaio.concretes.CustomerManager;
import myGameProject.kodlamaio.concretes.GameManager;
import myGameProject.kodlamaio.concretes.SalesCampaignManager;
import myGameProject.kodlamaio.concretes.SalesManager;
import myGameProject.kodlamaio.entities.Customer;
import myGameProject.kodlamaio.entities.Game;
import myGameProject.kodlamaio.entities.Sales;
import myGameProject.kodlamaio.entities.SalesCampaign;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1, "Beste", "Töre", 0000, "00000000000");
		
		
		Game game1 = new Game(1, "Cyberpunk 2077", 250, "Aksiyon");
		
		SalesCampaign salesCampaign1 = new SalesCampaign(1, "İlk alışveriş kampanyası", 30);
		
		Sales sales1 = new Sales(customer1, game1, 1);
		
		CustomerManager customerManager= new CustomerManager(new MernisServiceAdapter());
		customerManager.add(customer1);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		SalesCampaignManager salesCampaignManager = new SalesCampaignManager(); 
		salesCampaignManager.add(salesCampaign1);
		
		SalesManager salesManager = new SalesManager();
		salesManager.saleWithDiscount(customer1, game1, salesCampaign1);
		
		
		
		
		

	}

}
