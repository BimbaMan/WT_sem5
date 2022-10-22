package main;

import DAO.IApplianceDAO;
import DAO.impl.ApplianceDAOImpl;

public class Main {
    public Main(IApplianceDAO applianceDAO) {
        this.applianceDAO = applianceDAO;
    }

    private final IApplianceDAO applianceDAO;

    public static void main(String[] args){
//        Main main = new Main(new ApplianceDAOImpl(DBLoader.loadAllFromDB()));
//        main.applianceDAO.findAllAppliancesByType("Oven")
//                .forEach(appliance -> System.out.println("appliance = " + appliance));
//        System.out.println(main.applianceDAO.findCheapest());
    }
}
