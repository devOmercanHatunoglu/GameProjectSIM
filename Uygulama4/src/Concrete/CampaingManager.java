package Concrete;

import Abstract.CampaignCheckService;
import Entities.Campaign;

public class CampaingManager implements CampaignCheckService {
	
	public void addCampaign(Campaign campaign) {
		
		System.out.println("Yeni Kampanya Eklendi." + campaign.getCampaingName() +" "+ "Kampanya Ýndirim Oraný : " + campaign.getDiscountRate());
	}
	
	public void deleteCampaign(Campaign campaign) {
		
		System.out.println("Kampanya Kaldýrýldý." + campaign.getCampaingId() + campaign.getCampaingName());
	}
	
	public void updateCampaign(Campaign campaign) {
		
		System.out.println("Kampanya Güncellenmiþtir." + campaign.getCampaingName() + " " + "Yeni Ýndirim Oraný : " + campaign.getDiscountRate());
	}

}
