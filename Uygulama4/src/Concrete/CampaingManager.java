package Concrete;

import Abstract.CampaignCheckService;
import Entities.Campaign;

public class CampaingManager implements CampaignCheckService {
	
	public void addCampaign(Campaign campaign) {
		
		System.out.println("Yeni Kampanya Eklendi." + campaign.getCampaingName() +" "+ "Kampanya �ndirim Oran� : " + campaign.getDiscountRate());
	}
	
	public void deleteCampaign(Campaign campaign) {
		
		System.out.println("Kampanya Kald�r�ld�." + campaign.getCampaingId() + campaign.getCampaingName());
	}
	
	public void updateCampaign(Campaign campaign) {
		
		System.out.println("Kampanya G�ncellenmi�tir." + campaign.getCampaingName() + " " + "Yeni �ndirim Oran� : " + campaign.getDiscountRate());
	}

}
