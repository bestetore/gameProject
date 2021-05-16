package myGameProject.kodlamaio.concretes;

import myGameProject.kodlamaio.abstracts.SalesCampaignService;
import myGameProject.kodlamaio.entities.SalesCampaign;

public class SalesCampaignManager implements SalesCampaignService{

	@Override
	public void add(SalesCampaign salesCampaign) {
		System.out.println("Satış kampanyası eklendi: "
	    + salesCampaign.getSalesCampaignName() + " indirim oranı:  ½" 
		+ salesCampaign.getDiscount());
		
	}

	@Override
	public void delete(SalesCampaign salesCampaign) {
		System.out.println("Satış kampanyası silindi: "
			    + salesCampaign.getSalesCampaignName() + " indirim oranı:  ½" 
				+ salesCampaign.getDiscount());
				
		
	}

	@Override
	public void update(SalesCampaign salesCampaign) {
		System.out.println("Satış kampanyası güncellendi: "
			    + salesCampaign.getSalesCampaignName() + " indirim oranı:  ½" 
				+ salesCampaign.getDiscount());
		
	}

}
