package myGameProject.kodlamaio.abstracts;

import myGameProject.kodlamaio.entities.Customer;
import myGameProject.kodlamaio.entities.Game;
import myGameProject.kodlamaio.entities.SalesCampaign;

public interface SalesService {
	void sale(Customer customer, Game game);
	void saleWithDiscount(Customer customer, Game game, SalesCampaign salesCampaign);
}

