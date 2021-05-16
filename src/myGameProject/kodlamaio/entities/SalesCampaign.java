package myGameProject.kodlamaio.entities;

import myGameProject.kodlamaio.abstracts.Entity;

public class SalesCampaign implements Entity{
	
	private int id;
	private String salesCampaignName;
	private double discount;
	
	public SalesCampaign() {}
	
	public SalesCampaign(int id, String salesCampaignName, double discount) {
		super();
		this.id = id;
		this.salesCampaignName = salesCampaignName;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSalesCampaignName() {
		return salesCampaignName;
	}

	public void setSalesCampaignName(String salesCampaignName) {
		this.salesCampaignName = salesCampaignName;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}

