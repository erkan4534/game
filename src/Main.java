import com.controller.CampaignController;
import com.controller.GameController;
import com.controller.SalesController;
import com.model.Campaing;
import com.model.Gamer;
import com.service.*;

public class Main {

    public static void main(String[] args) {

        Gamer gamer = new Gamer();
        gamer.setId(10);
        gamer.setName("erkan");
        gamer.setSurname("yildirim");
        gamer.setBirthDate("04.01.1983");
        gamer.setIdentityNumber("34343534534");

        Campaing campaing = new Campaing();
        campaing.setId(1);
        campaing.setName("campaign-1");
        campaing.setDiscount(5);

        ICampaignService campaignService= new CampaignServiceImpl();
        CampaignController campaignController = new CampaignController(campaignService);
        campaignController.add(campaing);

        ISalesService salesService = new SalesServiceImpl();
        SalesController salesController = new SalesController(salesService,campaignService);
        salesController.sales(gamer,campaing);

        GameController gameController = new GameController(new GameServiceImpl(),new GovermentServiceImpl());
        gameController.add(gamer);
    }
}
